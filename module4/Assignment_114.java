package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Write a Selenium program to open Google.com and perform the
 following operations using the TagName locator (a tag):

Print the text of the second link on the page.
Print the text of all links present on the page.
 */
public class Assignment_114 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement> e1=driver.findElements(By.tagName("a"));
	System.out.println("Second Element Text\n"+e1.get(1).getText());
	
	int size=e1.size();
	System.out.println("Number of links-->"+size);
	System.out.println("Print all links present on page");
	for(int i=0;i<size;i++)
	{
		System.out.println(e1.get(i).getText());
	}
	driver.quit();
}
}
