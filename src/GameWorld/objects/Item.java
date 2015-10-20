package GameWorld.objects;

import GameWorld.Room;

/**
 * 
 * @author Tyler Campbell
 * 
 *
 */
public class Item {

	//position of the image on the canvas
	private int x;
	private int y;
	private int z;
		
	//name of the file for drawing
	private String image;

	public Item(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}
	
	public void setPosition(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getZ(){
		return z;
	}
}
