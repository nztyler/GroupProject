package GameWorld.exception;

public class InvalidOpenDoorException extends GameException{
	
	/**
	 * This error class is for catching the errors where a character
	 * is trying to open/go through a door that is closed or locked
	 * @param message to be printed with the error
	 */
	public InvalidOpenDoorException(String message){
		super(message);
	}
	
	public InvalidOpenDoorException(){
		super("You cannot move through an unopenned/lockked door");
	}

}
