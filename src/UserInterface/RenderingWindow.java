package UserInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import GameWorld.gameevents.EventHelper;
import GameWorld.objects.Item;
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
	    addMouseListener(new MouseAdapter() {
	    	public void mousePressed(MouseEvent event)
	    	{
	    		EventHelper.newEvent(event, game);
	    	}
	    });
		this.game = game;
	}

	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
        	Image roomImage = createRoomImage();
        	g.drawImage(roomImage, 0, 0, this);
        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public Image createRoomImage() throws IOException
	{
		BufferedImage roomImage = ImageIO.read(new File(game.getCurrentRoom().IMAGE));
		Graphics g = roomImage.getGraphics();
		BufferedImage tempBufImage;
		Item[][][] items = game.getCurrentRoom().getItems();
		Image tempImage;
		for(int j = 0; j < items.length; j++)
		{
			for(int k = 0; k < items[0].length; k++)
			{
				for(int i = 0; i < items[k].length; i++)
				{
					if(items[j][k][i] != null)
					{						
						tempBufImage = ImageIO.read(new File(items[j][k][i].getImage()));
						Color color = new Color(tempBufImage.getRGB(0, 0));
						ImageFilter filter = new RGBImageFilter() {
							
							// the color we are looking for... Alpha bits are set to opaque
							public int markerRGB = color.getRGB() | 0xFF000000;
							
							public final int filterRGB(int x, int y, int rgb) {
								if ((rgb | 0xFF000000) == markerRGB) {
									// Mark the alpha bits as zero - transparent
									return 0x00FFFFFF & rgb;
								} else {
									// nothing to do
									return rgb;
								}
							}
						};
						
						ImageProducer ip = new FilteredImageSource(tempBufImage.getSource(), filter);
						tempImage = Toolkit.getDefaultToolkit().createImage(ip);
						g.drawImage(tempImage, 165 + (k*214), 270 + (i*110) - (j*40), this);
					}
				}
			}
		}
		return roomImage;
	}
}
