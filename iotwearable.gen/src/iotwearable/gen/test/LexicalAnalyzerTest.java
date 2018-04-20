package iotwearable.gen.test;

import static org.junit.Assert.*;
import iotwearable.gen.analyzer.LexicalAnalyzer;
import iotwearable.gen.analyzer.Token;
import iotwearable.gen.analyzer.TokenType;

import org.junit.Test;

public class LexicalAnalyzerTest {
	LexicalAnalyzer lexer = new LexicalAnalyzer();
	
	@Test
	public void string_literal_Token(){
		String stringLiteral = "\"string literal\"";
		lexer.lex(stringLiteral);
		Token token = new Token(TokenType.string_literal, "\"string literal\"");
		assertEquals(token, lexer.getTokens().get(0));
	}
}
