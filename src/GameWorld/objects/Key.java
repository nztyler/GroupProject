package GameWorld.objects;

import GameWorld.Door;
import GameWorld.exception.InvalidItemException;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Key extends ActivatableItem{

	private static final String IMAGE= "Images/Key.png";

	private Door door;
	
	public Key(Door door){
		super(IMAGE);
		this.door = door;
	}

	@Override
	public void activate() throws InvalidItemException {
		if (door.isKey(this)){
			door.useKey(this);
		} else {
			throw new InvalidItemException("This key does not open this door");
		}
	}
	
	public String getImage()
	{
		return IMAGE;
	}

	public void setDoor(Door lockedDoor) {
		this.door = lockedDoor;
		
	}
}
