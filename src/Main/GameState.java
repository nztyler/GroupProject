package Main;

import java.util.ArrayList;
import java.util.HashMap;

import UserInterface.ApplicationWindow;
import UserInterface.RenderingWindow;
import GameWorld.Direction;
import GameWorld.Door;
import GameWorld.Inventory;
import GameWorld.Room;
import GameWorld.objects.Item;

public class GameState {
	private Room currentRoom;
	private Inventory invetory;
	
	public GameState()
	{
		currentRoom = createRooms();
	}
	
	private Room createRooms() {
		return new Room("Entrance", new ArrayList<Item>(), new HashMap<Direction, Door>());
	}

	public static void main(String args[]) {
		new ApplicationWindow(new RenderingWindow(new GameState()));
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}
}

