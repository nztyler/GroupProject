package GameWorld.objects;

import GameWorld.exception.GameException;

public abstract class ActivatableItem extends MovableItem{
	
	/**
	 * an activatable item is an item that can do something
	 * ie a map can be viewed
	 *    a key can unlock a door
	 *    a lockpick can unlock the treasure
	 *    a trophy can open a broken door
	 *    a light can be turned on
	 * @param image
	 */
	public ActivatableItem(String image) {
		super(image);
	}
	
	public abstract void activate() throws GameException;

}
