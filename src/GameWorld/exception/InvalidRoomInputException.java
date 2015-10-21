package GameWorld.exception;

public class InvalidRoomInputException extends GameException{
	
	public InvalidRoomInputException(String message){
		super(message);
	}
	
	public InvalidRoomInputException(){
		super("The input room is not connected to this room");
	}

}
