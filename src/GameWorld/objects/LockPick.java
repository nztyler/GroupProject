package GameWorld.objects;

public class LockPick extends ActivatableItem{

	private static final String IMAGE= "";
	
	private Treasure treasure;
	
	public LockPick(Treasure treasure) {
		super(IMAGE);
		this.treasure = treasure;
	}

	@Override
	public void activate() {
		treasure.useLockPick(this);
	}
}
