package Utillities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfilereader {

	public String ReadPropertiesfiles(File a, String i) throws IOException {

		try {
			
			FileInputStream stream = new FileInputStream(a);
			Properties prop = new Properties();
			prop.load(stream);
			String inputs = prop.getProperty(i);
			return inputs;

		}

		catch (Exception e) {
			
			System.out.println("Any priblem");
			
			e.printStackTrace();
			
			return null;

		}
		

	}

}
