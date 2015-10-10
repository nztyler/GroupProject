package GameWorld.objects;

import GameWorld.Room;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Item {

	//draw method
	private String image;

	public Item(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}
}
