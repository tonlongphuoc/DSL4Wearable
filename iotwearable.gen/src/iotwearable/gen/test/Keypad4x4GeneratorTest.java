package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.generator.Keypad4x4Generator;
import iotwearable.model.iotw.Keypad4x4;

import org.junit.Test;

public class Keypad4x4GeneratorTest extends IOGeneratorTest{
	Keypad4x4Generator generator = new Keypad4x4Generator((Keypad4x4)getIOControl(Keypad4x4.class));
	
	@Test
	public void generateInclude(){
		String expected =  "#include <Keypad.h>";
		assertEquals(expected, generator.generateInclude());
	}
	
	@Override
	public void generateDefine() {
		String content = "/*Define kepad4x4 - keypad\n"
				+ "Button 1 : Order"
				+ "\nButton 2 : Cancel"
				+ "\n*/\n"
				+ "char keypad_keys[4][4] ="
				+ "{{'1','2','3','A'},"
				+ "{'4','5','6','B'},"
				+ "{'7','8','9','C'},"
				+ "{'*','0','#','D'}};\n";
		content+="byte keypad_rowPins[4] = {2,3,4,5};\n"
				+ "byte keypad_columnPins[4] = {6,7,8,9};\n";
		content +="Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);";
		String expected = content;
		assertEquals(expected, generator.generateDefine());
	}
	@Override
	public void generateSetupFuncSetup() {
		String expected = "";
		assertEquals(expected, generator.generateSetupFuncSetup());
	}
	@Override
	public void generateSetupFuncLoop() {
		String expected = "char keypadClientKey = keypad.getKey();";
		assertEquals(expected, generator.generateSetupFuncLoop());
	}
	public void generate_String_button_pressed_Command(){
		String syntax = "<String> button pressed";
		List<Token> tokens = new ArrayList<Token>();
		String expected = "if(keypadClientKey == <key>){\n<content>\n}";
		assertEquals(expected, generator.generateCommand(syntax, tokens));
	}
	@Override
	public void generateCommand() {
		
	}
}