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

//WAP to count the number of options available in a dropdown
public class Assignment194 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");
		
		wait.until(ExpectedConditions.titleContains("Amazon"));
		
		WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		search.sendKeys("dress"+Keys.ENTER);
	
		WebElement dropdown=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='a-autoid-0']")));
		dropdown.click();
	List<WebElement> auto=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']/li"))) ;
	int count=auto.size();
	System.out.println("number of autosuggestion in dropdown--->"+count);
	//driver.quit();
	}
}
