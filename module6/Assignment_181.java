package module6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//WAP to demonstrate Reporter.log() in TestNG.
public class Assignment_181 {

	@Test
	public void amazonsearch()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.com/");
		wait.until(ExpectedConditions.titleContains("Amazon"));
		SoftAssert s1=new SoftAssert();
		s1.assertTrue(driver.getTitle().contains("Amazon"),"sorry amazon did not launch");
		Reporter.log("Amazon Launched successfully");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));

		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes"+Keys.ENTER);
		Reporter.log("search shoes entered in searchbox");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='a-link-normal s-no-outline']")));
		
		List<WebElement> shoes=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		int count=shoes.size();
		Reporter.log("Search result displayed");
		Reporter.log("Total products found: " + count);
		s1.assertEquals(count>10,true,"sorry item did not load");
		Reporter.log("Test executed successfully");
		s1.assertAll();
		driver.quit();
		
		
	}
}
