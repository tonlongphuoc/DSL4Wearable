package iotwearable.gen.analyzer;

import java.util.LinkedList;

import iotwearable.gen.generator.StateFrameGenerator;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateFrame;

public class EventAnalyzer {
	String src;
	StateControl node;
	Mainboard mainboard;
	Connection conn;
	private LexicalAnalyzer lexer = new LexicalAnalyzer();
	private SyntaxAnalyzer syntaxer = new SyntaxAnalyzer();
	
	public EventAnalyzer(String src, StateControl node, Connection conn, Mainboard mainboard) {
		this.src = src;
		this.node = node;
		this.conn = conn;
		this.mainboard = mainboard;
	}
	
	public String parse(String event){
		String idIdentifiers = "";
		for(IOControl control : mainboard.getControls()){
			idIdentifiers += "|"+control.getId();
		}
		idIdentifiers = idIdentifiers.substring(1);
		lexer.setIdIdentifiers(idIdentifiers);
		lexer.lex(event);
		if(!lexer.getTokens().isEmpty()){
			syntaxer.run(lexer.getTokens());
			if(!syntaxer.getSyntax().isEmpty()){
				return eventProcessing(syntaxer.getSyntax(), lexer.getTokens());
			}
		}
		return "";
	}
	
	public String eventProcessing(String syntax, LinkedList<Token> tokens){
		if(syntax.equals("<String> button pressed")){
			return buttonPressedEventProcessing(syntax, tokens);
		}
		return "";
	}
	
	private String buttonPressedEventProcessing(String syntax, LinkedList<Token> tokens){
		String _event = "";
		IOControl _control = null;
		for(IOControl control : mainboard.getControls()){
			if(control instanceof Keypad4x4){
				_control = control;
				break;
			}
		}
		if(_control != null){
			_event = "if(<id>ClientKey == <key>){\n"
					+ "<content>"
					+ "\n}";
			if(_control instanceof Keypad4x4){
				Keypad4x4 keypad = (Keypad4x4)_control;
				_event = _event.replaceAll("<id>", keypad.getId());
				_event = _event.replace("<key>","\'"+ keypad.getButton(tokens.get(0).instance.replaceAll("\"", ""))+"\'");
				if(conn.getTarget() instanceof StateFrame){
					String setup = StateFrameGenerator.setState((StateFrame)conn.getTarget());
					setup = setup.replace("<parameters>", "");
					_event = _event.replace("<content>", setup);
				}
			}
		}
		return _event;
	}
}
