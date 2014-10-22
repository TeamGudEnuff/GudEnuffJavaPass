package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeScreenView {
	
	//Define instance variables for the SignUpView class
	private LoginView loginView = new LoginView();
	private SignUpView signUpView = new SignUpView();
	private ChangePasswordView changePassView = new ChangePasswordView();	
	private final JFrame frame = new JFrame();
	private final JPanel mainPanel = new JPanel(new FlowLayout());

	/**
	 * 
	 */
	public void createGUI(){
		final JPanel welcomePanel = new JPanel(new FlowLayout());
		JLabel welcomeLabel = new JLabel();
		JButton loginButton = new JButton();
		JButton createAccountButton = new JButton();
		JButton changePassButton = new JButton();
		
		loginButton.setSize(100,100);
		welcomeLabel.setText("Welcome to the Login Place!");
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

		loginButton.setText("Login!");
		loginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		createAccountButton.setText("Create an Account!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		changePassButton.setText("Change Password");
		changePassButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		frame.add(mainPanel);
		mainPanel.add(welcomePanel);
		welcomePanel.add(welcomeLabel);
		welcomePanel.add(loginButton);
		welcomePanel.add(createAccountButton);
		welcomePanel.add(changePassButton);
		
		frame.setVisible(true);
		frame.setEnabled(true);
		frame.setSize(800,500);
		frame.setTitle("Welcome to Login!");
		
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				loginView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				mainPanel.remove(welcomePanel);	
				frame.setTitle("Login Here!");
			}
		});
		
		createAccountButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				signUpView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				frame.remove(welcomePanel);
				frame.setTitle("Create Your Account You Goofball");
			}
		});
		
		changePassButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				changePassView.loadGUI(mainPanel, frame);
				welcomePanel.setVisible(false);
				frame.remove(welcomePanel);
				frame.setTitle("Change Your Password");
			}
		});
	}
	
	public static void main(String[] args){
		WelcomeScreenView gui = new WelcomeScreenView();
		gui.createGUI();
	}
}
