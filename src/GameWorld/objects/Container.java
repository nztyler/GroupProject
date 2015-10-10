package GameWorld.objects;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Container extends MovableItem{

	/**
	 * This class will be used to hold multiple items less space is used in the
	 * players inventory
	 */
	private MovableItem[] container;
	private int amount;
	private Key key;
	private boolean locked;

	/**
	 * Constructs a container that can never be locked
	 */
	public Container(String image){
		super(image);
		container = new MovableItem[5];
		amount = 0;
		key = null;
		locked = false;
	}

	/**
	 * Constructs a container that can be locked
	 * @param key that can lock/unlock the container
	 */
	public Container(String image, Key key){
		super(image);
		container = new MovableItem[5];
		amount = 0;
		this.key = key;
		locked = true;
	}

	/**
	 * Simply place the item in the container, if there is enough room
	 * @param The item to be placed in the container
	 */
	public void put(MovableItem item){
		if (key == null /* the key is not null but the players inventory contains the key */){
			if (amount == container.length){
				System.out.println("Container Class - There is not enough room in  container");
				return;
			}
			container[amount] = item;
			amount++;
		}
	}

	/**
	 *
	 * @param The index of the item in the container that you want to get
	 * @return The item at that specific index
	 */
	public Item get(int index){
		return container[index];
	}

	public void drop(int index){
		if (index < container.length && index >= 0 && container[index] != null){
			container[index] = null;
			//return the item back to the floor
		}
	}

	/**
	 * Essentially discards all items currently in  container
	 */
	public void discardAll(){
		for (int i = 0; i < container.length; i++){
			container[i] = null;
		}
	}

	public boolean isLocked(){
		return locked;
	}

	public int getAmount(){
		return amount;
	}

	public Key getkey(){
		return key;
	}
}
