package GameWorld.gameevents;

import GameWorld.objects.ActivatableItem;

public class UseItemEvent extends Event{

	private ActivatableItem item;
	
	public UseItemEvent(ActivatableItem item){
		this.item = item;
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		item.activate();
	}

}
