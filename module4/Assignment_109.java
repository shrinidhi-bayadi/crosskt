package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a Selenium program to open Google website
 *use LinkText Locater to identify the following links:
 *1)About
 *2)Gmail
 *3)Store
 *4)Image  
 Print all these links using getText() method
 At Last click on Image , wait for 3 second and then close the browser.
 */
public class Assignment_109 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement about = driver.findElement(By.linkText("About"));
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		WebElement Store = driver.findElement(By.linkText("Store"));
		WebElement Image = driver.findElement(By.linkText("Images"));
		System.out.println(about.getText());
		System.out.println(gmail.getText());
		System.out.println(Store.getText());
		System.out.println(Image.getText());
		Image.click();
		Thread.sleep(3000);
		driver.quit();

	}
}
