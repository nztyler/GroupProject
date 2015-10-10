package GameWorld;

import java.awt.List;
import java.util.ArrayList;

import GameWorld.objects.MovableItem;

public class Inventory {

	/* Inventory is basically a container, so do I really need this class? */

	private ArrayList<MovableItem> items;

	public Inventory(){
		this.items = new ArrayList<MovableItem>();
	}

	public ArrayList<MovableItem> getItems(){
		return items;
	}

	public void put(MovableItem item){
		items.add(item);
	}

	public void drop(MovableItem item){
		if (items.contains(item)){
			items.remove(item);
			//return the item back to the floor
		} else {
			System.out.println("Inventory class - This item in not contained in your inventory");
		}
	}

}
