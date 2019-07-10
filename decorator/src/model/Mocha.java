package model;

public class Mocha extends Condiment
{
	private Beverage beverage;
	
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public String getDescription()
	{
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost()
	{
		return this.beverage.cost() + .20;
	}
}
