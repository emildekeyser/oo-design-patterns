package domain.model;

public abstract class RentableItemState
{
	public void rent(PartyItem item)
	{
		throw new IllegalStateException();
	}
	public void remove(PartyItem item)
	{
		throw new IllegalStateException();
	}
	public void returnItem(PartyItem item)
	{
		throw new IllegalStateException();
	}
	public void repair(PartyItem item)
	{
		throw new IllegalStateException();
	}
}
