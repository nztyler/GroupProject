package GameWorld.objects;

public class Trophy extends MovableItem{

	private static String IMAGE = "";
	
	/**
	 * A trophy is used to be thrown at a broken door to
	 * force it open. A broken door cannot be opened by a key, therefore
	 * it needs to be forced open
	 */
	public Trophy() {
		super(IMAGE);
	}
}
