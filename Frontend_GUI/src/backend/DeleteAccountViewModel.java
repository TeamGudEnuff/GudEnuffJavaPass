package backend;

/**
 * Created October 13th, 2014
 * 
 * @author James View Model for Deleting Actions
 */
public class DeleteAccountViewModel
{
	private String email;
	private String password;

	/**
	 * Constructor for Delete Account View Model
	 * 
	 * @param email
	 *            Email for Account to Delete
	 */
	public DeleteAccountViewModel(String email, String password)
	{
		this.email = email;
		this.password = password;
	}

	/**
	 * Returns the Email of the Account
	 */
	public String getEmail()
	{
		return this.email;
	}
	public String getPassword()
	{
		return this.password;
	}
}
