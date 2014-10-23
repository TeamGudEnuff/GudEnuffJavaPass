package backend;

/**
 * Created October 13th, 2014
 * 
 * @author James
 * 
 *         Log In View Model for Connecting to the Server
 */
public class LogInViewModel
{
	public String email;
	public String password;

	/**
	 * Constructor for Log In View Model
	 * 
	 * @param email
	 *            The Email of the User to Log in
	 * @param password
	 *            The Password of the User to Log in
	 */
	public LogInViewModel(String email, String password)
	{
		this.email = email;
		this.password = password;
	}

	/**
	 * 
	 * @return Returns User's Email
	 */
	public String getEmail()
	{
		return this.email;
	}

	/**
	 * 
	 * @return Return's User's Password
	 */
	public String getPassword()
	{
		return this.password;
	}
}