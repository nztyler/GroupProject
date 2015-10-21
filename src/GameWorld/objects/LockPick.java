package GameWorld.objects;

public class LockPick extends ActivatableItem{

	private static final String IMAGE= "";
	
	private Treasure treasure;
	
	/**
	 * a lockpick is used to unlock the treasure when it has
	 * been found. You cannot win the game without picking the
	 * treasures lock
	 * @param treasure
	 */
	public LockPick(Treasure treasure) {
		super(IMAGE);
		this.treasure = treasure;
	}

	@Override
	public void activate() {
		treasure.useLockPick(this);
	}
}
