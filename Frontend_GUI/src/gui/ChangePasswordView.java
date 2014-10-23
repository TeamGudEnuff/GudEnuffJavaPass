package gui;

/** Created October 13th, 2014
 * By: Matthew Jallouk and Adam Claiborne
 * 
 * SignUpView class will display the particular view to sign up a user into our 
 * password database system. This includes setting up a username/password 
 * combination and sending that combination to the database for storage.
 */

import java.awt.Color;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import backend.*;

public class ChangePasswordView
{
	// Define instance variables for the ChangePasswordView class
	private JPanel changePassPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel currPasswordLabel = new JLabel();
	private JLabel newPassLabel = new JLabel();
	private JLabel confirmChangePassLabel = new JLabel();
	private JTextArea accountConditions = new JTextArea("", 7, 20);
	private JTextField userNameInput = new JTextField("", 15);
	private JPasswordField currPasswordInput = new JPasswordField("", 15);
	private JPasswordField newPassInput = new JPasswordField("", 15);
	private JPasswordField confirmChangePassInput = new JPasswordField("", 15);
	private JButton changePassButton = new JButton();

	/**
	 * Constructor to setup the ChangePassword Panel to be added to the frame
	 * 
	 */
	public ChangePasswordView()
	{
		userNameLabel.setText("   Email: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		currPasswordLabel.setText("Current Password: ");
		currPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		newPassLabel.setText("New Password: ");
		newPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmChangePassLabel.setText("Confirm Password: ");
		confirmChangePassLabel.setFont(new Font("Times New Roman", Font.BOLD,
				18));
		changePassButton.setText("Confirm Password Change!");
		changePassButton.setFont(new Font("Times New Roman", Font.BOLD, 18));

		accountConditions
				.setText("Your email must have an '@' symbol in it."
						+ "\nYour password must have lowercase, uppercase, numbers and "
						+ "special symbols (!, &, *, ?)");
		accountConditions.setLineWrap(true);
		accountConditions.setWrapStyleWord(true);
		accountConditions.setEnabled(false);
		accountConditions.setForeground(Color.BLACK);
		accountConditions.setFont(new Font("Time New Roman", Font.BOLD, 16));

	}

	/**
	 * This method loads the ChangePassword panel onto the main frame.
	 * 
	 * @param mainPanel
	 *            primary panel that holds all sub-panels
	 * @param frame
	 *            frame that holds the main panel
	 */
	public void loadGUI(final JPanel mainPanel, final JFrame frame)
	{
		mainPanel.add(changePassPanel);
		changePassPanel.add(userNameLabel);
		changePassPanel.add(userNameInput);
		changePassPanel.add(currPasswordLabel);
		changePassPanel.add(currPasswordInput);
		changePassPanel.add(newPassLabel);
		changePassPanel.add(newPassInput);
		changePassPanel.add(confirmChangePassLabel);
		changePassPanel.add(confirmChangePassInput);
		changePassPanel.add(accountConditions);
		changePassPanel.add(changePassButton);
		frame.setSize(350, 400);

		/*
		 * This action listener will talk to the database to change the password
		 * of the particular username inputed.
		 */
		changePassButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Connection test = new Connection();
				String username = userNameInput.getText();
				String oldPass = currPasswordInput.getText();
				String newPass = newPassInput.getText();
				String confirmNewPass = confirmChangePassInput.getText();
				try
				{
					Result createAccount;
					createAccount = test.change(new ChangePasswordViewModel(
							username, oldPass, newPass, confirmNewPass));
					if (createAccount.Success())
					{
						JOptionPane.showMessageDialog(frame,
								"Account password has been changed"
										+ " successfully!");
						LoginView loginView = new LoginView();
						loginView.loadGUI(mainPanel, frame);
						changePassPanel.setVisible(false);
						mainPanel.remove(changePassPanel);
						frame.setTitle("Login To Your Account!");
					} else
					{
						JOptionPane
								.showMessageDialog(
										frame,
										"Account password changed failed!\n"
												+ "Either your password confirms didn't\nmatch "
												+ "or your username/password doesn't\nfit our "
												+ "standards.");
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
	}
}