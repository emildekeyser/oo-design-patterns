package domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JOptionPane;

/**
 * 
 */
public class FileLogWriter implements LogWriter
{
	private String path;
	private static FileLogWriter uniqueInstance = new FileLogWriter();
	
	private FileLogWriter(String path)
	{
		this.path = path;
	}
	
	private FileLogWriter()
	{
		this("l.log");
	}
	
	public static FileLogWriter uniqueInstance()
	{
		return FileLogWriter.uniqueInstance;
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
			throw new RuntimeException(e);
		}
	}

	public void ChangeLogFile(String path)
	{
		this.path = path;
	}

}