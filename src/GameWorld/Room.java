package GameWorld;

import java.util.List;
import java.util.Map;

import GameWorld.exception.InvalidItemException;
import GameWorld.objects.Item;

/**
 * 
 * @author Tyler Campbell & Gareth Smith
 * 
 *
 */
public class Room {

	public final String IMAGE = "Images/Room_Basic.png";
	private String name;	//The name of the room
	private Item[][][] items; //These are the items contained in the room, null means there is no item at that location
	private Map<Direction, Door> doors; // Map of direction to door connected to this room
	
	public Room(String name, Item[][][] items, Map<Direction, Door> doors){
		this.name = name;
		this.items = items;
		this.doors = doors;
	}
	
	public Map<Direction, Door> getDoors(){
		return doors;
	}
	
	public String getName(){
		return name;
	}
	
	public Item getItem(int x, int y, int z){
		return items[x][y][z];
	}
	
	public Item[][][] getItems(){
		return items;
	}
	
	public void addItem(Item item, int x, int y, int z){
		items[x][y][z] = item;
	}
	
	public void draw(Direction directionFrom){
		// uses directionFrom to draw the room from the view given by entering from that direction
		// draws the room and all items in the room
	}

	public void addDoor(Direction direction, Door door) {
		doors.put(direction, door);
	}

	public boolean contains(Item item){
		for (int x = 0; x < items.length; x++){
			for (int y = 0; y < items[x].length; y++){
				for (int z = 0; z < items[x][y].length; z++){
					if (items[x][y][z] == item){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void remove(Item item) throws InvalidItemException {
		if (!contains(item)){
			throw new InvalidItemException("This item is not contained in this room");
		}
		for (int x = 0; x < items.length; x++){
			for (int y = 0; y < items[x].length; y++){
				for (int z = 0; z < items[x][y].length; z++){
					if (items[x][y][z] == item){
						items[x][y][z] = null;
						return;
					}
				}
			}
		}
		
		
	}
}
