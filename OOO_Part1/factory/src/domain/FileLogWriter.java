package domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 
 */
public class FileLogWriter implements LogWriter
{
	private String path;
	
	public FileLogWriter(String path)
	{
		this.path = path;
	}
	
	public FileLogWriter()
	{
		this("l.log");
	}

	public void Write(Log log)
	{
		try
		{
			String l = log.toString() + "\n";
			Files.write(Paths.get(this.path), l.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void ChangeLogFile(String path)
	{
		this.path = path;
	}

}