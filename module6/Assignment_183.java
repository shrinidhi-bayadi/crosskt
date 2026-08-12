package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;import org.openqa.selenium.JavascriptExecutor;

//Write a Selenium program to scroll up and scroll down on a webpage using JavaScriptExecutor.
public class Assignment_183 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.get("https://grotechminds.com/");
	wait.until(ExpectedConditions.titleContains("GroTechMinds"));
	WebElement aboutus=driver.findElement(By.xpath("(//a[@class='elementor-item' and text()='About US'])[1]"));
	int x=aboutus.getLocation().getX();
	int y=aboutus.getLocation().getY();
	System.out.println(x);
	System.out.println(y);
	JavascriptExecutor js= driver;
	
	//scroll down till about us and then scroll up
	js.executeScript("window.scrollBy(0,"+(y-500)+")");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0, -2000)");
	Thread.sleep(2000);

	driver.quit();
	
}
}
