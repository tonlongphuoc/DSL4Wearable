package iotwearable.gen;

import java.io.File;
import java.io.IOException;

import iotwearable.gen.analyzer.DevicesAnalyzer;
import iotwearable.gen.analyzer.StateSchemaAnalyzer;
import iotwearable.gen.formatter.Formatter;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateSchema;
import iotwearable.utilities.FileUtils;

public class Gen {
	private File mainboardFile;
	private File schemaFile;
	private String src = "";
	
	public Gen(File mainboard, File schema) {
		this.mainboardFile = mainboard;
		this.schemaFile = schema;
	}
	
	public String run(){
		Mainboard mainboard = ModelConverter.convertToMainboard(mainboardFile.getAbsolutePath());
		StateSchema schema = ModelConverter.convertToStateSchema(schemaFile.getAbsolutePath());
		if(mainboard == null || schema == null){
			return src;
		}
		try {
			String path = this.getClass().getProtectionDomain().getCodeSource()
			.getLocation().getPath();
			this.src = FileUtils.readFile(path+"/src/iotwearable/gen/IoTWApp.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		DevicesAnalyzer ioAnalyzer = new DevicesAnalyzer();
		StateSchemaAnalyzer schemaAnalyzer = new StateSchemaAnalyzer(schema, mainboard);
		src = ioAnalyzer.analyze(mainboard, src);
		src = schemaAnalyzer.analyze(src);
		src = CodeWriter.clean(src);
		src = Formatter.format(src);
		return src;
	}
}
