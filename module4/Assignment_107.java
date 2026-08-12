package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a Selenium program to open Amazon -> https://www.amazon.in/
 search for "shoes" using findElement(),and press Enter using Keys.ENTER.
 */
public class Assignment_107 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoes"+Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
