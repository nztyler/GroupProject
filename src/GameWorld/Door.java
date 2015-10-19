package GameWorld;

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
	private boolean isLocked;
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

	public Room getNextRoom(Room room){
		if (room1 == room){
			return room2;
		} else if (room2 == room){
			return room1;
		} else {
			return null; //Incorrect room input
		}
	}

	public void useKey(Key key){
		if (this.key == key){
			System.out.println("The door is now " + (isLocked ? "locked" : "unlocked"));
			isLocked = !isLocked;
		} else {
			System.out.println("This is not the correct key");
		}
	}
}
