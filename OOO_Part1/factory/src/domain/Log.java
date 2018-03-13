package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Log
{
	protected Level level;
	protected String message;
	protected LocalDateTime now;
	
	public Log(String msg)
	{
		this.message = msg;
		this.level = Level.INFO;
		this.now = LocalDateTime.now();
	}
	
	@Override
	public String toString()
	{
		
		String n = this.now.format(DateTimeFormatter.BASIC_ISO_DATE);
		return "[" + this.level.toString() + " - " + n +"] " + this.message;
	}
}