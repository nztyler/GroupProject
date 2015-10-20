package GameWorld;

import GameWorld.exception.InvalidItemException;
import GameWorld.objects.Trophy;

public class BrokenDoor extends Door{
	
	private boolean isOpen;
	
	public BrokenDoor(Room room1, Room room2){
		super(room1, room2);
		isLocked = true;
	}
	
	/**
	 * a broken door cannot be opened with a key, but rather a
	 * trophy object must be thrown at it to break it down
	 * @param trophy that is thrown
	 * @throws InvalidItemException 
	 */
	public void breakOpen(Trophy trophy) throws InvalidItemException{
		if (trophy != null){
			isLocked = false;
		} else {
			throw new InvalidItemException("A trophy was meant to be provided, null was given");
		}
	}

}
