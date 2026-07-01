package revise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Website: https://testautomationpractice.blogspot.com/

Scenario

Write a Selenium program to perform the following:

Part A – Browser & Form Automation
Launch the Chrome browser.
Navigate to https://testautomationpractice.blogspot.com/.
Maximize the browser window.
Print the page title.
Enter the following details:
Name: Shrinidhi
Email: shrinidhi@test.com
Phone: 9876543210
Address: Florida
Select Female as the gender.
Select Tuesday and Thursday from the Days checkboxes.
Select India from the Country dropdown.
Select Green and Blue from the Colors multi-select dropdown.
Select Dog from the Animals dropdown.
Select today's date in Date Picker 1.


Part B – Broken Link Verification
Scroll down to the Broken Links section.
Find all hyperlinks present only in the Broken Links section.
Extract the href attribute of each hyperlink.
Verify each URL using HttpURLConnection.
Print "The Link is Valid" if the response code is 200.
Otherwise, print the response code and response message for the broken link.
Close the browser.
 */
public class Automation_Practice {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	String title=driver.getTitle();
	System.out.println("Title-->"+title);

	WebElement fname=driver.findElement(By.id("name"));
	fname.sendKeys("Shrinidhi");
	Thread.sleep(1000);
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("Shrinidhi@test.com");
	Thread.sleep(1000);
	
	WebElement phone=driver.findElement(By.id("phone"));
	phone.sendKeys("1234567898");
	Thread.sleep(1000);
	
	WebElement address=driver.findElement(By.id("textarea"));
	address.sendKeys("Florida");
	Thread.sleep(1000);
	WebElement gender=driver.findElement(By.id("female"));
	gender.click();
	Thread.sleep(1000);

	
	WebElement tueday=driver.findElement(By.id("tuesday"));
	tueday.click();
	Thread.sleep(1000);
	
	WebElement thursday=driver.findElement(By.id("thursday"));
	thursday.click();
	Thread.sleep(1000);
	
	WebElement country=driver.findElement(By.id("country"));
	Select s1=new Select(country);
	s1.selectByValue("india");
	Thread.sleep(1000);

	
	WebElement colours=driver.findElement(By.id("colors"));
	Select s2=new Select(colours);
	s2.selectByValue("blue");
	s2.selectByValue("green");
	Thread.sleep(1000);

	WebElement animal=driver.findElement(By.id("animals"));
	Select s3=new Select(animal);
	s3.selectByValue("dog");
	Thread.sleep(1000);

	WebElement date1=driver.findElement(By.id("datepicker"));
	date1.click();
	
	WebElement d=driver.findElement(By.xpath("//a[text()='8']"));
	d.click();
	Thread.sleep(1000);

	
	List<WebElement> links=driver.findElements(By.xpath("//div[@id='broken-links']/a"));
	int count=links.size();
	System.out.println("Number of links-->"+count);
	
	for(int i=0;i<count;i++)
	{
		String url=links.get(i).getAttribute("href");
		System.out.println(url);
		verifyUrl(url);
	}
	
	
	
	
}

public static void verifyUrl(String url) throws IOException {
	try
	{
	URL u1=new URL(url);
	HttpURLConnection c1=(HttpURLConnection) u1.openConnection();
	
	if(c1.getResponseCode()==200)
	{
		System.out.println("Url is valid");
	}
	else
	{
		System.out.println(c1.getResponseCode()+"-->"+c1.getResponseMessage());
	}
	}
	
	catch(MalformedURLException e)
	{
		System.out.println("Invalid url");
	}
}
}
