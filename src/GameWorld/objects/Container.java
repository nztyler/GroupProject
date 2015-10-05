package GameWorld.objects;

public class Container implements Item{

	/**
	 * This class will be used to hold multiple items less space is used in the
	 * players inventory
	 */
	
	private Item[] container;
	private int amount;
	
	public Container(){
		container = new Item[5];
		amount = 0;
	}
	
	/**
	 * simply place the item in the container, if there is enough room
	 * @param The item to be placed in the container
	 */
	public void put(Item item){
		if (amount == container.length){
			System.out.println("Container Class - There is not enough room in  container");
			return;
		}
		container[amount] = item;
	}

	/**
	 * 
	 * @param The index of the item in the container that you want to get
	 * @return The item at that specific index
	 */
	public Item get(int index){
		return container[index];
	}
	
	/**
	 * Essentially discards all items currently in  container
	 */
	public void discardAll(){
		for (int i = 0; i < container.length; i++){
			container[i] = null;
		}
	}
}
