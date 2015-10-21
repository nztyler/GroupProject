package GameWorld;

import java.awt.List;

import java.util.ArrayList;

import GameWorld.exception.InvalidItemException;
import GameWorld.objects.Item;
import GameWorld.objects.MovableItem;
import GameWorld.Character;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Inventory {

	/* Inventory is basically a container, so do I really need this class? */

	private ArrayList<MovableItem> items;
	private Character character;

	public Inventory(Character character){
		this.items = new ArrayList<MovableItem>();
		this.character = character;
	}

	/**
	 * 
	 * @return the arraylist that contains all of the items in this inventory
	 */
	public ArrayList<MovableItem> getItems(){
		return items;
	}
	
	/**
	 * 
	 * @param item to be checked if is contained in this inventory
	 * @return true if item is contained, otherwise false
	 */
	public boolean contains(MovableItem item){
		return items.contains(item);
	}

	/**
	 * 
	 * @param item to be added to the inventory
	 * @throws InvalidItemException 
	 */
	public void put(Item item) throws InvalidItemException{
		if (item instanceof MovableItem){
			add((MovableItem) item);
		} else {
			throw new InvalidItemException("This is not a movable item, and therfore cannot be picked up");
		}
	}

	public void add(MovableItem item){
		items.add(item);
	}
	
	/**
	 * 
	 * @param item to be droped and returned to the floor
	 * @throws InvalidItemException 
	 */
	public void drop(MovableItem item) throws InvalidItemException{
		if (items.contains(item)){
			items.remove(item);
			character.getRoom().addItem(item);
		} else {
			throw new InvalidItemException("Item is not contained in inventory");
		}
	}

}
