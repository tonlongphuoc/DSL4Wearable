package iotwearable.gen.analyzer;

import java.util.Map;

import iotwearable.gen.analyzer.StatePattern.StatePatternType;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateControl;

/**
 * 
 * A class analyzes a StatePattern input.
 *
 */
public class StatePatternParser {
	/**
	 * A class analyzes a StatePattern input and write result code into src, index is the number
	 * current of node (State of the application)
	 * @param pattern
	 * @param src
	 * @param mainboard
	 * @param indexMap
	 * @return
	 */
	public static String parse(StatePattern pattern, String src, Mainboard mainboard, Map<StateControl, Integer> indexMap){
		if(pattern.getType().equals(StatePatternType.S_F)){
			SFPatternParser patternParser = new SFPatternParser(pattern, mainboard, src, indexMap);
			return patternParser.parse();
		}
		else if(pattern.getType().equals(StatePatternType.F_F)){
			FFPatternParser patternParser = new FFPatternParser(pattern, mainboard, src, indexMap);
			return patternParser.parse();
		}
		return src;
	}
}