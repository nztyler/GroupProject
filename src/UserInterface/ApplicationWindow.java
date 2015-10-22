package UserInterface;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameWorld.gameevents.EventHelper;
import Main.GameState;
import UserInterface.ActToPerform;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * 
 * @author Gareth Smith
 * 
 *
 */
public class ApplicationWindow {
	private JFrame frame;
	
	public ApplicationWindow(RenderingWindow window)
	{
		frame = new JFrame();
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(window);
		frame.add(setButtons());
		frame.setVisible(true);
		frame.pack();
	}
	
	/**
	 * Creates and adds all buttons to the frame
	 * @return JPanel holding the inventory and control buttons
	 */
	public JPanel setButtons() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel.add(setInventoryButtons());
		buttonPanel.add(setControlButtons());
		return buttonPanel;
	}
	
	public JPanel setInventoryButtons() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		JButton button = new JButton(new ImageIcon("Images/Inv_Empty.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				GameState game = ((RenderingWindow)frame.getComponentAt(10, 10)).getGame();
				game.setSelected(ActToPerform.DROP);
			}
		});
		buttonPanel.add(button);
		return buttonPanel;
	}


	public JPanel setControlButtons()
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		JButton button = new JButton("Left");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveLeft();
			}
		});
		buttonPanel.add(button);
		button = new JButton("Up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveUp();
			}
		});
		buttonPanel.add(button);
		button = new JButton("Down");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveDown();
			}
		});
		buttonPanel.add(button);
		button = new JButton("Right");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveRight();
			}
		});
		buttonPanel.add(button);
		button = new JButton("Interact");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//interact();
			}
		});
		buttonPanel.add(button);
		return buttonPanel;
	}
	
	public void joinGame()
	{
		//call join game method
	}
}
