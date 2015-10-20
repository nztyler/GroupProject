package GameWorld;

import java.awt.List;
import java.util.ArrayList;

import GameWorld.objects.MovableItem;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Inventory {

	/* Inventory is basically a container, so do I really need this class? */

	private ArrayList<MovableItem> items;

	public Inventory(){
		this.items = new ArrayList<MovableItem>();
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
	 */
	public void put(MovableItem item){
		items.add(item);
	}

	/**
	 * 
	 * @param item to be droped and returned to the floor
	 */
	public void drop(MovableItem item){
		if (items.contains(item)){
			items.remove(item);
			//return the item back to the floor
		} else {
			System.out.println("Inventory class - This item in not contained in your inventory");
		}
	}

}
