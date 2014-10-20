package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUpView {

	JPanel mainPanel = new JPanel();
	
	public void createGUI(){
		JPanel signUpPanel = new JPanel();
		
		JLabel userNameLabel = new JLabel();
		JLabel passwordLabel = new JLabel();
		JLabel confirmPassLabel = new JLabel();
		
		JTextField userNameInput = new JTextField("", 15);
		JTextField passwordInput = new JTextField("", 15);
		JTextField confirmPassInput = new JTextField("", 15);
		
		JButton createAccountButton = new JButton();
		
		userNameLabel.setText("Username: ");
		passwordLabel.setText("Password: ");
		confirmPassInput.setText("Confirm Password: ");
		
		createAccountButton.setText("Create an Account!");
		
		mainPanel.add(signUpPanel);
		signUpPanel.add(userNameLabel);
		signUpPanel.add(userNameInput);
		signUpPanel.add(passwordLabel);
		signUpPanel.add(passwordInput);
		signUpPanel.add(confirmPassLabel);
		signUpPanel.add(confirmPassInput);
		signUpPanel.add(createAccountButton);

		
	}
	
	public JPanel getMainPanel(){
		return mainPanel;
	}
}
