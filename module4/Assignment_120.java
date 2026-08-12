package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
Write a Selenium program to open Amazon.in website.

Maximize the browser.
Hover the mouse over "change language".
Wait for 3 seconds.
quit the browser.
 */
public class Assignment_120 {
public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e=driver.findElement(By.xpath("(//span[@class='nav-line-1'])[1]"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e).perform();
	Thread.sleep(3000);
	driver.quit();
}
}
