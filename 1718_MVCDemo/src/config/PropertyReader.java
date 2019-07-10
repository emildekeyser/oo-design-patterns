package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReader {
	private static Map<String, PropertyReader> instances = new HashMap<String, PropertyReader>();
	
	private String filename;
	private Properties properties;
	
	private PropertyReader(String filename) {
		super();
		this.setFilename(filename);
	}
	
	public static PropertyReader getInstance(String filename){
		PropertyReader uniqueInstance = instances.get(filename);
		if(uniqueInstance == null){
			uniqueInstance = new PropertyReader(filename);
			instances.put(filename, uniqueInstance);
		}
		return uniqueInstance;
	}
	
	public Properties getProperties() throws ConfigException{
		if(properties == null){
			try {
				properties = new Properties();
				InputStream in = new FileInputStream(getFilename());
				properties.load(in);
				in.close();
			} catch (FileNotFoundException e) {
				throw new ConfigException(e.getMessage(), e);
			} catch (IOException e) {
				throw new ConfigException(e.getMessage(), e);
			}
			
		}
		return properties;
	}

	private String getFilename() {
		return filename;
	}

	private void setFilename(String filename) {
		this.filename = filename;
	}
}
