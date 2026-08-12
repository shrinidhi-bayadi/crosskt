package module4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 
Website: https://www.google.com/
Launch the Google website.
Maximize the browser.
Find all hyperlinks present on the webpage.
Extract the href attribute of each hyperlink to get url.
Verify every URL using HttpURLConnection.
Print "The Link is Valid" if the response code is 200.
Otherwise, print the response message and response code for the broken link.
 */
public class Assignment_155 {
public static void main(String[] args) throws  IOException, InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	int count=links.size();
	System.out.println("Number of links-->"+count);
	
	for(int i=0;i<count;i++)
	{
		String url=links.get(i).getAttribute("href");
		System.out.println(url);
		
	
		VerifyTheURL(url);
		
	}
}
	static void VerifyTheURL(String url) throws IOException
	{
		try
		{
		URL u1=new URL(url);
	HttpURLConnection c1=	(HttpURLConnection) u1.openConnection();
	
	if(c1.getResponseCode()==200)
	{
        System.out.println("The Link is Valid");

	}
	else
	{
		System.out.println("Link is not valid"+c1.getResponseCode()+" -->"+c1.getResponseMessage());
	}
	}
		catch(MalformedURLException m1)
		{
			System.out.println("invalid url "+url);
		}
}
}
