package domain;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Logger
{
	private LogFactory factory;
	private LogWriter writer;
	
	public Logger()
	{
		this.factory = new LogFactory();
		this.writer = this.getWriter(); 
	}
	
	private LogWriter getWriter() // TODO THIS IS ACTUALLY A FACTORY CLASS !
	{
		Properties prop = new Properties();
		try(InputStream input = new FileInputStream("properties"))
		{
			prop.load(input);
		}
		catch (Exception e){}
		
		LogWriter correctWriter = prop.getProperty("mode").equals("f") ? new FileLogWriter() : new ConsoleLogWriter();
		return correctWriter;
	}

	public void Log(Level lvl, String message)
	{
		Log log = this.factory.CreateLog(lvl, message);
		this.writer.Write(log);
	}

}