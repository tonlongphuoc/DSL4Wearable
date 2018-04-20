package iotwearable.gen;
/**
 * Write the code to the marked position.
 */
public class CodeWriter {
	//ReplaceKey
	public static final String include = "<include>";
	public static final String desState = "<desState>";
	public static final String define = "<define>";
	public static final String funcPrototype = "<funcPrototype>";
	public static final String funcSetup = "<funcSetup>";
	public static final String funcLoop = "<funcLoop>";
	public static final String funcImpl = "<funcImpl>";
	public static final String funcSetState = "<funcSetState>";
	
	/**
	 * Replace the content into the source code in place of the replacedkey.
	 * 
	 * @param sourceCode
	 *            is the source to be replaced.
	 * @param content
	 *            is the replacement.
	 * @param typeRep
	 *            is the word replaced.
	 * @return The source code has been written.
	 */
	public static String write(String sourceCode, String content, String typeRep)
	{
		if(sourceCode != null && content != null)
			if (!sourceCode.isEmpty()&& !content.isEmpty()) {
				if(typeRep.equals(funcSetup) || typeRep.equals(funcLoop))
					return sourceCode.replace(typeRep, content + "\n\t" + typeRep);
				return sourceCode.replace(typeRep, content + "\n" + typeRep);
			}
		return sourceCode;
	}
	
	public static String clean(String sourceCode){
		sourceCode = sourceCode.replaceAll(include,"");
		sourceCode = sourceCode.replaceAll(define,"");
		sourceCode = sourceCode.replaceAll(desState,"");
		sourceCode = sourceCode.replaceAll(funcPrototype,"");
		sourceCode = sourceCode.replaceAll(funcSetup,"");
		sourceCode = sourceCode.replaceAll(funcLoop,"");
		sourceCode = sourceCode.replaceAll(funcImpl,"");
		sourceCode = sourceCode.replaceAll(funcSetState,"");
		return sourceCode;
	}
}
