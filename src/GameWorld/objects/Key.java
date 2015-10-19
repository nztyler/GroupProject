package GameWorld.objects;

import GameWorld.Door;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Key extends ActivatableItem{

	private static final String IMAGE= "";

	private Door door;
	
	public Key(Door door){
		super(IMAGE);
		this.door = door;
	}

	@Override
	public void activate(ActivatableItem item) {
		// TODO Auto-generated method stub
		if (item instanceof Key){
			//shall I have a cheacker here to check if the key is for this door?
			door.useKey((Key) item);
		}
	}

}
