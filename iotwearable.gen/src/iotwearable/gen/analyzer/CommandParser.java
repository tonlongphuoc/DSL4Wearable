package iotwearable.gen.analyzer;

import iotwearable.gen.generator.GeneratorFactory;
import iotwearable.gen.generator.IDevicesGenerator;
import iotwearable.model.iotw.I2CLCD2004;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Mainboard;

import java.util.LinkedList;

/**
 * 
 * A class analyzes a command line.
 *
 */
public class CommandParser {
	private LexicalAnalyzer lexer = new LexicalAnalyzer();
	private SyntaxAnalyzer syntaxer = new SyntaxAnalyzer();
	
	public String parse(String commandLine, Mainboard mainboard){
		String idIdentifiers = "";
		for(IOControl control : mainboard.getControls()){
			idIdentifiers += "|"+control.getId();
		}
		idIdentifiers = idIdentifiers.substring(1);
		lexer.setIdIdentifiers(idIdentifiers);
		lexer.lex(commandLine);
		if(!lexer.getTokens().isEmpty()){
			syntaxer.run(lexer.getTokens());
			if(!syntaxer.getSyntax().isEmpty()){
				return translate(syntaxer.getSyntax(), lexer.getTokens(), mainboard);
			}
		}
		return "";
	}
	/*
	 * Based the syntax code translate to the c code
	 */
	private String translate(String syntax, LinkedList<Token> tokens, Mainboard mainboard){
		String code = "";
		IDevicesGenerator generator = null;
		IOControl control = null;
		String _id = "";
		_id = checkIdIdentifier(tokens);
		if(!_id.isEmpty()){
			control = getIOControlWithID(mainboard, _id);
			if(control != null){
				generator = GeneratorFactory.create(control);
				if(generator != null){
					code = generator.generateCommand(syntax, tokens);
				}
			}
		}
		else if(syntax.equals("Show <String>")){
			for(IOControl _control: mainboard.getControls()){
				if(_control instanceof I2CLCD2004){
					control = _control;
				}
			}if(control != null){
				generator = GeneratorFactory.create(control);
				if(generator != null){
					code = generator.generateCommand(syntax, tokens);
				}
			}
		}
		return code;
	}
	
	private String checkIdIdentifier(LinkedList<Token> tokens){
		for(Token token : tokens){
			if(token.type.equals(TokenType.id_identifier)){
				return token.instance;
			}
		}
		return "";
	}
	
	private IOControl getIOControlWithID(Mainboard mainboard, String id){
		for(IOControl control : mainboard.getControls()){
			if(control.getId().equals(id)){
				return control;
			}
		}
		return null;
	}
	public SyntaxAnalyzer getSyntaxer() {
		return syntaxer;
	}
	public LexicalAnalyzer getLexer() {
		return lexer;
	}
}