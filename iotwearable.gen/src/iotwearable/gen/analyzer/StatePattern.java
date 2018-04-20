package iotwearable.gen.analyzer;

import iotwearable.model.iotw.StateControl;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * A {@link StatePattern} includes a {@link StatePatternType}.
 * A list of {@link StateControl} in order, each {@link StateControl} being part of a {@link StatePattern} instance.
 *
 */
public class StatePattern {
	private  StatePatternType type;
	private  List <StateControl> items;
	
	public StatePattern(StatePatternType type) {
		this.type = type;
		this.items = new ArrayList<StateControl>();
	}
	
	public StatePattern( StatePatternType type, List <StateControl> items) {
		this.type = type;
		this.items = items;
	}
	public StatePatternType getType() {
		return type;
	}
	public List<StateControl> getItems() {
		return items;
	}
	public enum StatePatternType{
		/**
		 * StartPoint->StateFrame
		 */
		S_F,
		/**
		 * StateFrame->StateFrame
		 */
		F_F,
	}
}