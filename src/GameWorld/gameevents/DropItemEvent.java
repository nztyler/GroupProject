package GameWorld.gameevents;

import GameWorld.objects.MovableItem;
import GameWorld.Character;
import GameWorld.exception.GameException;
import GameWorld.exception.InvalidItemException;

public class DropItemEvent extends Event{

	private Character character;
	private MovableItem item;
	
	private int x;
	private int y;
	private int z;
	
	public DropItemEvent(Character character, MovableItem item, int x, int y, int z){
		this.character = character;
		this.item = item;
	}
	
	@Override
	public void apply() throws GameException{
		character.getInventory().drop(item);
		character.getRoom().addItem(item, x, y, z);
	}

}
