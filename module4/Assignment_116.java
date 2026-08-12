package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a Selenium program to
count all input tags and print the type attribute of each input element
present in JSAM HTML
 */
public class Assignment_116 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement> input=driver.findElements(By.tagName("input"));
	int count=input.size();
	System.out.println("Count of all input tags-->"+count);
	for(int i=0;i<count;i++)
	{
		System.out.println(input.get(i).getAttribute("type"));
	}
	
	driver.quit();
}
}
