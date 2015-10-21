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
	/**
	 * 
	 * @return a mapping of all of the doors connected to this room and directions
	 */
	public Map<Direction, Door> getDoors(){
		return doors;
	}
	
	public String getName(){
		return name;
	}
	
	/**
	 * get the item that is at this position in the room
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public Item getItem(int x, int y, int z){
		return items[x][y][z];
	}
	
	/**
	 * get the 3D-array of items contained in this room
	 * @return
	 */
	public Item[][][] getItems(){
		return items;
	}
	
	/**
	 * add an item to this position in the room
	 * @param item
	 * @param x
	 * @param y
	 * @param z
	 */
	public void addItem(Item item, int x, int y, int z){
		items[x][y][z] = item;
	}
	
	public void draw(Direction directionFrom){
		// uses directionFrom to draw the room from the view given by entering from that direction
		// draws the room and all items in the room
	}

	/**
	 * add a direction and door to the mapping of doors
	 * @param direction
	 * @param door
	 */
	public void addDoor(Direction direction, Door door) {
		doors.put(direction, door);
	}

	/**
	 * check to see if the input item is contained in this room
	 * @param item
	 * @return true if the item is contained
	 */
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
	
	/**
	 * remove this item from the room, throw an exception if the
	 * item is not currently in this room
	 * @param item
	 * @throws InvalidItemException
	 */
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
