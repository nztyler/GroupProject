package GameWorld.gameevents;

import GameWorld.objects.MovableItem;
import GameWorld.Character;
import GameWorld.exception.InvalidItemException;

public class DropItemEvent extends Event{

	private Character character;
	private MovableItem item;
	
	public DropItemEvent(Character character, MovableItem item){
		this.character = character;
		this.item = item;
	}
	
	@Override
	public void apply() {
		try {
			character.getInventory().drop(item);
		} catch (InvalidItemException e) {
			e.printStackTrace();
		}
	}

}
