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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import backend.*;

public class SignUpView {

	//Define instance variables for the SignUpView class
	private JPanel signUpPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel passwordLabel = new JLabel();
	private JLabel confirmPassLabel = new JLabel();
	private JTextArea accountConditions = new JTextArea("", 7,20);
	private JTextField userNameInput = new JTextField("", 15);
	private JTextField passwordInput = new JTextField("", 15);
	private JTextField confirmPassInput = new JTextField("", 15);
	private JButton createAccountButton = new JButton();
	private JButton goLogin = new JButton();
	private LoginView loginView = new LoginView();
	
	/** Constructor that will set up the properties for the particular view.
	 * 
	 */
	public SignUpView(){
		userNameLabel.setText("           Email: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordLabel.setText("       Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmPassLabel.setText("Confirm Password: ");
		confirmPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		accountConditions.setText("Your email must have an '@' symbol in it." +
				"\nYour password must have lowercase, uppercase, numbers and " +
				"special symbols (!, &, *, ?)");
		accountConditions.setLineWrap(true);
		accountConditions.setWrapStyleWord(true);
		accountConditions.setEnabled(false);
		accountConditions.setForeground(Color.BLACK);
		accountConditions.setFont(new Font("Time New Roman", Font.BOLD, 16));
		createAccountButton.setText("Create an Account!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		goLogin.setText("Login to your Account!");
		goLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));

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
		signUpPanel.add(accountConditions);
		signUpPanel.add(createAccountButton);
		signUpPanel.add(goLogin);
		frame.setSize(350,400);

		/* This action listener will send the username/password combination to
		 * the database for storage and determine if the account was created
		 * successfully.
		*/
		createAccountButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Account will send stuff to server than port you over to the
				//login screen
				Connection test = new Connection();
				String username = userNameInput.getText();
				String password = passwordInput.getText();
				String confirmPass = confirmPassInput.getText();
				try {
					Result createAccount;
					createAccount = test.create(
							new CreateViewModel(username, password, confirmPass));
					if (createAccount.Success()){
						JOptionPane.showMessageDialog(frame, 
								"Account has been created successfully!");
					}else{
						JOptionPane.showMessageDialog(frame, 
								"Faied to create the account. " +
								"\nEither the account already exists,\nor your " +
								"username/password doesn't\nmeet our standards.");
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch(URISyntaxException uri){
					uri.printStackTrace();
				}
			}
		});
		
		goLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				loginView.loadGUI(mainPanel, frame);
				signUpPanel.setVisible(false);
				mainPanel.remove(signUpPanel);	
				frame.setTitle("Login Here!");
			}
		});
	}
}
