package iotwearable.gen.analyzer;

import java.util.Map;

import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateControl;

public class FFPatternParser extends PatternParser{

	public FFPatternParser(StatePattern pattern, Mainboard mainboard,
			String src, Map<StateControl, Integer> indexMap) {
		super(pattern, mainboard, src, indexMap);
	}

	public String parse() {
		src = generateFuncPrototype();
		src = generateFuncImpl();
		return src;
	}
}