package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Write a Selenium program to open Amazon.in website.
Use PartialLinkText locator to identify the "Fashion" link.
Print the link text and click on it.
 */
public class Assignment_110 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement fashion=driver.findElement(By.partialLinkText("Fash"));
		System.out.println(fashion.getText());
		fashion.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
