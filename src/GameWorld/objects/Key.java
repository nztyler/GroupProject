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
	public void activate() {
			door.useKey(this);
	}

}
