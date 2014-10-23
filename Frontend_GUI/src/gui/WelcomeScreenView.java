package gui;

/** Created October 13th, 2014
 * By: Matthew Jallouk and Adam Claiborne
 * 
 * WelcomeScreenView class will display the particular direct the user if they 
 * wish to login/change password/create a new acount. These the options they have
 * to choose from in terms of options.
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeScreenView
{

	// Define instance variables for the WelcomeScreenView class
	private LoginView loginView = new LoginView();
	private SignUpView signUpView = new SignUpView();
	private ChangePasswordView changePassView = new ChangePasswordView();
	private DeleteAccountView deleteAccountView = new DeleteAccountView();
	/**
	 * Constructor to create the WelcomeScreenView for panels to be added.
	 * Creates the first panel to be added.
	 * 
	 * @param manPanel			primary panel that holds all sub-panels
	 * @param frame	            frame that holds the main panel
	 */
	public void loadGUI(final JPanel mainPanel, final JFrame frame)
	{
		final JPanel welcomePanel = new JPanel(new FlowLayout());
		JLabel welcomeLabel = new JLabel();
		JButton loginButton = new JButton();
		JButton createAccountButton = new JButton();
		JButton changePassButton = new JButton();
		JButton deleteButton = new JButton();
		
		welcomeLabel.setText("Welcome to the Login Place!");
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

		loginButton.setText("Login!");
		loginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		createAccountButton.setText("Create an Account!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		changePassButton.setText("Change Password");
		changePassButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		deleteButton.setText("Delete Account");
		deleteButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		frame.add(mainPanel);
		mainPanel.add(welcomePanel);
		welcomePanel.add(welcomeLabel);
		welcomePanel.add(createAccountButton);
		welcomePanel.add(loginButton);
		welcomePanel.add(changePassButton);
		welcomePanel.add(deleteButton);
		
		frame.setVisible(true);
		frame.setEnabled(true);
		frame.setSize(500, 200);
		frame.setResizable(false);
		frame.setTitle("Welcome to Login!");

		/*
		 * Action listener to show the LoginScreenView
		 */
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				loginView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				mainPanel.remove(welcomePanel);
				frame.setTitle("Login Here!");
			}
		});

		/*
		 * Action listener to show the CreateAccountScreenView
		 */
		createAccountButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				signUpView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				frame.remove(welcomePanel);
				frame.setTitle("Create Your Account You Goofball");
			}
		});

		/*
		 * Action listener to show the ChangePasswordScreenView
		 */
		changePassButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				changePassView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				frame.remove(welcomePanel);
				frame.setTitle("Change Your Password");
			}
		});
		
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)
			{
				deleteAccountView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				frame.remove(welcomePanel);
				frame.setTitle("Delete Your Account");
			}
		});
	}
}
