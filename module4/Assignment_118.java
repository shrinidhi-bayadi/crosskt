package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Write a Selenium program to open the JSAM HTML page.
1)Locate the First name textbox using Relative XPath.
2)Enter your name.
3)quit the browser.
 */
public class Assignment_118 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		e1.sendKeys("Shrinidhi");
		Thread.sleep(3000);
		//driver.quit();
	}
}
