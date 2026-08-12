package module4;
/*
Open Google.
Locate the search box using className locater.
Search for $tsla.
Wait 3 seconds.
Close the browser using driver.quit().
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_112 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.className("gLFyf"));
		e1.sendKeys("$tsla" + Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();

	}
}
