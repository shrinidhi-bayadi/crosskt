package module4;
/*Write a program to Automate double click on firstname on GroTechMinds application

https://grotechminds.com/registration/
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_123 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");

	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement fname=driver.findElement(By.id("fname"));
	fname.sendKeys("Shrinidhi");
	Actions a1=new Actions(driver);
	a1.doubleClick(fname).perform();
	Thread.sleep(2000);
	
	
}
}
