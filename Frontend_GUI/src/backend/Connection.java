package backend;

import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/** Created October 14, 2014
 * 
 * @author James
 * 
 * Connection Class that acts as a service layer to interact with a RESTful 
 * 
 */
public class Connection
{
	private String BaseUrl;

	public Connection()
	{
		this.BaseUrl = "http://r4clucky14-001-site8.smarterasp.net/api/Account";
	}
	public Connection(String BaseUrl)
	{
		this.BaseUrl = BaseUrl;
	}
	

	/**
	 * Checks to make sure the server is connecting properly.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 */
	public Result Status() throws IOException
	{
		//String requestUrl = "Status/";
		String requestUrl = "";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
			HttpGet httpGet = new HttpGet(this.BaseUrl + requestUrl);
	        CloseableHttpResponse response = httpclient.execute(httpGet);
        
	        try
	        {
	            int statusCode = response.getStatusLine().getStatusCode();
	            String statusMessage = response.getStatusLine().getReasonPhrase();
	            result = new Result(statusCode, statusMessage, "");
	    		return result;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
        }
	}


	/**
	 * Logs In a User to the Server
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public Result Login( LogInViewModel model) throws IOException, URISyntaxException
	{
		String requestUrl = "Login/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.getEmail())
                    .addParameter("Password", model.getPassword())
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            int statusCode = response.getStatusLine().getStatusCode();
	            String statusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
                String bodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	            result = new Result(statusCode, statusMessage, bodyMessage);
	    		return result;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
        }
	}
	
	
	/**
	 * Creates a new Account on the Server
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public Result Create( CreateViewModel model) throws IOException, URISyntaxException
	{
		String requestUrl = "Create/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.getEmail())
                    .addParameter("Password", model.getPassword())
                    .addParameter("ConfirmPassword", model.getConfirmPassword())
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            int statusCode = response.getStatusLine().getStatusCode();
	            String statusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
                String bodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	            result = new Result(statusCode, statusMessage, bodyMessage);
	    		return result;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
        }
	}

	
	/**
	 * Allows the ability to Change Password for an Account.
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public Result Change( ChangePasswordViewModel model) throws IOException, URISyntaxException
	{
		String requestUrl = "Change/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.getEmail())
                    .addParameter("OldPassword", model.getOldPassword())
                    .addParameter("NewPassword", model.getNewPassword())
                    .addParameter("ConfirmNewPassword", model.getConfirmNewPassword())
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            int statusCode = response.getStatusLine().getStatusCode();
	            String statusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
                String bodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	            result = new Result(statusCode, statusMessage, bodyMessage);
	    		return result;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
        }
	}


	/**
	 * Allows the ability to delete the Account
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public Result Delete( DeleteAccountViewModel model) throws IOException, URISyntaxException
	{
		String requestUrl = "Delete/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.getEmail())
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            int statusCode = response.getStatusLine().getStatusCode();
	            String statusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
                String bodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	            result = new Result(statusCode, statusMessage, bodyMessage);
	    		return result;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
        }
	}
}
