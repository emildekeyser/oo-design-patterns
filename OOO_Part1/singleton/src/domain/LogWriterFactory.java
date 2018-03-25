package domain;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LogWriterFactory
{
	public LogWriter createWriter()
	{
		Properties prop = new Properties();
		String key = "";
		try(InputStream input = new FileInputStream("properties"))
		{
			prop.load(input);
			key = prop.getProperty("mode");
		}
		catch (Exception e)
		{
			key = "c";
		}
		
		switch (key)
		{
			case "c":
				return new ConsoleLogWriter();
			case "f" :
				return FileLogWriter.uniqueInstance();
			default :
				return new ConsoleLogWriter();
		}
	}
}
