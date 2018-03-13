package domain;

public class ExceptionLog extends Log
{
	private String stacktrace;

	public ExceptionLog(String msg)
	{
		super(msg);
		this.level = Level.EXCEPTION;
		this.stacktrace = "jerhjpoerjhgpierjhpihjpoersnh,lkdnbpietjnhpoihgpidsbpinedbpiphibjdrsphigjdfpihjhjpidhjpidfh,podrjgp";
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\n" + this.stacktrace;
	}
}