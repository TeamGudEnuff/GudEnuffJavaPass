package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUpView {

	JPanel mainPanel = new JPanel(new FlowLayout());
	
	public void createGUI(){
		JPanel signUpPanel = new JPanel(new FlowLayout());
		
		JLabel userNameLabel = new JLabel();
		JLabel passwordLabel = new JLabel();
		JLabel confirmPassLabel = new JLabel();
		
		JTextField userNameInput = new JTextField("", 15);
		JTextField passwordInput = new JTextField("", 15);
		JTextField confirmPassInput = new JTextField("", 15);
		
		JButton createAccountButton = new JButton();
		
		userNameLabel.setText("Username: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordLabel.setText("Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmPassLabel.setText("Confirm Password: ");
		confirmPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		createAccountButton.setText("Create an Account!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));

		
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
		mainPanel.setLayout(new FlowLayout());
		return mainPanel;
	}
}
