package GameWorld.gameevents;

import GameWorld.Character;
import GameWorld.exception.GameException;
import GameWorld.exception.InvalidItemException;
import GameWorld.objects.Item;
import GameWorld.objects.MovableItem;

public class PickUpItemEvent extends Event{

	private Character character;
	private Item item;
	
	public PickUpItemEvent(Character character, Item item2){
		this.character = character;
		this.item = item2;
	}
	
	@Override
	public void apply() throws GameException{
		character.getInventory().put(item);
		character.getRoom().getItems().remove(item);
	}
}
