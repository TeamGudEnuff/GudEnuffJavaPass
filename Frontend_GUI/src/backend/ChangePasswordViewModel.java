package backend;

public class ChangePasswordViewModel
{
	public String Email;
	public String OldPassword;
	public String NewPassword;

	public ChangePasswordViewModel(String Username, String OldPassword, String NewPassword)
	{
		this.Email = Username;
		this.OldPassword = OldPassword;
		this.NewPassword = NewPassword;
	}

	public String toJson()
	{
		return "{ Email: " + Email + ", OldPassword: " + OldPassword + ", NewPassword: " + NewPassword + " }";
	}
}
