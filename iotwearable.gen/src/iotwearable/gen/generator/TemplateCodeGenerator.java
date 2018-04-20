package iotwearable.gen.generator;

public class TemplateCodeGenerator{
	public static String generateMethod(){
		return "<return_type> <name>(<parameters>){\n<content>\n}";
	}
	public static String generateMethodPrototype(){
		return "<return_type> <name>(<parameters>);";
	}
	public static String generateInvokenMethod(){
		return "<name>(<parameters>);";
	}
}