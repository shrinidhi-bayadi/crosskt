package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://letcode.in/edit
//WAP to perform actions on a disabled component using JavaScriptExecutor

public class Assignement_184 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://letcode.in/edit");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Edit Fields | LetCode with Koushik"));
	
	WebElement edit=driver.findElement(By.xpath("//input[@id='noEdit']"));
	
	/* this method is not recommended
	driver.executeScript("arguments[0].removeAttribute('disabled')", edit);
	Thread.sleep(2000);
	*/
	JavascriptExecutor js=driver;
	js.executeScript("arguments[0].removeAttribute('disabled')", edit);
	Thread.sleep(2000);
	edit.sendKeys("hello");
	Thread.sleep(2000);
	driver.quit();
	
}
}
