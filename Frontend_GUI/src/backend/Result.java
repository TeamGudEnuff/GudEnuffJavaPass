package backend;

/**
 * Created October 13th, 2014
 * 
 * @author James
 * 
 *         Represents all data returned from the server, including the status
 *         code, status message, and the response body's message.
 */
public class Result
{
	private int statusCode;
	private String statusMessage;
	private String bodyMessage;

	/**
	 * Constructor for am empty Result
	 * 
	 */
	public Result()
	{
		this.statusCode = 0;
		this.statusMessage = "";
		this.bodyMessage = "";
	}

	/**
	 * Constructor for a Result returned from the server
	 * 
	 * @param statusCode
	 *            Status Code returned from Server
	 * @param statusMessage
	 *            Status Message returned from Server
	 * @param bodyMessage
	 *            Body Message returned from Server
	 */
	public Result(int statusCode, String statusMessage, String bodyMessage)
	{
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.bodyMessage = bodyMessage;
	}

	/**
	 * 
	 * @return Returns true if an Ok (200) code exists; otherwise, returns
	 *         false.
	 */
	public Boolean Success()
	{
		return statusCode == 200;
	}

	/**
	 * 
	 * @return Returns Status Code from Server
	 */
	public int getStatusCode()
	{
		return statusCode;
	}

	/**
	 * 
	 * @return Returns Status Message from Server
	 */
	public String getStatusMessage()
	{
		return statusMessage;
	}

	/**
	 * 
	 * @return Returns Body Message from Server
	 */
	public String getBodyMessage()
	{
		return bodyMessage;
	}
}
