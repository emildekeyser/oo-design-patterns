package domain;

public class Logger
{
	private LogFactory factory;
	private LogWriter writer;
	
	public Logger()
	{
		this.factory = new LogFactory();
		this.writer = new LogWriterFactory().createWriter(); 
	}

	public void Log(Level lvl, String message)
	{
		Log log = this.factory.CreateLog(lvl, message);
		this.writer.Write(log);
	}

}