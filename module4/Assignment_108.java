package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a Selenium program to automate the Amazon login page using
 *  findElement(), sendKeys(), and click() methods
 */
public class Assignment_108 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(3000);
		
        driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("seleniumtestbayadi@gmail.com");

		Thread.sleep(3000);

		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test123!");

		Thread.sleep(3000);
		WebElement signinbutton = driver.findElement(By.id("auth-signin-button"));
		signinbutton.click();
		Thread.sleep(3000);

		driver.quit();

	}

}
