package Main;

import UserInterface.ApplicationWindow;
import UserInterface.RenderingWindow;

public class Main {

	public static void main(String args[]) {
		new ApplicationWindow(new RenderingWindow(new GameState()));
	}
}
