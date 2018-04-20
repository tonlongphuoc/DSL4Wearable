package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.analyzer.TokenType;
import iotwearable.gen.generator.BuzzerGenerator;
import iotwearable.model.iotw.Buzzer;

public class BuzzerGeneratorTest extends IOGeneratorTest {
	BuzzerGenerator generator = new BuzzerGenerator((Buzzer)getIOControl(Buzzer.class));

	@Override
	public void generateDefine() {
		String expected = "/*Define buzzer - buzzer output*/\n"
				+ "const int buzzer = 12;";
		assertEquals(expected, generator.generateDefine());
	}

	@Override
	public void generateInclude() {
		String expected = "";
		assertEquals(expected, generator.generateInclude());
	}

	@Override
	public void generateSetupFuncSetup() {
		String expected = "pinMode(buzzer, OUTPUT);";
		assertEquals(expected, generator.generateSetupFuncSetup());
	}

	@Override
	public void generateSetupFuncLoop() {
		String expected = "";
		assertEquals(expected, generator.generateSetupFuncLoop());
	}
	@Test
	public void generate_Beep_Command(){
		String syntax = "Beep <id>";
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new Token(TokenType.keyword, "Beep"));
		tokens.add(new Token(TokenType.id_identifier, "buzzer"));
		String expected = "analogWrite(buzzer, 20);"
				+ "\ndelay(50);"
				+ "\nanalogWrite(buzzer, 0);"
				+ "\ndelay(50);";
		assertEquals(expected, generator.generateCommand(syntax, tokens));
	}
	@Override
	public void generateCommand() {
		String syntax = "";
		List<Token> tokens = new ArrayList<Token>();
		String expected = "";
		assertEquals(expected, generator.generateCommand(syntax, tokens));
	}
}
