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

public class SignUpView {

	private JPanel signUpPanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JLabel passwordLabel = new JLabel();
	private JLabel confirmPassLabel = new JLabel();
	private JTextField userNameInput = new JTextField("", 15);
	private JTextField passwordInput = new JTextField("", 15);
	private JTextField confirmPassInput = new JTextField("", 15);
	private JButton createAccountButton = new JButton();
	
	public SignUpView(){
		userNameLabel.setText("Username: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordLabel.setText("Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmPassLabel.setText("Confirm Password: ");
		confirmPassLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		createAccountButton.setText("Create an Account!");
		createAccountButton.setFont(new Font("Times New Roman", Font.BOLD, 18));

	}
	
	public void createGUI(final JPanel mainPanel, final JFrame frame){
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
				System.out.println("Account has been created. " +
				"WRITE CODE HERE TO INTERFACE WITH THE DATABASE!");
			}
		});
		
	}
}
