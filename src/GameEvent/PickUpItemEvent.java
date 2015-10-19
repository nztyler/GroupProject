package GameEvent;

import GameWorld.Character;
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
		character.getInventory().put(item);
	}
}
