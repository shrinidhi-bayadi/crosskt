package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

//Write a Selenium Program on FluentWait
public class Assignment_177 {

	
	public static  void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.target.com/");
		FluentWait<WebDriver> wait=
new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		
		WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='searchTerm']")));
	
		search.sendKeys("dress"+Keys.ENTER);
	
		//driver.quit();
		
	}
}
