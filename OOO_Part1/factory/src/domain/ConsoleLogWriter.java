package domain;

public class ConsoleLogWriter implements LogWriter
{
	public void Write(Log log)
	{
		System.out.println(log.toString());
	}
}