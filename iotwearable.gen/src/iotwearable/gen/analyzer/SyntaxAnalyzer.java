package iotwearable.gen.analyzer;

import java.util.LinkedList;

/**
 * Analyze conversion tokens list to a common syntax. That gives define the code
 * of the syntax used, which will be used for the parser.
 */
public class SyntaxAnalyzer {
	String syntax = "";
	
	public SyntaxAnalyzer() {
	}
	/**
	 * Syntax analysis for tokens from lexer.
	 * @param tokens
	 */
	public void run(LinkedList<Token> tokens){
		if(tokens.isEmpty()){
			return;
		}
		createSyntax(tokens);
		syntax = syntax.trim();
	}
	/**
	 * Create a syntax from a linkedlist {@linkplain Token}
	 * 
	 * @param tokens
	 */
	private void createSyntax(LinkedList<Token> tokens) {
		syntax = "";
		Token token;
		if (!tokens.isEmpty()) {
			for (int i = 0; i < tokens.size(); i++) {
				token = tokens.get(i);
				if (token.type.equals(TokenType.id_identifier)) {
					syntax += ' ' + "<id>";
				} else if (token.type.equals(TokenType.keyword)) {
					syntax += ' ' + token.instance;
				} else if (token.type.equals(TokenType.separator)) {
					syntax += token.instance;
				}
				else if( token.type.equals(TokenType.operator)){
					syntax += ' ' + token.instance;
				}
				else {
					if (i >= 1) {
						if (tokens.get(i - 1).type.equals(TokenType.keyword)) {
							syntax += ' ';
						}
					}
					if (token.type.equals(TokenType.integer_literal)) {
						syntax += "<integer>";
					} else if (token.type.equals(TokenType.string_literal)) {
						syntax += "<String>";
					}
				}
			}
		}
		syntax = syntax.trim();
	}
	public String getSyntax() {
		return syntax;
	}
}