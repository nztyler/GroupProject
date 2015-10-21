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
import GameWorld.objects.Table;

public class GameState {
	private Room currentRoom;
	private Inventory invetory;
	
	public GameState()
	{
		currentRoom = createRooms();
	}
	
	private Room createRooms() {
		List<List<List<Item>>> items = new ArrayList<List<List<Item>>>();
		for(int i = 0; i < 3; i++)
		{
			items.add(new ArrayList<List<Item>>());
			for(int k = 0; k < 3; k++)
			{
				items.get(i).add(new ArrayList<Item>());
				for(int j = 0; j < 3; j++)
				{
					items.get(i).get(k).add(new Table());
				}
			}
		}
		items.get(1).get(1).set(2, new Key(null));
		items.get(2).get(1).set(2, null);
		return new Room("Entrance", items, new HashMap<Direction, Door>());
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}
}

