package UserInterface;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Main.GameState;

/**
 * 
 * @author Gareth Smith
 * 
 *
 */
public class RenderingWindow extends JPanel{
	
	private GameState game;
	
	public RenderingWindow(GameState game){
		Dimension size = new Dimension(1000, 600);
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
		this.game = game;
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
			Image tempImage = ImageIO.read(new File(game.getCurrentRoom().IMAGE));
			g.drawImage(tempImage, 0, 0, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
