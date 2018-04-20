package iotwearable.gen.generator;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.utilities.LibraryNameUtil;

import java.util.List;

public abstract class KeypadGenerator extends DevicesGenerator{
	@Override
	public String generateInclude() {
		return createInclude(LibraryNameUtil.Keypad);
	}
	@Override
	public String generateDefine() {
		String content = "/*Define kepad4x4 - <id>\n"
					+ "<descriptionKey>"
					+ "*/\n";
		content += "char <id>_keys[<row>][<col>] ={<keys>};\n";
		content += "byte <id>_rowPins[<row>] = {<rowPins>};\n"
				+ "byte <id>_columnPins[<col>] = {<columnPins>};\n";
		content += "Keypad <id> = Keypad(makeKeymap(<id>_keys), <id>_rowPins, <id>_columnPins, <row>, <col>);";
		return content;
	}
	@Override
	public String generateSetupFuncSetup() {
		return "";
	}
	@Override
	public String generateSetupFuncLoop() {
		return "char <id>ClientKey = <id>.getKey();";
	}
	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		String code = "";
		if (syntax.equals("<String> button pressed")) {
			code = "if(<id>ClientKey == <key>){\n"
					+ "<content>"
					+ "\n}";
		}
		return code;
	}
}