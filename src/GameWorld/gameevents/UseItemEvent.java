package GameWorld.gameevents;

import GameWorld.exception.GameException;
import GameWorld.objects.ActivatableItem;

public class UseItemEvent extends Event{

	private ActivatableItem item;
	
	/**
	 * this event will be used to activate an item
	 * @param item
	 */
	public UseItemEvent(ActivatableItem item){
		this.item = item;
	}
	
	//the only item that would have trouble activating is a key
	//lock picks and lights will activate regardless
	@Override
	public void apply() throws GameException{
		item.activate();
	}
}