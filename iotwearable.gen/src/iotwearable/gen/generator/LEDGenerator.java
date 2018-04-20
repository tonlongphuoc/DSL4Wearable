package iotwearable.gen.generator;

import java.util.List;

import iotwearable.gen.analyzer.Token;

public abstract class LEDGenerator extends DevicesGenerator{

	@Override
	public String generateInclude() {
		return "";
	}
	
	@Override
	public String generateDefine() {
		String content = "/*Define LED - <id> output*/\n";
		content += "const int <id> = <pin>;";
		return content;
	}

	@Override
	public String generateSetupFuncSetup() {
		return "pinMode(<id>, OUTPUT);";
	}

	@Override
	public String generateSetupFuncLoop() {
		return "";
	}

	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		String code = "";
		if(syntax.equals("Display <id>")){
			code = "digitalWrite("+tokens.get(1).instance+", HIGH);";
		}
		else if(syntax.equals("Hidden <id>")){
			code = "digitalWrite("+tokens.get(1).instance+", LOW);";
		}
		else if(syntax.equals("Blink <id>")){
			code = "digitalWrite("+tokens.get(1).instance+", HIGH);"
					+ "\ndelay(1000);"
					+ "\ndigitalWrite("+tokens.get(1).instance+", LOW);"
					+ "\ndelay(1000);";
		}
		return code;
	}
}