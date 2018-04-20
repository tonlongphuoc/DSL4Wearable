package iotwearable.gen.analyzer.naturallang;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LangUtil {
	public  String getNoun() {
		String line = null;
		String result = "";
		FileReader fileReader;
		BufferedReader bufferedReader;
		try {
			fileReader = new FileReader(this.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getPath() +"src/"+ this.getClass().getResource("nouns.txt").getPath());
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if(result.isEmpty())
					result += line.trim();
				else
					result += "|" + line.trim();
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
