package UserInterface;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ApplicationWindow {
	private JFrame frame;
	
	public ApplicationWindow()
	{
		frame = new JFrame();
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		setMenu();
		//frame.add(getRenderWindow());
		setControlButtons();
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.pack();
	}
	
	public void setMenu()
	{
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Game");
		JMenuItem item = new JMenuItem("Join Game");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				joinGame();
			}
		});
		menu.add(item);
		bar.add(menu);
		frame.setJMenuBar(bar);
	}
	
	public void setControlButtons()
	{
		JButton button = new JButton("Left");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveLeft();
			}
		});
		frame.add(button);
		button = new JButton("Up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveUp();
			}
		});
		frame.add(button);
		button = new JButton("Down");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveDown();
			}
		});
		frame.add(button);
		button = new JButton("Right");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//moveRight();
			}
		});
		frame.add(button);
		button = new JButton("Interact");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
				//interact();
			}
		});
		frame.add(button);
	}
	
	public void joinGame()
	{
		//call join game method
	}
	
	public static void main(String args[]) {
		new ApplicationWindow();
	}
}
