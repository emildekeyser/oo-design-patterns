package model;

public abstract class Beverage
{
	protected String description;

	public Beverage()
	{
		this.description = "Unknown beverage";
	}
	
	public abstract double cost();
	
	public String getDescription()
	{
		return this.description;
	}
}
