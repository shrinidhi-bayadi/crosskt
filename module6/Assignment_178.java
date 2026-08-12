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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment_178 {

	@Test
	public void headless()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
	
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.target.com/");
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(driver.getTitle(),"Target : Expect More. Pay Less.", "sorry target did not load");
		WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='searchTerm']")));
		search.sendKeys("dress"+Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//a[contains(@class,'styles_ndsLink')]")));

		List<WebElement> dress = driver.findElements(
		        By.xpath("//a[contains(@class,'styles_ndsLink')]"));
		int count=dress.size();
		s1.assertEquals(count>3,true,"sorry dress count did not load");
		s1.assertAll();

		driver.quit();
	
		
	}
}
