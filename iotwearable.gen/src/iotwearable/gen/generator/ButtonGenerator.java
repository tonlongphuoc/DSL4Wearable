package iotwearable.gen.generator;

import iotwearable.gen.analyzer.Token;
import iotwearable.model.iotw.Button;

import java.util.List;

public class ButtonGenerator extends DevicesGenerator{
	private Button button;

	public ButtonGenerator(Button button) {
		super();
		this.button = button;
	}
	@Override
	public String generateInclude() {
		return "";
	}

	@Override
	public String generateDefine() {
		String content = "/*Define buzzer - "+button.getId()+" output*/\n";
		content += "const int " + button.getId()+" = "+button.getMainboard().findPin(button.getPinConnecteds().get(0)).getName()+";";
		return content;
	}

	@Override
	public String generateSetupFuncSetup() {
	
		return "";
	}

	@Override
	public String generateSetupFuncLoop() {
		return "";
	}

	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		return "";
	}

}
