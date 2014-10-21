package gui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangePasswordView {
	JPanel mainPanel = new JPanel(new FlowLayout());

	public void createGUI(){
		JPanel changePassPanel = new JPanel(new FlowLayout());
		
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
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		currPasswordLabel.setText("Current Password: ");
		currPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		newPassLabel.setText("New Password: ");
		newPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmChangePassLabel.setText("Confirm Password: ");
		confirmChangePassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		createAccountButton.setText("Confirm Password Change!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		mainPanel.add(changePassPanel);
		changePassPanel.add(userNameLabel);
		changePassPanel.add(userNameInput);
		changePassPanel.add(currPasswordLabel);
		changePassPanel.add(currPasswordInput);
		changePassPanel.add(newPassLabel);
		changePassPanel.add(newPassInput);
		changePassPanel.add(confirmChangePassLabel);
		changePassPanel.add(confirmChangePassInput);
		changePassPanel.add(createAccountButton);
		//add more stupid code
	}
	
	public JPanel getMainPanel(){
		return mainPanel;
	}
}