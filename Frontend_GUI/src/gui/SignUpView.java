package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUpView {

	public void createGUI(){
		JLabel userNameLabel = new JLabel();
		JLabel passwordLabel = new JLabel();
		JLabel confirmPassLabel = new JLabel();
		
		JTextField userNameInput = new JTextField();
		JTextField passwordInput = new JTextField();
		JTextField confirmPassInput = new JTextField();
		
		JButton createAccountButton = new JButton();
		
		userNameLabel.setText("Username: ");
		passwordLabel.setText("Password: ");
		confirmPassInput.setText("Confirm Password: ");
		
		createAccountButton.setText("Create an Account!");
	}
}
