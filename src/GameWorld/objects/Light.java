package GameWorld.objects;

public class Light extends MovableItem{

	/**
	 * This object will be used to turn on a torch for the rooms that are too dark to
	 * see in. It is an object placed on the map which can be picked up, placed in their
	 * inventory and used when the button is pressed
	 */

	private static final String IMAGE = "";

	public boolean turnedOn;

	public Light(){
		super(IMAGE);
		this.turnedOn = false;
	}
	/**
	 * Method call to either turn the torch on (if it is off) or turn the torch off (if
	 * it is on)
	 */
	public void pressSwitch(){
		turnedOn = !turnedOn;
	}

	public boolean isOn(){
		return turnedOn;
	}
}
