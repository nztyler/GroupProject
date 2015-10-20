package GameWorld.gameevents;

import GameWorld.exception.GameException;
import GameWorld.objects.ActivatableItem;

public class UseItemEvent extends Event{

	private ActivatableItem item;
	
	public UseItemEvent(ActivatableItem item){
		this.item = item;
	}
	
	//the only item that would have trouble activating is a key
	//lock picks and lights will activate regardless
	@Override
	public void apply() {
		try {
			item.activate();
		} catch (GameException e) {
			e.printStackTrace();
		}
	}
}