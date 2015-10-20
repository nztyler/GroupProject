package GameWorld.objects;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Treasure extends Item{

	private static final String IMAGE = "";

	private LockPick lockPick;
	
	public Treasure(LockPick lockpick){
		super(IMAGE);
		this.lockPick = lockPick;
	}

	public void useLockPick(LockPick lockPick){
		if (this.lockPick == lockPick){
			complete();
		} else {
			System.out.println("You have failed at picking this lock");
			System.out.println("Find another pick, and try again");
		}
	}
	/**
	 * The treasure has been found
	 * @return true indicating the game is finished
	 */
	public boolean complete(){
		System.out.println("Congratulations, you have won!");
		return true;
	}
}
