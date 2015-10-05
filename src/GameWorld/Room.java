package GameWorld;

import java.util.ArrayList;
import java.util.HashMap;

import GameWorld.objects.Item;

public class Room {

	private String name;	//The name of the room
	private ArrayList<Item> items;	//These are the items contained in the room
	private ArrayList<Room> connectedRooms;	//These are the rooms that are connected to this
	private HashMap<Room, Direction> roomsWithDirection;	//Rooms including the direction to which the rooms are facing
	
	public Room(String name){
		this.name = name;
		items = new ArrayList<Item>();
		connectedRooms = new ArrayList<Room>();
		roomsWithDirection = new HashMap<Room, Direction>();
	}
	
	public void addConnectedRoom(Room room, Direction direction){
		connectedRooms.add(room);
		roomsWithDirection.put(room,  direction);
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<Item> getItems(){
		return items;
	}
}
