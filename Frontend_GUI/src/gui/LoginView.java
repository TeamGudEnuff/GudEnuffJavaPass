package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView {
	public void createGUI(){
		JLabel userNameLabel = new JLabel();
		JLabel passwordLabel = new JLabel();
		
		JTextField userNameInput = new JTextField();
		JTextField passwordInput = new JTextField();
		
		JButton loginButton = new JButton();
		JButton changePassButton = new JButton();
		
		userNameLabel.setText("Username: ");
		passwordLabel.setText("Password: ");
		
		loginButton.setText("Login Here!");
		changePassButton.setText("Change Password");
	}
}
