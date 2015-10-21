package GameWorld.tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import GameWorld.Character;
import GameWorld.Direction;
import GameWorld.Door;
import GameWorld.Inventory;
import GameWorld.Room;
import GameWorld.exception.GameException;
import GameWorld.exception.InvalidRoomInputException;
import GameWorld.gameevents.ChangeRoomEvent;
import GameWorld.gameevents.DropItemEvent;
import GameWorld.gameevents.PickUpItemEvent;
import GameWorld.objects.Item;
import GameWorld.objects.Key;
import GameWorld.objects.Light;
import GameWorld.objects.MovableItem;
import GameWorld.objects.Table;

public class EventTests {
	
	/**
	 * Sets up a dummy game for testing purposes
	 * @return the character that has been created
	 */
	public Character setUpGame(){	
		//room contains these items
		Item[][][] items = new Item[3][3][3];
		items[0][0][0] = new Light();
		items[0][0][1] = new Key(null);
		
		//create the rooms
		Room room1 = new Room("Entrance", items, new HashMap<Direction, Door>());
		Room room2 = new Room("Bathroom", null, new HashMap<Direction, Door>());
		//create the doors
		Door unlockedDoor = new Door(room1, room2);
		Key key = new Key(null);
		Door lockedDoor = new Door(room2, room1, key);
		key.setDoor(lockedDoor);
		//add the doors to the rooms
		room1.addDoor(Direction.NORTH, unlockedDoor);
		room2.addDoor(Direction.SOUTH, lockedDoor);
		//create character, currently in room1
		Character character = new Character("Tyler", room1);
		//inventory contains the key to the lockedDoor
		character.getInventory().add(key);
		
		return character;
	}
	
	/**
	 * This test should pass. The character is trying to change rooms into 
	 * the next one through a door
	 */
	@Test
	public void testValidChangeRoom() {
		Character character = setUpGame();
		Door connectedDoor = character.getRoom().getDoors().get(Direction.NORTH);
		//get the other room
		Room otherRoom = connectedDoor.getNextRoom(character.getRoom());
		ChangeRoomEvent event = new ChangeRoomEvent(character, otherRoom);
		try {
			event.apply();
		} catch (GameException e) {
			fail("Not yet implemented");
		}
	}
	
	/**
	 * This test should fail. The character is trying to change rooms to a room
	 * that is not connected to this room and therefore will throw an exception
	 */
	@Test
	public void testInvalidChangeRoom() {
		Character character = setUpGame();
		Room otherRoom = new Room("Lounge", null, null);
		ChangeRoomEvent event = new ChangeRoomEvent(character, otherRoom);
		try {
			event.apply();
			fail("Not yet implemented");
		} catch (GameException e) {
		}
	}
	
	//drop item tests
	/**
	 * This test should pass. It is trying to drop an item that is currently
	 * already in the characters inventory. There is nothing wrong with this
	 */
	@Test
	public void testvalidDropItem() {
		Character character = setUpGame();
		MovableItem toDrop = character.getInventory().getItems().get(0);
		DropItemEvent event = new DropItemEvent(character, toDrop, 2, 0, 0 );
		try {
			event.apply();
			//check if the room now contains the item
			assertTrue (character.getRoom().contains(toDrop));
		} catch (GameException e){
			fail("This should not throw an error");
		}
	}
	
	/**
	 * This test should fail. It is trying to drop an item that is not in the characters
	 * inventory and therefore must throw an error
	 */
	@Test
	public void testInvalidDropItem() {
		Character character = setUpGame();
		DropItemEvent event = new DropItemEvent(character, new Light(), 2, 0, 0);
		try {
			event.apply();
			fail("Cannot drop an item that is not currently in this characters inventory");
		} catch (GameException e){
			
		}
	}
	
	//pick up item tests
	/**
	 * This should pass. When an item is picked up, it is taken from the room
	 * and added to this characters inventory
	 */
	@Test
	public void testvalidPickUpItem() {
		Character character = setUpGame();
		MovableItem item = (MovableItem) character.getRoom().getItem(0,0,0);
		PickUpItemEvent event = new PickUpItemEvent(character, item);
		try {
			event.apply();
			//check to see if the room contains the item
			assertFalse(character.getRoom().contains(item));
		} catch (GameException e) {
			fail("This should not throw an error");
		}
	}
	
	/**
	 * This test should fail. It is trying to pick up an unmovable object from the
	 * room which will throw an error
	 */
	@Test
	public void testInvalidPickUpItem() {
		Character character = setUpGame();
		Item item = new Table();
		PickUpItemEvent event = new PickUpItemEvent(character, item);
		try {
			event.apply();
			fail("Cannot pick up an unmovable item");
		} catch (GameException e) {
		}
	}

}
