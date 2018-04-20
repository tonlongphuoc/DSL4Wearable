package iotwearable.gen.analyzer.naturallang;

import java.util.LinkedList;

public class Grammarizer {
	public static Grammar grammarize(LinkedList<LangToken> tokens){
		if (tokens == null)
			return null;
		LangToken token = tokens.getFirst();
		String type = "";
		while(token != null){
			if(type.isEmpty())
				type += token.type;
			else
				type += "_" + token.type;
			token = nextToken(token, tokens);
		}
		if(type.equals(Grammar.V.toString())){
			return Grammar.V;
		}
		if(type.equals(Grammar.V_A_N.toString())){
			return Grammar.V_A_N;
		}
		if(type.equals(Grammar.V_N.toString())){
			return Grammar.V_N;
		}
		return null;
	}
	private static LangToken nextToken(LangToken token, LinkedList<LangToken> tokens) {
		if (token != tokens.getLast()) {
			return tokens.get(tokens.indexOf(token) + 1);
		}
		return null;
	}
}
