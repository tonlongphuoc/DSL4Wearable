package iotwearable.gen.analyzer.naturallang;

import java.util.LinkedList;

public class LangParser {
	private LangLexicalAnalyzer analyzer;

	public LangParser() {
		analyzer = new LangLexicalAnalyzer();
	}

	public String parse(String sentance) {
		LinkedList<LangToken> tokens = analyzer.lex(sentance);

		if(tokens == null)
			return "";
		if (!tokens.isEmpty()) {
			Grammar grammar = Grammarizer.grammarize(tokens);
			if(grammar != null){
				if(grammar.equals(Grammar.V)){
					return tokens.get(0).word.trim().toLowerCase();
				}
				if(grammar.equals(Grammar.V_A_N)){
					return tokens.get(0).word.trim().toLowerCase() +upperCaseFirstCharacter( tokens.get(2).word);
				}
				else if(grammar.equals(Grammar.V_N)){
					return tokens.get(0).word.trim().toLowerCase() +upperCaseFirstCharacter( tokens.get(1).word);
				}
			}
		}
		return "";
	}
	private String upperCaseFirstCharacter(String str){
		if(str.isEmpty())
			return str;
		str = str.trim().toLowerCase();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return str;
	}
}
