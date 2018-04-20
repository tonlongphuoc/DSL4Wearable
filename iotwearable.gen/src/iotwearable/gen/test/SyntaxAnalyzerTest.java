package iotwearable.gen.test;

import static org.junit.Assert.*;
import iotwearable.gen.analyzer.LexicalAnalyzer;
import iotwearable.gen.analyzer.SyntaxAnalyzer;

import org.junit.Test;

public class SyntaxAnalyzerTest {

	@Test
	public void run_Show_Welcome() {
		LexicalAnalyzer lexer = new LexicalAnalyzer();
		lexer.lex( "Show \"Welcome\"");
		SyntaxAnalyzer analyzer = new SyntaxAnalyzer();
		analyzer.run(lexer.getTokens());
		String expected = "Show <String>";
		assertEquals(expected,analyzer.getSyntax());
	}
	@Test
	public void run_Display_LED() {
		LexicalAnalyzer lexer = new LexicalAnalyzer();
		lexer.setIdIdentifiers("led");
		lexer.lex("Display led");
		SyntaxAnalyzer analyzer = new SyntaxAnalyzer();
		analyzer.run(lexer.getTokens());
		String expected = "Display <id>";
		assertEquals(expected,analyzer.getSyntax());
	}
}
