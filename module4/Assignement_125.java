package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to automate 'All' dropdown using Key functionalit
public class Assignement_125 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement all=driver.findElement(By.id("searchDropdownBox"));
	all.click();
	Thread.sleep(1000);
	all.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	all.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	all.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
}
}
