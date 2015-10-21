package GameWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import GameWorld.exception.InvalidRoomInputException;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */

public class Character {

	private final String name;
	private Room currentRoom;
	private Inventory inventory;
	
	public Character(String name, Room currentRoom){
		this.name = name;
		this.currentRoom = currentRoom;
		inventory = new Inventory(this);
	}

	/**
	 * 
	 * @param the new room to be moved in to
	 * @throws InvalidRoomInputException 
	 */
	public void moveRoom(Room newRoom) throws InvalidRoomInputException{
		boolean isMovable = false;
		outer : for (Door d : currentRoom.getDoors().values()){
			if (d.getRoom1() == newRoom || d.getRoom2() == newRoom){
				//the new room can be reached from the current room
				isMovable = true;
				break outer;
			}
		}
		
		if (isMovable){
			this.currentRoom = newRoom;
		} else {
			throw new InvalidRoomInputException("The input room cannot be reached from this room");
		}
	}
	
	/**
	 * 
	 * @return the current room
	 */
	public Room getRoom(){
		return currentRoom;
	}
	
	/**
	 * 
	 * @return this characters inventory
	 */
	public Inventory getInventory(){
		return inventory;
	}
	
	public void setInventory(Inventory inventory){
		this.inventory = inventory;
	}
	/**
	 * 
	 * @return the name of this character
	 */
	public String getName(){
		return name;
	}
}
