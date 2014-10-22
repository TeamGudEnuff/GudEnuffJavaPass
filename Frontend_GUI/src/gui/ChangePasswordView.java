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

public class ChangePasswordView {

	//Define instance variables for the ChangePasswordView class
	private JPanel changePassPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel currPasswordLabel = new JLabel();
	private JLabel newPassLabel = new JLabel();
	private JLabel confirmChangePassLabel = new JLabel();
	private JTextField userNameInput = new JTextField("", 15);
	private JTextField currPasswordInput = new JTextField("", 15);
	private JTextField newPassInput = new JTextField("", 15);
	private JTextField confirmChangePassInput = new JTextField("", 15);
	private JButton changePassButton = new JButton();
	
	/** Constructor to setup the ChangePassword Panel to be added to the frame
	 * 
	 */
	public ChangePasswordView(){
		userNameLabel.setText("Username: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		currPasswordLabel.setText("Current Password: ");
		currPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		newPassLabel.setText("New Password: ");
		newPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmChangePassLabel.setText("Confirm Password: ");
		confirmChangePassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		changePassButton.setText("Confirm Password Change!");
		changePassButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
	}
	
	/** This method loads the ChangePassword panel onto the main frame.
	 * 
	 * @param mainPanel				primary panel that holds all sub-panels
	 * @param frame					frame that holds the main panel
	 */
	public void loadGUI(final JPanel mainPanel, final JFrame frame){
		mainPanel.add(changePassPanel);
		changePassPanel.add(userNameLabel);
		changePassPanel.add(userNameInput);
		changePassPanel.add(currPasswordLabel);
		changePassPanel.add(currPasswordInput);
		changePassPanel.add(newPassLabel);
		changePassPanel.add(newPassInput);
		changePassPanel.add(confirmChangePassLabel);
		changePassPanel.add(confirmChangePassInput);
		changePassPanel.add(changePassButton);
		frame.setSize(350,300);
		
		/* This action listener will talk to the database to change the password
		 * of the particular username inputed.
		 * 
		 */
		changePassButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Password has been Changed. " +
						"WRITE CODE HERE TO INTERFACE WITH THE DATABASE!");
			}
		});
	}
}