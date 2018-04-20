package iotwearable.gen.analyzer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;


/*
 * 1. Define start point
 * 2. Get the node connected to the start point.
 * A node is an entity in the state schema. It is the center of the
 * state pattern and in the process generated code.
 * 3. Specifies the nodes in the schema and assigns the index to each node.
 * 4. Analyze each node in the queue qNodes.
 * 		- Analyze a node to give out its pattern type.
 * 		- Pattern parse
 */
/**
 * Analysis of the states in state schema.
 */
public class StateSchemaAnalyzer {
	private StateSchema schema;
	private Mainboard mainboard;
	private Queue<StateControl> qNodes;
	private Map<StateControl, Integer> indexMap;
	private StateControl currentNode;
	private StatePatternizer patternizer;
	
	public  StateSchemaAnalyzer(StateSchema schema, Mainboard mainboard){
		this.schema = schema;
		this.mainboard = mainboard;
		this.qNodes = new LinkedList<StateControl>();
		this.indexMap = new HashMap<StateControl, Integer>();
		this.currentNode = null;
		this.patternizer = new StatePatternizer();
	};
	/**
	 * Analysis of the states in state schema.
	 * @param src
	 * @return src has been changed
	 */
	public String analyze(String src){
		StateControl node = (StateControl)getStartPoint(schema).getOutgoings().get(0).getTarget();
		if(node == null){
			return src;
		}
		
		int index = 0;
		Queue<StateControl> qTemp = new LinkedList<StateControl>();
		qTemp.add(node);
		//Specifies the nodes in the schema and assigns the index to each node
		while(!qTemp.isEmpty()){
			StateControl nodeTemp = qTemp.poll();
			if(nodeTemp != null){
				qNodes.add(nodeTemp);
				indexMap.put(nodeTemp, index);
				index++;
				if(nodeTemp.getOutgoings() != null){
					for(Connection conn : nodeTemp.getOutgoings()){
						if((StateControl)conn.getTarget() instanceof StateFrame){
							if(!qNodes.contains((StateControl)conn.getTarget()))
								qTemp.add((StateControl)conn.getTarget());
						}
					}
				}
				nodeTemp = null;
			}
		}
		//Analyze each node in the queue qNodes
		while(!qNodes.isEmpty()){
			currentNode = qNodes.poll();
			//Analyze a node to give out its pattern type.
			StatePattern pattern = patternizer.patternize(currentNode);
			if(pattern != null){
				src = StatePatternParser.parse(pattern, src, mainboard, indexMap);
			}
		}
		return src;
	}
	
	private StartPoint getStartPoint(StateSchema schema){
		for(StateControl control : schema.getControls()){
			if(control instanceof StartPoint)
				return (StartPoint)control;
		}
		return null;
	}
}