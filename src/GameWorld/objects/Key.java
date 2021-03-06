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
	private static final String INV_IMAGE= "Images/Inv_Key.png";

	private Door door;
	
	public Key(Door door){
		super(IMAGE);
		this.door = door;
	}

	//this looks like trouble. Needs to be fixed
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

	public String getInvImage()
	{
		return INV_IMAGE;
	}
	
	public void setDoor(Door lockedDoor) {
		this.door = lockedDoor;
		
	}
}
