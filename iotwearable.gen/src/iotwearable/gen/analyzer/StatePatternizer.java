package iotwearable.gen.analyzer;

import iotwearable.gen.analyzer.StatePattern.StatePatternType;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateFrame;

/**
 * 
 * A class for reading a input StateControl  and determines its context,
 * from which return the {@link StatePattern}.
 *
 */
public class StatePatternizer {
	/**
	 * Analyzes the node and its context to determine the StatePattern.
	 * @param node : {@link StateControl}
	 * @return Return {@link StatePattern} or null.
	 */
	public  StatePattern patternize(StateControl node){
		if(isSFPattern(node)){
			StatePattern pattern = new StatePattern(StatePatternType.S_F);
			pattern.getItems().add(node);
			return pattern;
		}
		if(isFFPattern(node)){
			StatePattern pattern = new StatePattern(StatePatternType.F_F);
			pattern.getItems().add(node);
			return pattern;
		}
		return null;
	}
	// SF: StartPoint->StateFrame
	private boolean isSFPattern(StateControl node){
		for(Connection conn : node.getIncomings()){
			if(conn.getSource() instanceof StartPoint)
				return true;
		}
		return false;
	}
	//FF: StateFrame->StateFrame
	private boolean isFFPattern(StateControl node){
		for(Connection conn : node.getIncomings()){
			if(!(conn.getSource() instanceof StateFrame))
				return false;
		}
		return true;
	}
}