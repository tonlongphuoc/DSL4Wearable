package iotwearable.gen.generator;

import java.util.List;

import iotwearable.gen.analyzer.Token;
import iotwearable.model.iotw.I2CLCD2004;

public class I2CLCD2004Generator extends I2CLCD{
	private I2CLCD2004  i2clcd2004;
	
	public I2CLCD2004Generator(I2CLCD2004  i2clcd2004) {
		super();
		this.i2clcd2004 = i2clcd2004;
	}
	@Override
	public String generateDefine() {
		return super.generateDefine()
				.replaceAll("<id>", i2clcd2004.getId())
				.replaceAll("<width>", "20")
				.replaceAll("<height>", "4");
	}
	@Override
	public String generateSetupFuncSetup() {
		return super.generateSetupFuncSetup()
				.replaceAll("<id>", i2clcd2004.getId());
	}
	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		String command = super.generateCommand(syntax, tokens);
		if(command.contains("<id>")){
			command = command.replaceAll("<id>", i2clcd2004.getId());
		}
		return command;
	}
}