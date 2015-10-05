package GameWorld.objects;

public class Light implements Item{

	/**
	 * This object will be used to turn on a torch for the rooms that are too dark to 
	 * see in. It is an object placed on the map which can be picked up, placed in their
	 * inventory and used when the button is pressed
	 */
	
	public boolean turnedOn;
	
	public Light(){
		this.turnedOn = false;
	}
	/**
	 * Method call to either turn the torch on (if it is off) or turn the torch off (if 
	 * it is on)
	 */
	public void pressSwitch(){
		turnedOn = !turnedOn;
	}
}
