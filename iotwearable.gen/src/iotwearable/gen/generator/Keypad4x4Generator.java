package iotwearable.gen.generator;

import java.util.List;

import iotwearable.gen.analyzer.Token;
import iotwearable.model.iotw.Keypad4x4;

public class Keypad4x4Generator extends KeypadGenerator {
	private Keypad4x4 keypad;

	public Keypad4x4Generator(Keypad4x4 keypad) {
		this.keypad = keypad;
	}

	@Override
	public String generateDefine() {
		String content = super.generateDefine();
		content = content.replaceAll("<id>", keypad.getId());
		String desKey = descriptionKey();
		if(!desKey.isEmpty()){
			content = content.replaceAll("<descriptionKey>", desKey);
		}
		else{
			content = content.replaceAll("<descriptionKey>", "");
		}
		String pin1 = keypad.getMainboard().findPin(keypad.getPin1()).getName();
		String pin2 = keypad.getMainboard().findPin(keypad.getPin2()).getName();
		String pin3 = keypad.getMainboard().findPin(keypad.getPin3()).getName();
		String pin4 = keypad.getMainboard().findPin(keypad.getPin4()).getName();
		String pin5 = keypad.getMainboard().findPin(keypad.getPin5()).getName();
		String pin6 = keypad.getMainboard().findPin(keypad.getPin6()).getName();
		String pin7 = keypad.getMainboard().findPin(keypad.getPin7()).getName();
		String pin8 = keypad.getMainboard().findPin(keypad.getPin8()).getName();
		content = content.replaceAll("<row>", keypad.getRows()+"");
		content = content.replaceAll("<col>", keypad.getCols()+"");
		content = content.replaceAll("<keys>", keypad.getKeys());
		content = content.replaceAll("<rowPins>", pin1 + "," + pin2 + "," + pin3 + "," + pin4);
		content = content.replaceAll("<columnPins>", pin5 + "," + pin6 + "," + pin7 + "," + pin8);
		return content;
	}
	
	@Override
	public String generateSetupFuncLoop() {
		return super.generateSetupFuncLoop()
				.replaceAll("<id>", keypad.getId());
	}
	
	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		String content = super.generateCommand(syntax, tokens);
		if(content.contains("<id>")){
			content = content.replaceAll("<id>", keypad.getId());
		}
		content = content.replace("<key>","\'"+ keypad.getButton(tokens.get(0).instance.replaceAll("\"", ""))+"\'");
		return content;
	}
	
	private String descriptionKey(){
		String desKey = "";
		if(!keypad.getNameButton0().isEmpty()){
			desKey += "Button 0 : " + keypad.getNameButton0()+"\n";
		}
		if(!keypad.getNameButton1().isEmpty()){
			desKey += "Button 1 : " + keypad.getNameButton1()+"\n";
		}
		if(!keypad.getNameButton2().isEmpty()){
			desKey += "Button 2 : " + keypad.getNameButton2()+"\n";
		}
		if(!keypad.getNameButton3().isEmpty()){
			desKey += "Button 3 : " + keypad.getNameButton3()+"\n";
		}
		if(!keypad.getNameButton4().isEmpty()){
			desKey += "Button 4 : " + keypad.getNameButton4()+"\n";
		}
		if(!keypad.getNameButton5().isEmpty()){
			desKey += "Button 5 : " + keypad.getNameButton5()+"\n";
		}
		if(!keypad.getNameButton6().isEmpty()){
			desKey += "Button 6 : " + keypad.getNameButton6()+"\n";
		}
		if(!keypad.getNameButton7().isEmpty()){
			desKey += "Button 7 : " + keypad.getNameButton7()+"\n";
		}
		if(!keypad.getNameButton8().isEmpty()){
			desKey += "Button 8 : " + keypad.getNameButton8()+"\n";
		}
		if(!keypad.getNameButton9().isEmpty()){
			desKey += "Button 9 : " + keypad.getNameButton9()+"\n";
		}
		if(!keypad.getNameButtonA().isEmpty()){
			desKey += "Button A : " + keypad.getNameButtonA()+"\n";
		}
		if(!keypad.getNameButtonB().isEmpty()){
			desKey += "Button B : " + keypad.getNameButtonB()+"\n";
		}
		if(!keypad.getNameButtonC().isEmpty()){
			desKey += "Button C : " + keypad.getNameButtonC()+"\n";
		}
		if(!keypad.getNameButtonD().isEmpty()){
			desKey += "Button D : " + keypad.getNameButtonD()+"\n";
		}
		if(!keypad.getNameButtonAsterisk().isEmpty()){
			desKey += "Button * : " + keypad.getNameButtonAsterisk()+"\n";
		}
		if(!keypad.getNameButtonHash().isEmpty()){
			desKey += "Button # : " + keypad.getNameButtonHash()+"\n";
		}
		return desKey;
	}
}