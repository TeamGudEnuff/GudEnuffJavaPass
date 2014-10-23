package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import backend.*;

/**
 * Created October 13th, 2014 By: Matthew Jallouk and Adam Claiborne
 * 
 * DeleteAccountView class will display the particular view to deal with the user
 * deleting a particular account. This class will access the database and
 * determine if the particular username/password combination exists. If it does,
 * the user is able to delete the combination successfully, else, the 
 * database will generate an error for the user.
 * 
 */
public class DeleteAccountView
{
	// Define instance variables for the DeleteAccountView class
	private JPanel deletePanel = new JPanel(new FlowLayout());
	private JLabel userNameLabel = new JLabel();
	private JTextField userNameInput = new JTextField("", 15);
	private JLabel passwordLabel = new JLabel();
	private JPasswordField passwordInput = new JPasswordField("", 15);
	private JButton deleteButton = new JButton();
	private JButton cancelButton = new JButton();

	/**
	 * Constructor that will set up the properties for the particular view.
	 * 
	 */
	public DeleteAccountView()
	{
		userNameLabel.setText("Confirm Email: ");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordLabel.setText("Password: ");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		deleteButton.setText("Delete");
		deleteButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cancelButton.setText("Cancel");
		cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
	}

	/**
	 * This method actually loading the DeleteAccountView GUI into the 
	 * particular main panel for viewing.
	 * 
	 * @param mainPanel            primary panel that holds all sub-panels
	 * @param frame		           frame that holds the main panel
	 */
	public void loadGUI(final JPanel mainPanel, final JFrame frame)
	{
		mainPanel.add(deletePanel);
		deletePanel.add(userNameLabel);
		deletePanel.add(userNameInput);
		deletePanel.add(passwordLabel);
		deletePanel.add(passwordInput);
		deletePanel.add(deleteButton);
		deletePanel.add(cancelButton);
		frame.setSize(350, 300);

		/*
		 * This action listener will delete the user in the system by determining
		 * if their email/password combination was appropriately correct.
		 */
		deleteButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Connection connect = new Connection();
				String username = userNameInput.getText();
				String password = passwordInput.getText();
				try
				{
					Result createAccount;
					createAccount = connect.delete(new DeleteAccountViewModel(
							username, password));
					if (createAccount.Success())
					{
						JOptionPane.showMessageDialog(frame,
								"Account was successfully deleted!");
						// Re-direct to home page

						SignUpView signUpView = new SignUpView();
						signUpView.loadGUI(mainPanel, frame);
						deletePanel.setVisible(false);
						mainPanel.remove(deletePanel);
						frame.setTitle("Create an Account");
					}
					else
					{
						JOptionPane
								.showMessageDialog(frame,
										"We had issues with deleting your account. Verify your account email");
					}
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
				catch (URISyntaxException uri)
				{
					uri.printStackTrace();
				}
			}
		});

		/*
		 * This action listener will display the LoginView GUI screen.
		 */
		cancelButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				LoginView loginScreen = new LoginView();
				loginScreen.loadGUI(mainPanel, frame);
				deletePanel.setVisible(false);
				mainPanel.remove(deletePanel);
				frame.setTitle("Log In To Your Account");
			}
		});
	}
}
