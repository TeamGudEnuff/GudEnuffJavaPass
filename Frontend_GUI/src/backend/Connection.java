package backend;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.io.IOException;
import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

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
	            result.StatusCode = response.getStatusLine().getStatusCode();
	            result.StatusMessage = response.getStatusLine().getReasonPhrase();
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
    		return result;
        }
	}


	/**
	 * Logs In a User to the Server
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 */
	public Result Login( LogInViewModel model) throws IOException
	{
		String requestUrl = "Login/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.Email)
                    .addParameter("Password", model.Password)
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            result.StatusCode = response.getStatusLine().getStatusCode();
	            result.StatusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
	            result.BodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
    		return result;
        }
	}
	
	
	/**
	 * Creates a new Account on the Server
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 */
	public Result Create( CreateViewModel model) throws IOException
	{
		String requestUrl = "Create/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.Email)
                    .addParameter("Password", model.Password)
                    .addParameter("ConfirmPassword", model.ConfirmPassword)
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            result.StatusCode = response.getStatusLine().getStatusCode();
	            result.StatusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
	            result.BodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
    		return result;
        }
	}

	
	/**
	 * Allows the ability to Change Password for an Account.
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 */
	public Result Change( ChangePasswordViewModel model) throws IOException
	{
		String requestUrl = "Change/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.Email)
                    .addParameter("OldPassword", model.OldPassword)
                    .addParameter("NewPassword", model.NewPassword)
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            result.StatusCode = response.getStatusLine().getStatusCode();
	            result.StatusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
	            result.BodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
    		return result;
        }
	}


	/**
	 * Allows the ability to delete the Account
	 * @param model Contains information to be sent to the server.
	 * @return A Result containing information from the server.
	 * @throws IOException
	 */
	public Result Delete( DeleteAccountViewModel model) throws IOException
	{
		String requestUrl = "Delete/";
        Result result = new Result();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
        	HttpUriRequest httpPost = RequestBuilder.post()
                    .setUri(new URI(this.BaseUrl + requestUrl))
                    .addParameter("Email", model.Email)
                    .build();
			
	        CloseableHttpResponse response = httpclient.execute(httpPost);
        
	        try
	        {
	            result.StatusCode = response.getStatusLine().getStatusCode();
	            result.StatusMessage = response.getStatusLine().getReasonPhrase();
                HttpEntity entity = response.getEntity();
	            result.BodyMessage = entity != null ? EntityUtils.toString(entity) : null;
	        }
	        finally
	        {
	        	response.close();
	        }
		}
        finally
        {
            httpclient.close();
    		return result;
        }
	}
}
