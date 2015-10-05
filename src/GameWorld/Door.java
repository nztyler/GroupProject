package GameWorld;

public class Door {
	
	private Room room1;
	private Room room2;
	
	/**
	 * A door is the only way to go from one room to another
	 * @param room1 is the room on one side of the door
	 * @param room2 is the room on the other side of the door
	 */
	public Door(Room room1, Room room2){
		this.room1 = room1;
		this.room2 = room2;
	}
	
	public Room getNextRoom(Room room){
		if (room1 == room){
			return room2;
		} else if (room2 == room){
			return room1;
		} else {
			return null; //Incorrect room input
		}
	}
}
