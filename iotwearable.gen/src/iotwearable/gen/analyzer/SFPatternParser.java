package iotwearable.gen.analyzer;

import java.util.Map;

import iotwearable.gen.CodeWriter;
import iotwearable.gen.generator.StateFrameGenerator;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateControl;

public class SFPatternParser extends PatternParser{
	public SFPatternParser(StatePattern pattern, Mainboard mainboard,
			String src, Map<StateControl, Integer> indexMap) {
		super(pattern, mainboard, src, indexMap);
	}

	public String parse() {
		src = generateFuncPrototype();
		src = generateFuncImpl();
		String setup = StateFrameGenerator.setState(node);
		setup = setup.replace("<parameters>", "");
		src = CodeWriter.write(src, setup, CodeWriter.funcSetup);
		return src;
	}
}