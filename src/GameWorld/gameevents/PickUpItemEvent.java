package GameWorld.gameevents;

import GameWorld.Character;
import GameWorld.exception.InvalidItemException;
import GameWorld.objects.MovableItem;

public class PickUpItemEvent extends Event{

	private Character character;
	private MovableItem item;
	
	public PickUpItemEvent(Character character, MovableItem item){
		this.character = character;
		this.item = item;
	}
	
	@Override
	public void apply() {
		try {
			character.getInventory().put(item);
		} catch (InvalidItemException e) {
			e.printStackTrace();
		}
	}
}
