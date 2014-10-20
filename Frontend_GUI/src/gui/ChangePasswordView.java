package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangePasswordView {
	JPanel mainPanel = new JPanel();

	public void createGUI(){
		JPanel changePassPanel = new JPanel();
		
		JLabel userNameLabel = new JLabel();
		JLabel currPasswordLabel = new JLabel();
		JLabel newPassLabel = new JLabel();
		JLabel confirmChangePassLabel = new JLabel();
		
		JTextField userNameInput = new JTextField("", 15);
		JTextField currPasswordInput = new JTextField("", 15);
		JTextField newPassInput = new JTextField("", 15);
		JTextField confirmChangePassInput = new JTextField("", 15);
		
		JButton createAccountButton = new JButton();
		
		userNameLabel.setText("Username: ");
		currPasswordLabel.setText("Current Password: ");
		newPassLabel.setText("New Password");
		confirmChangePassLabel.setText("Confirm Password: ");
		
		createAccountButton.setText("Confirm Password Change!");
		
		mainPanel.add(changePassPanel);
		changePassPanel.add(userNameLabel);
		changePassPanel.add(userNameInput);
		changePassPanel.add(currPasswordLabel);
		changePassPanel.add(currPasswordInput);
		changePassPanel.add(newPassLabel);
		changePassPanel.add(newPassInput);
		changePassPanel.add(confirmChangePassLabel);
		changePassPanel.add(confirmChangePassInput);

		
	}
	
	public JPanel getMainPanel(){
		return mainPanel;
	}
}
