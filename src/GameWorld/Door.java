package GameWorld;

import GameWorld.exception.InvalidRoomInputException;
import GameWorld.objects.Key;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Door {

	private Room room1;
	private Room room2;
	protected boolean isLocked;
	private Key key;

	/**
	 * A door is the only way to go from one room to another
	 * @param room1 is the room on one side of the door
	 * @param room2 is the room on the other side of the door
	 */
	public Door(Room room1, Room room2){
		this.room1 = room1;
		this.room2 = room2;
		isLocked = false;
	}

	/**
	 * A door is the only way to go from one room to another and the
	 * key is used to lock the door
	 * @param room1 is the room on one side of the door
	 * @param room2 is the room on the other side of the door
	 * @param key is the key that is used to unlock/lock the door
	 */
	public Door(Room room1, Room room2, Key key){
		this.room1 = room1;
		this.room2 = room2;
		this.key = key;
		isLocked = true;
	}
	
	public Room getRoom1(){
		return room1;
	}
	
	public Room getRoom2(){
		return room2;
	}

	/**
	 * 
	 * @param room is room that the character is in, and it will return
	 * the room on the other side of the door
	 * @return the room on the other side of the door. Null if 
	 *     an invalid room has been entered
	 */
	public Room getNextRoom(Room room){ //throws InvalidRoomInputException{
		if (room1 == room){
			return room2;
		} else if (room2 == room){
			return room1;
		} else {
			return null;
			//throw new InvalidRoomInputException("Input room is not connected to this room");
		}
	}
	
	/**
	 * check if this key is the correct key for this door
	 * @param key
	 * @return
	 */
	public boolean isKey(Key key){
		return this.key == key;
	}

	/**
	 * 
	 * @param key is the key that is trying to be used to lock/unlock the door
	 */
	public void useKey(Key key){
		if (this.key == key){
			System.out.println("The door is now " + (isLocked ? "locked" : "unlocked"));
			isLocked = !isLocked;
		} else if  (this.key == null){
			System.out.println("This door cannot be locked, and this key locks another door");
		} else {
			System.out.println("This is not the correct key for this door");
			
		}
	}
}
