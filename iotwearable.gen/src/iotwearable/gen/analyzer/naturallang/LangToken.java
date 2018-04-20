package iotwearable.gen.analyzer.naturallang;

/**
 * A langtoken that is produced by LangTokenizer.
 *A langtoken consists of a word type, a word.
 */
public class LangToken {
	public final WordType type;
	public final String word;
	
	public LangToken(WordType type, String word) {
		this.type = type;
		this.word = word;
	}
	@Override
	public String toString() {
		return this.word + "\t" + this.type;
	}
}