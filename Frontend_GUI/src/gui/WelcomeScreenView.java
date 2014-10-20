package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeScreenView {
	
	LoginView loginView = new LoginView();
	SignUpView signUpView = new SignUpView();
	ChangePasswordView changePassView = new ChangePasswordView();
	
	/**
	 * 
	 * @param args
	 */
		public static void main(String[] args){
			WelcomeScreenView gui = new WelcomeScreenView();
			gui.createGUI();
		}
		
		/**
		 * 
		 */
		
		public void createGUI(){
			final JFrame frame = new JFrame();
			final JPanel mainPanel = new JPanel();
			JLabel welcomeLabel = new JLabel();
			JButton loginButton = new JButton();
			JButton createAccountButton = new JButton();
			JButton changePassButton = new JButton();
			
			welcomeLabel.setText("Welcome to the Login Place!");
			loginButton.setText("Login!");
			createAccountButton.setText("Create an Account!");
			changePassButton.setText("Change Password");
			
			frame.add(mainPanel);
			mainPanel.add(welcomeLabel);
			mainPanel.add(loginButton);
			mainPanel.add(createAccountButton);
			mainPanel.add(changePassButton);
			
			frame.setVisible(true);
			frame.setEnabled(true);
			frame.setSize(800,500);
			frame.setTitle("Welcome to Login!");
			
			loginButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					loginView.createGUI();
					mainPanel.setVisible(false);
					frame.add(loginView.getMainPanel());
					frame.remove(mainPanel);
				}
			});
			
			createAccountButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					signUpView.createGUI();
					mainPanel.setVisible(false);
					frame.add(signUpView.getMainPanel());
					frame.remove(mainPanel);
				}
			});
			
			changePassButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					changePassView.createGUI();
					mainPanel.setVisible(false);
					frame.add(changePassView.getMainPanel());
					frame.remove(mainPanel);
				}
			});
		}
		
		public void initPanel(){
			
		}
}
