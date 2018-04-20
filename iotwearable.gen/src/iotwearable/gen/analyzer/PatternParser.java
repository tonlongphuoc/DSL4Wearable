package iotwearable.gen.analyzer;

import iotwearable.gen.CodeWriter;
import iotwearable.gen.generator.TemplateCodeGenerator;
import iotwearable.gen.generator.StateFrameGenerator;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateFrame;

import java.util.Map;

public abstract class PatternParser {
	protected Mainboard mainboard;
	protected StateFrame node;
	protected int index = -1;
	protected String src = "";
	protected Map<StateControl, Integer> indexMap;

	public PatternParser(StatePattern pattern, Mainboard mainboard,
			String src, Map<StateControl, Integer> indexMap) {
		this.mainboard = mainboard;
		this.node = (StateFrame) pattern.getItems().get(0);
		this.index = indexMap.get(node) != null ? indexMap.get(node) : -1;
		this.src = src;
		this.indexMap = indexMap;
	}
	
	public String generateFuncPrototype() {
		if(node instanceof StateFrame){
			if(indexMap.get(node) != null){
				String des = "\n" + "currentState = " + indexMap.get(node) + " : " + node.getName();
				if(!src.contains(des))
					src = CodeWriter.write(src, des, CodeWriter.desState);
			}
			String content = StateFrameGenerator.generateFuncPrototype(node);
			content = content.replace("<return_type>", "void");
			content = content.replace("<parameters>", "");
			src = CodeWriter.write(src, content, CodeWriter.funcPrototype);
		}
		return src;
	}
	
	public String generateFuncImpl() {
		String content = "";
		if(node instanceof StateFrame){
			content = StateFrameGenerator.generateFuncImpl(node);
			
			String condition = indexMap.get(node) == 0? "currentState == 0" : "";
			if(node.getIncomings() != null){
				for(Connection conn : node.getIncomings()){
					//set condition follow current state
					if(conn.getSource() instanceof StateFrame){
						if(condition.isEmpty())
							condition += "currentState == " + indexMap.get((StateControl)conn.getSource());
						else
							condition += "|| currentState == " + indexMap.get((StateControl)conn.getSource());
					}
				}
				
			}
			if(!condition.isEmpty()){
				content = content.replace("<condition>", condition);
			}
			
			
			//set the currentState
			if (index != -1) {
				content = content.replace("<index>", index + "");
			}
			content = content.replace("<return_type>", "void");
			content = content.replace("<parameters>", "");
			
			//generate code with content of the state frame
			if (node.getContent() != null) {
				if(!node.getContent().isEmpty()){
					String[] commands = node.getContent().split("\n");
					if (commands != null) {
						if (commands.length > 0) {
							for (String command : commands) {
								if (command != null) {
									if (!command.isEmpty()) {
										CommandParser commandParser = new CommandParser();
										String _command = commandParser.parse(command, mainboard);
										if(!_command.isEmpty()){
											content = content.replaceAll("<"+command.trim()+">", _command);
										}
										else{
											SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer();
											String name = sentenceAnalyzer.analyze(command);
											if(!name.isEmpty()){
												content = content.replace("<"+command.trim()+">",
														TemplateCodeGenerator.generateInvokenMethod()
														.replace("<name>", name)
														.replace("<parameters>", ""));
												String _prototype = TemplateCodeGenerator.generateMethodPrototype()
														.replace("<return_type>", "void")
														.replace("<name>", name)
														.replace("<parameters>", "");
												if(!src.contains(_prototype)){
													src = CodeWriter.write(src, _prototype, CodeWriter.funcPrototype);
													_prototype = _prototype.replace(";", "{\n\n}");
													src = CodeWriter.write(src, _prototype, CodeWriter.funcImpl);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			if(node.getOutgoings() != null){
				for(Connection conn : node.getOutgoings()){
					EventAnalyzer eventAnalyzer
					= new EventAnalyzer(src, node, conn, mainboard);
					src = CodeWriter.write(src, eventAnalyzer.parse(conn.getLabel().trim()), CodeWriter.funcLoop);
				}
			}
		}//--
		src = CodeWriter.write(src, content, CodeWriter.funcSetState);
		return src;
	}
}
