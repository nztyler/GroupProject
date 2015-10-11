package UserInterface;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ApplicationWindow {
	private JFrame frame;
	
	public ApplicationWindow(RenderingWindow window)
	{
		frame = new JFrame();
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());
		setMenu();
		frame.add(window);
		setControlButtons();
		frame.setSize(1000,1000);
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
		frame.add(buttonPanel);
	}
	
	public void joinGame()
	{
		//call join game method
	}
}
