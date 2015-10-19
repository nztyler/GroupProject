package GameWorld;

import GameWorld.objects.Key;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class LockableDoor extends Door {

	private boolean isLocked;
	
	public LockableDoor(Room room1, Room room2, Key key) {
		super(room1, room2, key);
		this.isLocked = false;
	}

	public void useKey(){
		isLocked = !isLocked;
	}
}
