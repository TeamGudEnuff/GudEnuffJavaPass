package backend;

/**
 * Created October 13th, 2014
 * 
 * @author James View Model for Creating a User Account
 */
public class CreateViewModel
{
	private String email;
	private String password;
	private String confirmPassword;

	/**
	 * Constructor of Create Account View Model
	 * 
	 * @param email
	 *            Sets Email for Creating a new Account
	 * @param password
	 *            Sets Password for Creating a New Account
	 * @param confirmPassword
	 *            Sets the Confirm Password for Creating a New Account
	 */
	public CreateViewModel(String email, String password, String confirmPassword)
	{
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	/**
	 * 
	 * @return String Representation of Email
	 */
	public String getEmail()
	{
		return this.email;
	}

	/**
	 * 
	 * @return String Representation of Password
	 */
	public String getPassword()
	{
		return this.password;
	}

	/**
	 * 
	 * @return String Representation of Confirm Password
	 */
	public String getConfirmPassword()
	{
		return this.confirmPassword;
	}
}
