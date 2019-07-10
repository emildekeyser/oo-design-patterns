package domain.model;

public class Rented extends RentableItemState
{

	@Override
	public void returnItem(PartyItem item, boolean damaged)
	{
		if(damaged)
		{
			item.setDamagedState();
		}
		else
		{
			item.setAvailableState();
		}
	}
	
}
