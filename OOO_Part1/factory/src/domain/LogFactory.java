package domain;

public class LogFactory
{
	public Log CreateLog(Level lvl, String message)
	{
		switch (lvl)
		{
			case INFO :
				return new InfoLog(message);
			case WARNING:
				return new WarningLog(message);
			case EXCEPTION:
				return new ExceptionLog(message);
			default :
				throw new IllegalArgumentException();
		}
	}

}