package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView {
	JPanel mainPanel = new JPanel();

	public void createGUI(){
		JPanel loginPanel = new JPanel();
		
		JLabel userNameLabel = new JLabel();
		JLabel passwordLabel = new JLabel();
		
		JTextField userNameInput = new JTextField("", 15);
		JTextField passwordInput = new JTextField("", 15);
		
		JButton loginButton = new JButton();
		JButton changePassButton = new JButton();
		
		userNameLabel.setText("Username: ");
		passwordLabel.setText("Password: ");
		
		loginButton.setText("Login Here!");
		changePassButton.setText("Change Password");
		
		mainPanel.add(loginPanel);
		loginPanel.add(userNameLabel);
		loginPanel.add(userNameInput);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordInput);
		
		loginPanel.add(loginButton);
		loginPanel.add(changePassButton);
		
	}
	
	public JPanel getMainPanel(){
		return mainPanel;
	}
	
	
}
