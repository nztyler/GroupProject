package GameWorld.gameevents;

import GameWorld.objects.MovableItem;
import GameWorld.Character;

public class DropItemEvent extends Event{

	private Character character;
	private MovableItem item;
	
	public DropItemEvent(Character character, MovableItem item){
		this.character = character;
		this.item = item;
	}
	
	@Override
	public void apply() {
		if (character.getInventory().contains(item)){
			character.getInventory().drop(item);
			System.out.println("Character " + character.getName() 
				+ " has successfully droped the item");
		} else {
			System.out.println("Item is not in the inventory");
		}
	}

}
