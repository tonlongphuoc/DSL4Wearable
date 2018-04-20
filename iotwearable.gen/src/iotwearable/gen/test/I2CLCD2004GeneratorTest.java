package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.analyzer.TokenType;
import iotwearable.gen.generator.I2CLCD2004Generator;
import iotwearable.model.iotw.I2CLCD2004;

public class I2CLCD2004GeneratorTest extends IOGeneratorTest{
	I2CLCD2004Generator generator = new I2CLCD2004Generator((I2CLCD2004)getIOControl(I2CLCD2004.class));
	
	@Test
	public void generateInclude() {
		String expected = "#include <LiquidCrystal_I2C.h>";
		assertEquals(expected, generator.generateInclude());
	}
	@Test
	public void generateDefine(){
		String expected = "/*Define LiquidCrystal_I2C - lcd */\n"
				+ "LiquidCrystal_I2C lcd(0x3F, 20, 4);";
		assertEquals(expected, generator.generateDefine());
	}
	@Override
	public void generateSetupFuncSetup() {
		String expected = "lcd.begin();\n"
				+ "lcd.backlight();";
		assertEquals(expected, generator.generateSetupFuncSetup());
	}
	@Override
	public void generateSetupFuncLoop() {
		String expected = "";
		assertEquals(expected, generator.generateSetupFuncLoop());
		
	}
	@Test
	public void generate_Blink_ID_Command(){
		String syntax = "Blink <id>";
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new Token(TokenType.keyword, "Blink"));
		tokens.add(new Token(TokenType.id_identifier, "lcd"));
		String expected = "lcd.blink();";
		assertEquals(expected, generator.generateCommand(syntax, tokens));
	}
	@Test
	public void generate_Show_String_Command(){
		String syntax = "Show <String>";
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new Token(TokenType.keyword, "Show"));
		tokens.add(new Token(TokenType.string_literal,"\"Hello word\""));
		String expected = "lcd.print(\"Hello word\");";
		assertEquals(expected, generator.generateCommand(syntax, tokens));
	}
	@Override
	public void generateCommand() {
		// TODO Auto-generated method stub
		
	}
}
