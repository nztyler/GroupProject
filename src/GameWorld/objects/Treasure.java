package GameWorld.objects;

public class Treasure implements Item{

	public Treasure(){
		
	}
	
	/**
	 * The treasure has been found
	 * @return true indicating the game is finished
	 */
	public boolean complete(){
		return true;
	}
}
