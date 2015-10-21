package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import UserInterface.ApplicationWindow;
import UserInterface.RenderingWindow;
import GameWorld.Direction;
import GameWorld.Door;
import GameWorld.Inventory;
import GameWorld.Room;
import GameWorld.objects.Item;
import GameWorld.objects.Key;

public class GameState {
	private Room currentRoom;
	private Inventory invetory;
	
	public GameState()
	{
		currentRoom = createRooms();
	}
	
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
		return new Room("Entrance", items, new HashMap<Direction, Door>());
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}
}

