package GameWorld.objects;

public abstract class ActivatableItem extends MovableItem{

	public ActivatableItem(String image) {
		super(image);
	}
	
	public abstract void activate();

}
