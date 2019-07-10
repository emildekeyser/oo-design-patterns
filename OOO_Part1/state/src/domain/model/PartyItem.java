package domain.model;

public class PartyItem
{
	private Available availableState;
	private Rented rentedState;
	private Damaged damagedState;
	private Removed removedState;
	
	private RentableItemState currentState;
	
	private double price;
	private String name;

	public PartyItem(String name, double basePrice)
	{	
		this.availableState = new Available();
		this.rentedState = new Rented();
		this.damagedState = new Damaged();
		this.removedState = new Removed();
		
		this.currentState = new Available();
		
		this.price = basePrice;
		this.name = name;
	}
	
	// MODEL PACKAGE (DEFAULT) METHODS

	void setAvailableState()
	{
		this.currentState = this.availableState;
	}

	void setRentedState()
	{
		this.currentState = this.rentedState;
	}

	void setDamagedState()
	{
		this.currentState = this.damagedState;
	}

	void setRemovedState()
	{
		this.currentState = this.removedState;
	}

	// PUBLIC STATE ALTERING METHODS
	
	public void rent()
	{
		this.currentState.rent(this);
	}
	public void remove()
	{
		this.currentState.remove(this);
	}
	public void returnItem(boolean damaged)
	{
		this.currentState.returnItem(this, damaged);
	}
	public void repair()
	{
		this.currentState.repair(this);
	}
	
	// PUBLIC UTILITY METHODS
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getRentPrice()
	{
		return this.price / 5;
	}

	public void setBasePrice(double price)
	{
		this.price = price;
	}
	
	public double damageCompenesation()
	{
		return this.price / 3;
	}
	
	public String getState()
	{
		return this.currentState.getClass().getName();
	}
	
}
