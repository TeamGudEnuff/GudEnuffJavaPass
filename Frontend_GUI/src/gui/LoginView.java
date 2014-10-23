package gui;

/** Created October 13th, 2014
 * By: Matthew Jallouk and Adam Claiborne
 *  
 *  LoginView class will display the particular view to deal with the user logging
 *  into our password system. This class will access the database and determine if
 *  the particular username/password combination exists. If it does, the user is
 *  able to login successfully, else, the database will generate an error for the
 *  user.
 * 
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import backend.*;

public class LoginView
{

	// Define instance variables for the SignUpView class
	private JPanel loginPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel passwordLabel = new JLabel();
	private JTextField userNameInput = new JTextField("", 15);
	private JPasswordField passwordInput = new JPasswordField("", 15);
	private JButton loginButton = new JButton();
	private JButton changePassButton = new JButton();
	private JButton goBackWelcome = new JButton();
	private ChangePasswordView changePassView = new ChangePasswordView();

	/**
	 * Constructor that will set up the properties for the particular view.
	 * 
	 */
	public LoginView()
	{
		userNameLabel.setText("     Email: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordLabel.setText("Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		loginButton.setText("Login Here!");
		loginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		changePassButton.setText("Change Password");
		changePassButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		goBackWelcome.setText("Go back to Welcome Screen");
		goBackWelcome.setFont(new Font("Times New Roman", Font.BOLD, 18));
	}

	/**
	 * This method actually loading the LoginView GUI into the particular main
	 * panel for viewing.
	 * 
	 * @param mainPanel
	 *            primary panel that holds all sub-panels
	 * @param frame
	 *            frame that holds the main panel
	 */
	public void loadGUI(final JPanel mainPanel, final JFrame frame)
	{
		mainPanel.add(loginPanel);
		loginPanel.add(userNameLabel);
		loginPanel.add(userNameInput);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordInput);
		loginPanel.add(loginButton);
		loginPanel.add(changePassButton);
		loginPanel.add(goBackWelcome);
		frame.setSize(350, 300);

		/*
		 * This action listener will log the user into the system by determining
		 * if their username/password combination was appropriately correct.
		 */
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Connection connect = new Connection();
				String username = userNameInput.getText();
				String password = passwordInput.getText();
				try
				{
					Result createAccount;
					createAccount = connect.login(new LogInViewModel(username,
							password));
					if (createAccount.Success())
					{
						JOptionPane.showMessageDialog(frame,
								"Account login was"
										+ " successful!");
					} else
					{
						JOptionPane
								.showMessageDialog(
										frame,
										"Failed login. Either your "
												+ "username or password was incorrect.");
					}
				} catch (IOException e1)
				{
					e1.printStackTrace();
				} catch (URISyntaxException uri)
				{
					uri.printStackTrace();
				}
			}
		});

		/*
		 * This action listener will display the ChangePasswordView GUI screen.
		 */
		changePassButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				changePassView.loadGUI(mainPanel, frame);
				loginPanel.setVisible(false);
				mainPanel.remove(loginPanel);
				frame.setTitle("Change Your Password");
			}
		});
		
		/*
		 * This action listener will display the WelcomeScreen GUI.
		 */
		goBackWelcome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{				
				WelcomeScreenView welcomeView = new WelcomeScreenView();
				welcomeView.loadGUI(mainPanel, frame);
				loginPanel.setVisible(false);
				mainPanel.remove(loginPanel);
				frame.setTitle("Welcome to Login!");
			}
		});
	}
}
