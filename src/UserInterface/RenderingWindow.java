package UserInterface;

import javax.swing.JPanel;

import GameWorld.Direction;
import GameWorld.Room;

public class RenderingWindow extends JPanel{
	
	private Room currentRoom;
	private Direction directionFrom;
	
	public RenderingWindow(Room startingRoom, Direction startingDirection)
	{
		currentRoom = startingRoom;
		directionFrom = startingDirection;
	}
	
	public void draw()
	{
		currentRoom.draw(directionFrom);
	}
}
