package module6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nk {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.naukri.com/mnjuser/homepage");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement complete=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/mnjuser/profile']")));
	complete.click();
	WebElement file=driver.findElement(By.xpath("//input[@type='file' and @id='attachCV']"));
	file.sendKeys("C:\\Users\\bnidh\\OneDrive\\Desktop\\Shrinidhi Bayadi - Resume.pdf");
	
}
}
