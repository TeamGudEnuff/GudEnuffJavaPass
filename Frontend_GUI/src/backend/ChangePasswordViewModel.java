package backend;

/** Created October 13th, 2014
 * 
 * @author James
 * View Model for Change Password Actions
 */
public class ChangePasswordViewModel
{
	private String email;
	private String oldPassword;
	private String newPassword;
	private String confirmNewPassword;

	/**
	 * Constructs Change Password View Model object
	 * @param email Email of User
	 * @param oldPassword Old Password of User
	 * @param newPassword New Password of User
	 * @param confirmNewPassword Confirmation of New Password of User
	 */
	public ChangePasswordViewModel(String email, String oldPassword, String newPassword, String confirmNewPassword)
	{
		this.email = email;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.confirmNewPassword = confirmNewPassword;
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
	 * @return String Representation of Old Password
	 */
	public String getOldPassword()
	{
		return this.oldPassword;
	}
	/**
	 * 
	 * @return String Representation of New Password
	 */
	public String getNewPassword()
	{
		return this.newPassword;
	}

	/**
	 * 
	 * @return String Representation of Confirm New Password
	 */
	public String getConfirmNewPassword()
	{
		return this.confirmNewPassword;
	}
}
