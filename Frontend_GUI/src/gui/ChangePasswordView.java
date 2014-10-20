package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ChangePasswordView {
	public void createGUI(){
		JLabel userNameLabel = new JLabel();
		JLabel currPasswordLabel = new JLabel();
		JLabel newPassLabel = new JLabel();
		JLabel confirmChangePassLabel = new JLabel();
		
		JTextField userNameInput = new JTextField();
		JTextField currPasswordInput = new JTextField();
		JTextField newPassInput = new JTextField();
		JTextField confirmChangePassInput = new JTextField();
		
		JButton createAccountButton = new JButton();
		
		userNameLabel.setText("Username: ");
		currPasswordLabel.setText("Current Password: ");
		newPassLabel.setText("New Password");
		confirmChangePassLabel.setText("Confirm Password: ");
		
		createAccountButton.setText("Confirm Password Change!");
	}
}
