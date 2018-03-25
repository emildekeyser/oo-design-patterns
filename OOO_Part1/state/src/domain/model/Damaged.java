package domain.model;

public class Damaged extends RentableItemState
{

	@Override
	public void remove(PartyItem item)
	{
		item.setRemovedState();
	}

	@Override
	public void repair(PartyItem item)
	{
		item.itemRepair();
		item.setAvailableState();
	}
	
}
