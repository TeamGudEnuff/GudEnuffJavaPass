package backend;

/**
 * View Model for Change Password Actions
 * @author James
 *
 */
public class ChangePasswordViewModel
{
	private String Email;
	private String OldPassword;
	private String NewPassword;

	/**
	 * Constructs Change Password View Model object
	 * @param Email Email of User
	 * @param OldPassword Old Password of User
	 * @param NewPassword New Password of User
	 */
	public ChangePasswordViewModel(String Email, String OldPassword, String NewPassword)
	{
		this.Email = Email;
		this.OldPassword = OldPassword;
		this.NewPassword = NewPassword;
	}

	/**
	 * 
	 * @return JSON representation of object
	 */
	public String toJson()
	{
		return "{ Email: " + Email + ", OldPassword: " + OldPassword + ", NewPassword: " + NewPassword + " }";
	}
	
	/**
	 * 
	 * @return String Representation of Email
	 */
	public String GetEmail()
	{
		return this.Email;
	}
	/**
	 * 
	 * @return String Representation of Old Password
	 */
	public String GetOldPassword()
	{
		return this.OldPassword;
	}
	/**
	 * 
	 * @return String Representation of New Password
	 */
	public String GetNewPassword()
	{
		return this.NewPassword;
	}
	
}
