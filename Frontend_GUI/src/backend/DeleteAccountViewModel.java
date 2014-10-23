package backend;


/** Created October 13th, 2014
 * 
 * @author James
 * View Model for Deleting Actions
 */
public class DeleteAccountViewModel
{
	public String email;

	/**
	 *  Constructor for Delete Account View Model
	 * 
	 * @param email Email for Account to Delete
	 */
	public DeleteAccountViewModel(String email)
	{
		this.email = email;
	}

	/**
	 * Returns the Email of the Account
	 */
	public String getEmail()
	{
		return this.email;
	}
}
