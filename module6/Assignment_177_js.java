package module6;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

//Write a Selenium Program on FluentWait
public class Assignment_177_js {

	
	public static  void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
		WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='searchTerm']")));
	
		search.sendKeys("dress"+Keys.ENTER);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//a[@class='styles_ndsLink__GUaai h-display-block']")));
		List<WebElement> dress=driver.findElements(By.xpath("//a[@class='styles_ndsLink__GUaai h-display-block']"));
		wait.until(ExpectedConditions.elementToBeClickable(dress.get(0)));
		WebElement firstdress=dress.get(0);
		((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", firstdress);
		//driver.quit();
		
	}
}
