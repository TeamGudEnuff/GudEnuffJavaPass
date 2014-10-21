package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

		
		createAccountButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Account will send stuff to server than port you over to the
				//login screen
			}
		});
		
	}
	
	public JPanel getMainPanel(){
		return mainPanel;
	}
}
