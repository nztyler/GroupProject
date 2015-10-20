package GameWorld.gameevents;

import GameWorld.Room;
import GameWorld.exception.InvalidRoomInputException;
import GameWorld.Character;

public class ChangeRoomEvent extends Event{

	private Character character;
	private Room room;
	
	public ChangeRoomEvent(Character character, Room room){
		this.character = character;
		this.room = room;
	}
	
	@Override
	public void apply() {
		try {
			character.moveRoom(room);
		} catch (InvalidRoomInputException e) {
			e.printStackTrace();
		}
	}

}
