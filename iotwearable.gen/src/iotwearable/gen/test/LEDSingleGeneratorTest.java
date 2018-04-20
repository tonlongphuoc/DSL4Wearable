package iotwearable.gen.test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.analyzer.TokenType;
import iotwearable.gen.generator.LEDGenerator;
import iotwearable.gen.generator.LEDSingleGenerator;
import iotwearable.model.iotw.LED;

import org.junit.Test;

public class LEDSingleGeneratorTest extends IOGeneratorTest{
	LEDGenerator generator = new LEDSingleGenerator((LED)getIOControl(LED.class));
	
	@Override
	public void generateInclude() {
		String expected = "";
		assertEquals(expected, generator.generateInclude());
	}
	@Override
	public void generateDefine() {
		String expected = "/*Define LED - ledGreen output*/\n"
						+"const int ledGreen = 10;";
		assertEquals(expected, generator.generateDefine());
	}
	
	
	@Override
	public void generateSetupFuncSetup() {
		String expected = "pinMode(ledGreen, OUTPUT);";
		assertEquals(expected, generator.generateSetupFuncSetup());
	}
	@Override
	public void generateSetupFuncLoop() {
		
	}
	@Test
	public void generate_Blink_ID_Command(){
		String expected = "digitalWrite(ledGreen, HIGH);"
				+ "\ndelay(1000);"
				+ "\ndigitalWrite(ledGreen, LOW);"
				+ "\ndelay(1000);";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Blink"));
		tokens.add(new Token(TokenType.id_identifier, "ledGreen"));
		assertEquals(expected, generator.generateCommand("Blink <id>", tokens));
	}
	@Test
	public void generate_Hidden_ID_Command(){
		String expected = "digitalWrite(ledGreen, LOW);";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Hidden"));
		tokens.add(new Token(TokenType.id_identifier, "ledGreen"));
		assertEquals(expected, generator.generateCommand("Hidden <id>", tokens));
	}
	@Test
	public void generate_Display_ID_Command(){
		String expected = "digitalWrite(ledGreen, HIGH);";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Display"));
		tokens.add(new Token(TokenType.id_identifier, "ledGreen"));
		assertEquals(expected, generator.generateCommand("Display <id>", tokens));
	}
	@Override
	public void generateCommand() {
	}
}