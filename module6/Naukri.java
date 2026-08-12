package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.naukri.com/");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Naukri.com"));
	Thread.sleep(60000);

//	WebElement login=driver.findElement(By.id("login_Layer"));
//	login.click();
//	Thread.sleep(2000);
////
//	WebElement username=driver.findElement(By.xpath("//input[@aria-label='Email ID / Username']"));
//	username.sendKeys("bnidhib8@gmail.com");
//	WebElement password=driver.findElement(By.xpath("//input[@aria-label='Password']"));
																																																																										//	password.sendKeys("Job123$$"+Keys.ENTER);
//	Thread.sleep(2000);
//
////	WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
////	wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
//
	WebElement complete=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/mnjuser/profile']")));
	complete.click();
	Thread.sleep(2000);

//	
//	WebElement goog=driver.findElement(By.xpath("//button[@class='google']"));
//	goog.click();
	WebElement file=driver.findElement(By.xpath("//input[@type='file' and @id='attachCV']"));
	file.sendKeys("C:\\Users\\bnidh\\OneDrive\\Desktop\\Shrinidhi Bayadi - Resume.pdf");
	
}
}
