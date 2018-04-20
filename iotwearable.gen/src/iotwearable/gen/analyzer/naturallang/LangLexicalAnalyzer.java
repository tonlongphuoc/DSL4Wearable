package iotwearable.gen.analyzer.naturallang;
import java.util.LinkedList;

public class LangLexicalAnalyzer {
	LangUtil langUtil = new LangUtil();
	private static String verbs = "create|update|delete|remove|make|add|build"
			+ "|change|check|choose|connect|cook|count|send|request|cancel|pay|process|confirm";
	private static String nouns = "";
	private static String art = "a|an|the";
	private LangTokenizer verbTokenizer;
	private LangTokenizer artTokenizer;
	private LangTokenizer nounTokenizer;
	LinkedList<LangToken> tokens;
	
	public LangLexicalAnalyzer() {
		nouns = langUtil.getNoun();
		verbTokenizer = new LangTokenizer(verbs, WordType.V);
		artTokenizer = new LangTokenizer(art, WordType.A);
		nounTokenizer = new LangTokenizer(nouns, WordType.N);
		tokens = new LinkedList<LangToken>();
	}
	public LinkedList<LangToken> lex(String sentance){
		String temp = sentance;
		LangToken verbToken = lexicer(sentance, WordType.V);
		if(verbToken != null){
			tokens.add(verbToken);
			temp = _sentance;
			LangToken artToken = lexicer(_sentance, WordType.A);
			if(artToken != null){
				temp = _sentance;
				LangToken nounToken = lexicer(_sentance, WordType.N);
				if(nounToken != null && _sentance.isEmpty()){
					tokens.add(artToken);
					tokens.add(nounToken);
					return tokens;
				}
			}
			else{
				LangToken nounToken = lexicer(temp, WordType.N);
				if(nounToken != null && _sentance.isEmpty()){
					tokens.add(nounToken);
					return tokens;
				}
			}
		}
		return tokens;
	}
	String _sentance = "";
	private LangToken lexicer(String sentance, WordType type){
		sentance = sentance.trim().toLowerCase();
		String word = "";
		int index = sentance.indexOf(' ');
		if(index > -1){
			word = sentance.substring(0,index).trim();
			_sentance = sentance.replace(word, "").trim();
		}
		else{
			word = sentance.trim();
			_sentance = "";
		}
		if(type ==  WordType.V){
			return verbTokenizer.tokenize(word);
		}
		if(type ==  WordType.A){
			return artTokenizer.tokenize(word);
		}
		if(type == WordType.N){
			return nounTokenizer.tokenize(word);
		}
		return null;
	}
}