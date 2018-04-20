package iotwearable.gen.analyzer;

import iotwearable.gen.analyzer.naturallang.LangParser;


/**
 * 
 * The class analyzes a sentence. Give out the function name and the action be description.
 *
 */
public class SentenceAnalyzer {
	LangParser langParser;
	public SentenceAnalyzer() {
		langParser = new LangParser();
	}
	public String analyze(String sentence){
		String name = "";
		String _sentence = sentence.trim().toLowerCase();
		name = langParser.parse(_sentence);
		return name;
	}
}