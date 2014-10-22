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
	private JPanel loginPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel passwordLabel = new JLabel();
	private JTextField userNameInput = new JTextField("", 15);
	private JTextField passwordInput = new JTextField("", 15);
	private JButton loginButton = new JButton();
	private JButton changePassButton = new JButton();
	private ChangePasswordView changePassView = new ChangePasswordView();

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

	public void createGUI(final JPanel mainPanel, final JFrame frame){
		mainPanel.add(loginPanel);
		loginPanel.add(userNameLabel);
		loginPanel.add(userNameInput);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordInput);
		loginPanel.add(loginButton);
		loginPanel.add(changePassButton);
		
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.out.println("Checking login with the Database...." +
						"WRITE MORE CODE HERE!");
			}
		});
		
		changePassButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				changePassView.createGUI(mainPanel, frame);
				loginPanel.setVisible(false);
				//frame.add(changePassView);
				mainPanel.remove(loginPanel);
				frame.setTitle("Change Your Password");
			}	
		});
	}
}
