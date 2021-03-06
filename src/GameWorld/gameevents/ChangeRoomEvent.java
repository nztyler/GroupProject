package GameWorld.gameevents;

import GameWorld.Room;
import GameWorld.exception.GameException;
import GameWorld.exception.InvalidRoomInputException;
import GameWorld.Character;

public class ChangeRoomEvent extends Event{

	private Character character;
	private Room room;
	
	/**
	 * This event will be used when a character is trying to move from 
	 * one room to the next
	 * @param character
	 * @param room
	 */
	public ChangeRoomEvent(Character character, Room room){
		this.character = character;
		this.room = room;
	}
	
	@Override
	public void apply() throws GameException{
			character.moveRoom(room);
	}

}
