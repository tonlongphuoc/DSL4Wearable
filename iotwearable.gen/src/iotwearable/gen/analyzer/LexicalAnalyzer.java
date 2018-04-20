package iotwearable.gen.analyzer;

import iotwearable.gen.GeneratorException;

import java.util.LinkedList;
/**
 * 
 * A class to read a head string, using the tokenizer class to separate it. The result used in the parser.
 * Can add id_idIdentifier before lexer. Example: keypad|buzzer. Use setIdIdentifiers
 *
 */
public class LexicalAnalyzer {
	private String keywords = "Show|Display|button|pressed"
			+ "|Hidden|Blink|Beep";
	Tokenizer tokenizer;
	
	public LexicalAnalyzer() {
		tokenizer = new Tokenizer();
		tokenizer.add(keywords, TokenType.keyword);
		tokenizer.add("[0-9]+", TokenType.integer_literal);
		tokenizer.add("\\\".*\\\"", TokenType.string_literal);
		tokenizer.add("\\\'[a_zA_Z]\\\'", TokenType.character_literal);
		tokenizer.add("\\{|\\}", TokenType.separator);
		tokenizer.add("\\+|\\-|\\*|\\/|\\=", TokenType.operator);
	}
	
	public void lex(String s) {
		s = s.trim();
		try {
			tokenizer.tokenize(s);
		} catch (GeneratorException e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Gets the token
	 * 
	 * @return {@linkplain List}<{@linkplain Token}>
	 */
	public LinkedList<Token> getTokens() {
		return tokenizer.getTokens();
	}
	public void setIdIdentifiers(String idIdentifiers) {
		if(idIdentifiers != null)
			if(!idIdentifiers.isEmpty())
				tokenizer.add(idIdentifiers, TokenType.id_identifier);
	}
}
