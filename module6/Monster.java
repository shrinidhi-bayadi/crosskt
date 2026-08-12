package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Monster {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.monster.com/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.titleContains("Monster Jobs Search - Find Jobs Near Me | Monster.com"));
	WebElement username=driver.findElement(By.id("Input_Email"));
	wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("bnidhib8@gmail.com");
	WebElement password=driver.findElement(By.id("passwordInput"));
																																																																			wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Job123$$");
	WebElement login=driver.findElement(By.xpath("//button[@name='Input.Button']"));
	wait.until(ExpectedConditions.elementToBeClickable(login)).click();

	WebElement resume=driver.findElement(By.xpath("//div[text()='Upload My Resume or drop files here']"));
	Thread.sleep(2000);
	resume.sendKeys("C:\\Users\\bnidh\\OneDrive\\Desktop\\Shrinidhi Bayadi - Resume.pdf");
	
}
}
