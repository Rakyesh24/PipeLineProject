package util;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperies {
	static Properties prop;

	public static Properties readProp(String file) {
		prop = null;
		try {
			FileInputStream fileinput = new FileInputStream(file);
			prop = new Properties();
			prop.load(fileinput);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return prop;
	}

}
