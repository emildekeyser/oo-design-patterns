package domain.model;

public class Available extends RentableItemState
{

	@Override
	public void rent(PartyItem item)
	{
		item.setRentedState();
	}

	@Override
	public void remove(PartyItem item)
	{
		item.setRemovedState();
	}
	
}
