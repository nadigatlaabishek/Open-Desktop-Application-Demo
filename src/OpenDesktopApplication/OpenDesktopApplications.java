package OpenDesktopApplication;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenDesktopApplications 
{
   public static void main(String[] args) throws IOException,URISyntaxException
	{
    	Runtime runtime=Runtime.getRuntime();
	 
	 //to open Calculator
	 runtime.exec("calc");
	 
	 //to open the Notepad
    //runtime.exec("notepad");
	 
	 //start the Default Browser
	// runtime.exec("https://www.google.com");
	 
	 //URI url =new URI("https://www.example.com");
	// runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
	 
    // String url1="https://www.google.com";
    // runtime.exec("rundll32 url.dll,FileProtocolHandler " + url1);
   
	}	 
	 
}
