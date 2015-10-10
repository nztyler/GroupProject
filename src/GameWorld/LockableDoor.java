package GameWorld;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class LockableDoor extends Door {

	private boolean isLocked;
	
	public LockableDoor(Room room1, Room room2) {
		super(room1, room2);
		this.isLocked = false;
	}

	public void useKey(){
		isLocked = !isLocked;
	}
}
