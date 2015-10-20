package GameWorld.objects;

import GameWorld.exception.GameException;

public abstract class ActivatableItem extends MovableItem{

	public ActivatableItem(String image) {
		super(image);
	}
	
	public abstract void activate() throws GameException;

}
