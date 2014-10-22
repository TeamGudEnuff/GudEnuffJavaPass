package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView {
	JPanel loginPanel = new JPanel(new FlowLayout());
	
	JLabel userNameLabel = new JLabel();
	JLabel passwordLabel = new JLabel();
	
	JTextField userNameInput = new JTextField("", 15);
	JTextField passwordInput = new JTextField("", 15);
	
	JButton loginButton = new JButton();
	JButton changePassButton = new JButton();
	
	public LoginView(){
		userNameLabel.setText("Username: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));

		passwordLabel.setText("Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));

		loginButton.setText("Login Here!");
		loginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));

		changePassButton.setText("Change Password");
		changePassButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
	}

	public void createGUI(JPanel mainPanel){
		mainPanel.removeAll();
		loginPanel.removeAll();
		
		mainPanel.add(loginPanel);
		loginPanel.add(userNameLabel);
		loginPanel.add(userNameInput);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordInput);
		
		loginPanel.add(loginButton);
		loginPanel.add(changePassButton);
		
		changePassButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {

				
			}	
		});
	}
	
	
	
	
}
