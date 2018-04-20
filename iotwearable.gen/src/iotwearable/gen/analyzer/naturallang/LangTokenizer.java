package iotwearable.gen.analyzer.naturallang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LangTokenizer {
	private WordType type;
	private Pattern regex;

	public LangTokenizer(String regex, WordType type) {
		this.regex = Pattern.compile("^(" + regex + ")");
		this.type = type;
	}

	public LangToken tokenize(String str) {
		String s = str.trim();
		while (!s.equals("")) {
			boolean match = false;
			Matcher m = regex.matcher(s);
			if (m.find()) {
				String tok = m.group().trim();
				s = m.replaceFirst("").trim();
				return new LangToken(type, tok);
			}
			if(!match){
				return null;
			}
		}
		return null;
	}
}