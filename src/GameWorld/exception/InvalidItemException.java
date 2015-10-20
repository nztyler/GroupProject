package GameWorld.exception;

public class InvalidItemException extends GameException{

	/**
	 * This error class is to catch the exceptions for when a 
	 * character is trying to pick up an unmovable item
	 * @param message is the error message
	 */
	public InvalidItemException(String message){
		super(message);
	}
	
	public InvalidItemException(){
		super("Expected MovableItem, got Item");
	}
}
