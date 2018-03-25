package domain.model;

public class Rented extends RentableItemState
{

	@Override
	public void returnItem(PartyItem item)
	{
		if(item.gotDamaged())
		{
			item.setDamagedState();
		}
		else
		{
			item.setAvailableState();
		}
	}
	
}
