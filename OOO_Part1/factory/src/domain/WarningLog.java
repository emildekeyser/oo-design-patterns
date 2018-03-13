package domain;

public class WarningLog extends Log
{
	public WarningLog(String msg)
	{
		super(msg);
		this.level = Level.WARNING;
	}
}