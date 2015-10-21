package GameWorld.exception;

public class InvalidDoorInputException extends GameException{

	public InvalidDoorInputException(String message){
		super(message);
	}
	
	public InvalidDoorInputException(){
		super("Input door is not in this current room");
	}
}
