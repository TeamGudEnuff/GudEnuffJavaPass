package backend;

public class DeleteAccountViewModel
{
	public String Email;

	public DeleteAccountViewModel(String Email)
	{
		this.Email = Email;
	}

	public String toJson()
	{
		return "{ Email: " + Email + " }";
	}
}
