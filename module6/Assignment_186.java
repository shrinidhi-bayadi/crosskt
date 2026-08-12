package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Automate the GroTechMinds registration form at https://grotechminds.com/registration/
  including file upload pop ups. Do not click the Submit button at the end.
 */

public class Assignment_186 {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://grotechminds.com/registration/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Automate GroTechMinds Registration Page using Selenium"));
		WebElement fname = driver.findElement(By.id("fname"));
		wait.until(ExpectedConditions.visibilityOf(fname)).sendKeys("Shrinidhi");
		WebElement lname = driver.findElement(By.id("lname"));
		wait.until(ExpectedConditions.visibilityOf(lname)).sendKeys("Bayadi");

		WebElement email = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("bnidhib8@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("password");

		WebElement gender = driver.findElement(By.id("Female"));
		wait.until(ExpectedConditions.elementToBeClickable(gender)).click();

		WebElement skill = driver.findElement(By.id("Skills"));
		wait.until(ExpectedConditions.elementToBeClickable(skill));
		Select s1 = new Select(skill);
		s1.selectByContainsVisibleText("Technical Skills");

		WebElement country = driver.findElement(By.id("Country"));
		wait.until(ExpectedConditions.elementToBeClickable(country));
		Select s2 = new Select(country);
		s2.selectByContainsVisibleText("India");

		WebElement presentaddress = driver.findElement(By.id("Present-Address"));
		wait.until(ExpectedConditions.visibilityOf(presentaddress)).sendKeys("wesley  chapel florida");
		WebElement permanentaddress = driver.findElement(By.id("Permanent-Address"));
		wait.until(ExpectedConditions.visibilityOf(permanentaddress)).sendKeys("epperson wesley  chapel florida");

		WebElement pin = driver.findElement(By.id("Pincode"));
		wait.until(ExpectedConditions.visibilityOf(pin)).sendKeys("33545");

		WebElement religion = driver.findElement(By.id("Relegion"));
		wait.until(ExpectedConditions.elementToBeClickable(religion));
		Select s3 = new Select(religion);
		s3.selectByContainsVisibleText("Hindu");

		WebElement file = driver.findElement(By.id("file"));
		wait.until(ExpectedConditions.visibilityOf(file));
		file.sendKeys("C:\\Users\\bnidh\\OneDrive\\Desktop\\Fileupload.txt");

		WebElement bot = driver.findElement(By.id("chat-bot-message-close"));
		bot.click();

		WebElement relocate = driver.findElement(By.id("relocate"));
		wait.until(ExpectedConditions.elementToBeClickable(relocate));

		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", relocate);

		//driver.quit();
	}
}