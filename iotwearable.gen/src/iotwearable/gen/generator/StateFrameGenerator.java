package iotwearable.gen.generator;

import iotwearable.model.iotw.StateFrame;

public class StateFrameGenerator {
	public static String setState(StateFrame frame){
		return "set" + frame.getName() + "State(<parameters>);";
	}
	
	public static String generateFuncPrototype(StateFrame frame) {
		return "<return_type> set" + frame.getName() + "State(<parameters>);";
	}

	public static String generateFuncImpl(StateFrame frame) {
		String code = "<return_type> set" + frame.getName() + "State(<parameters>){\n"
							+ "if(<condition>){";
		if(frame.getContent() != null){
			if(!frame.getContent().isEmpty()){
				String[] commands = frame.getContent().split("\n");
				if(commands != null){
					if(commands.length > 0){
						for(String command : commands){
							if(command != null){
								if(!command.isEmpty()){
									code += "\n<"+command.trim()+">";
								}
							}
						}
					}
				}
			}
		}
		code += "\ncurrentState = <index>;" + "\n}" + "\n}";
		return code;
	}
}