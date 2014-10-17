package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeScreenView {
	
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
			JFrame frame = new JFrame();
			JPanel mainPanel = new JPanel();
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
			
			performButtonActions(loginButton);
			
			frame.setVisible(true);
			frame.setEnabled(true);
			frame.setSize(800,500);
			frame.setTitle("Welcome to Login!");
		}
		
		public void initPanel(){
			
		}
		
		/**
		 * 
		 * @param loginButton
		 */
		public void performButtonActions(JButton loginButton){
			loginButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Hello World");
				}
			});
		}
}
