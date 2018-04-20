package iotwearable.gen.generator;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.utilities.LibraryNameUtil;

import java.util.List;

public abstract class I2CLCD extends DevicesGenerator{
	@Override
	public String generateInclude() {
		return createInclude(LibraryNameUtil.LiquidCrystal_I2C);
	}
	@Override
	public String generateDefine() {
		String content = "/*Define LiquidCrystal_I2C - <id> */\n";
		content += "LiquidCrystal_I2C <id>(0x3F, <width>, <height>);" ;
		return content;
	}
	@Override
	public String generateSetupFuncSetup() {
		return "<id>.begin();\n"
				+ "<id>.backlight();";
	}

	@Override
	public String generateSetupFuncLoop() {
		return "";
	}
	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		String code = "";
		if(syntax.equals("Show <String>")){
			code = "<id>.print("+tokens.get(1).instance+");";
		}
		if(syntax.equals("Blink <id>")){
			code = "<id>.blink();";
		}
		return code;
	}
}