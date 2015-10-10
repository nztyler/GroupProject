package GameWorld;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */

public class Character {

	private final String name;
	private Room currentRoom;
	private Inventory inventory;
	
	public Character(String name, Room currentRoom){
		this.name = name;
		this.currentRoom = currentRoom;
		inventory = new Inventory();
	}

	/**
	 * 
	 * @param the new room to be moved in to
	 */
	public void moveRoom(Room newRoom){
		this.currentRoom = newRoom;
	}
	
	/**
	 * 
	 * @return the current room
	 */
	public Room getRoom(){
		return currentRoom;
	}
	
	/**
	 * 
	 * @return this characters inventory
	 */
	public Inventory getInventory(){
		return inventory;
	}
	/**
	 * 
	 * @return the name of this character
	 */
	public String getName(){
		return name;
	}
}
