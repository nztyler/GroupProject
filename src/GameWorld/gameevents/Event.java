package GameWorld.gameevents;

import GameWorld.exception.GameException;
import GameWorld.exception.InvalidRoomInputException;

public abstract class Event {
	
	private Event nextEvent = null;
	
	/**
	 * applies the event, and does whatever specific 
	 * task is needed
	 * @throws InvalidRoomInputException 
	 * @throws GameException 
	 */
	public abstract void apply() throws GameException;
}
