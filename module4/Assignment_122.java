package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to launch google.com and do the right click on gmail
public class Assignment_122 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement gmail=driver.findElement(By.linkText("Gmail"));
	Actions a1=new Actions(driver);
	a1.contextClick(gmail).perform();
	Thread.sleep(2000);

	
}
}
