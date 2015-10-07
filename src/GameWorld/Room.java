package GameWorld;

import java.util.List;
import java.util.Map;

import GameWorld.objects.Item;

public class Room {

	private String name;	//The name of the room
	private List<Item> items;	//These are the items contained in the room
	private Map<Direction, Door> doors; // Map of direction to door connected to this room
	
	public Room(String name, List<Item> items, Map<Direction, Door> doors){
		this.name = name;
		this.items = items;
		this.doors = doors;
	}
	
	public Map<Direction, Door> getDoors()
	{
		return doors;
	}
	
	public String getName(){
		return name;
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public void draw()
	{
		// draws the room and all items in the room
	}
}
