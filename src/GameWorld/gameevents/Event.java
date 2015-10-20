package GameWorld.gameevents;

public abstract class Event {
	
	private Event nextEvent = null;
	
	/**
	 * applies the event, and does whatever specific 
	 * task is needed
	 */
	public abstract void apply();
}
