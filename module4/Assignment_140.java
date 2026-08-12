package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* WAP to launch 
  https://www.airindia.com/
  Click Accept All on cookie
  
 */
public class Assignment_140 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);

		WebElement cookie = driver.findElement(By.id("onetrust-accept-btn-handler"));

		cookie.click();
		Thread.sleep(3000);
		driver.quit();

	}
}
