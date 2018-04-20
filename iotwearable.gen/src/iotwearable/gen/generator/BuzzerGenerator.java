package iotwearable.gen.generator;

import java.util.List;

import iotwearable.gen.analyzer.Token;
import iotwearable.model.iotw.Buzzer;
/**
 * 
 * Class generate code for Buzzer device.
 *
 */
public class BuzzerGenerator extends DevicesGenerator{
	private Buzzer buzzer;
	
	public BuzzerGenerator(Buzzer buzzer) {
		super();
		this.buzzer = buzzer;
	}
	
	@Override
	public String generateDefine() {
		String content = "/*Define buzzer - "+buzzer.getId()+" output*/\n";
		content += "const int " + buzzer.getId()+" = "+buzzer.getMainboard().findPin(buzzer.getPinConnecteds().get(0)).getName()+";";
		return content;
	}
	@Override
	public String generateInclude() {
		return "";
	}
	@Override
	public String generateSetupFuncSetup() {
		return "pinMode("+buzzer.getId()+", OUTPUT);";
	}
	@Override
	public String generateSetupFuncLoop() {
		return "";
	}
	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		String code = "";
		if(syntax.equals("Beep <id>")){
			code = "analogWrite("+tokens.get(1).instance+", 20);"
					+ "\ndelay(50);"
					+ "\nanalogWrite("+tokens.get(1).instance+", 0);"
					+ "\ndelay(50);";
		}
		return code;
	}
}