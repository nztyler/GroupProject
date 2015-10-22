package Main;

import java.util.HashMap;

import UserInterface.ActToPerform;
import GameWorld.Direction;
import GameWorld.Door;
import GameWorld.Room;
import GameWorld.objects.Item;
import GameWorld.objects.Key;

public class GameState {
	private Room currentRoom;
	private ActToPerform selected = ActToPerform.NOTHING;
	
	public GameState()
	{
		currentRoom = createRooms();
	}
	
	/**
	 * Creates all rooms and items in those rooms and connects them together.
	 * @return Starting Room
	 */
	private Room createRooms() {
		Item[][][] items = new Item[3][3][3];
		for(int i = 0; i < 3; i++)
		{
			for(int k = 0; k < 3; k++){
				for(int j = 0; j < 3; j++){
					items[i][k][j] = new Key(null);
				}
			}
		}
		items[1][1][2] = new Key(null);
		items[2][1][2] = null;
		return new Room("Entrance", items, new HashMap<Direction, Door>());
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public ActToPerform getSelected()
	{
		return selected;
	}
	
	public void setSelected(ActToPerform act)
	{
		selected = act;
	}
}

