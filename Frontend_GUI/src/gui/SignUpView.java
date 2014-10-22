package gui;
/** Created October 13th, 2014
 * By: Matthew Jallouk and Adam Claiborne
 * 
 * SignUpView class will display the particular view to sign up a user into our 
 * password database system. This includes setting up a username/password 
 * combination and sending that combination to the database for storage.
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUpView {

	//Define instance variables for the SignUpView class
	private JPanel signUpPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel passwordLabel = new JLabel();
	private JLabel confirmPassLabel = new JLabel();
	private JTextField userNameInput = new JTextField("", 15);
	private JTextField passwordInput = new JTextField("", 15);
	private JTextField confirmPassInput = new JTextField("", 15);
	private JButton createAccountButton = new JButton();
	
	/** Constructor that will set up the properties for the particular view.
	 * 
	 */
	public SignUpView(){
		userNameLabel.setText("Username: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordLabel.setText("Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmPassLabel.setText("Confirm Password: ");
		confirmPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		createAccountButton.setText("Create an Account!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
	}
	
	/** This method actually loading the SignUpView GUI into the particular  
	 * main panel for viewing.
	 * 
	 * @param mainPanel				primary panel that holds all sub-panels
	 * @param frame					frame that holds the main panel
	 */
	public void loadGUI(final JPanel mainPanel, final JFrame frame){
		mainPanel.add(signUpPanel);
		signUpPanel.add(userNameLabel);
		signUpPanel.add(userNameInput);
		signUpPanel.add(passwordLabel);
		signUpPanel.add(passwordInput);
		signUpPanel.add(confirmPassLabel);
		signUpPanel.add(confirmPassInput);
		signUpPanel.add(createAccountButton);

		/* This action listener will send the username/password combination to
		 * the database for storage and determine if the account was created
		 * successfully.
		*/
		createAccountButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Account will send stuff to server than port you over to the
				//login screen
				System.out.println("Account has been created. " +
				"WRITE CODE HERE TO INTERFACE WITH THE DATABASE!");
			}
		});
	}
}
