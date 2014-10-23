package gui;

/** Created October 13th, 2014
 * By: Matthew Jallouk and Adam Claiborne
 *  
 *  HomeScreen class will create the frame to hold all of the panels.
 *  It is also responsible for launching the program.
 * 
 */

import javax.swing.JFrame;

public class HomeScreen
{

	// Instance variables
	private static JFrame frame;

	/**
	 * Main method to launch the application.
	 * 
	 */
	public static void main(String[] args)
	{
		createGUI();
		WelcomeScreenView gui = new WelcomeScreenView();
		gui.loadGUI(frame);
	}

	/**
	 * Initializes the main frame to show up on the screen.
	 * 
	 */
	public static void createGUI()
	{
		frame = new JFrame();
	}

}
