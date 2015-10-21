package GameWorld.gameevents;

import GameWorld.Character;
import GameWorld.exception.GameException;
import GameWorld.exception.InvalidItemException;
import GameWorld.objects.Item;
import GameWorld.objects.MovableItem;

public class PickUpItemEvent extends Event{

	private Character character;
	private Item item;
	
	/**
	 * this event will be used to apply the change where a character
	 * will pick up an item from the ground
	 * @param character
	 * @param item2
	 */
	public PickUpItemEvent(Character character, Item item2){
		this.character = character;
		this.item = item2;
	}
	
	@Override
	public void apply() throws GameException{
		character.getRoom().remove(item);
		character.getInventory().put(item);
	}
}
