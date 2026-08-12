package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Write a Selenium program to open Google.com
1) locate all links using the TagName locator (a), 
2)count the total number of links
3) print the URL (href attribute) of each link
 */
public class Assignment115 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);

	List<WebElement> url=driver.findElements(By.tagName("a"));
	int count_url=url.size();
	
	System.out.println("Total Number of URL-->"+count_url);

	System.out.println("Print URL");
	for(int i=0;i<count_url;i++)
	{
		System.out.println(url.get(i).getAttribute("href"));
	}

driver.quit();
}
}
