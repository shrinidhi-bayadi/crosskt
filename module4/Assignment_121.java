package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Write a Program to Automate fresh hoverover  fromAmazon.in 
 */
public class Assignment_121 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement f=driver.findElement(By.xpath("//span[text()='Fresh']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(f).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
