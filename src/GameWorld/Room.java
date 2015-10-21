package GameWorld;

import java.util.List;
import java.util.Map;

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
	private List<List<List<Item>>> items; //These are the items contained in the room, null means there is no item at that location
	private Map<Direction, Door> doors; // Map of direction to door connected to this room
	
	public Room(String name, List<List<List<Item>>> items, Map<Direction, Door> doors){
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
	
	public List<List<List<Item>>> getItems(){
		return items;
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void draw(Direction directionFrom){
		// uses directionFrom to draw the room from the view given by entering from that direction
		// draws the room and all items in the room
	}
}
