package GameWorld.objects;

public class Treasure extends Item{

	private static final String IMAGE = "";

	public Treasure(String image){
		super(image);
	}

	/**
	 * The treasure has been found
	 * @return true indicating the game is finished
	 */
	public boolean complete(){
		return true;
	}
}
