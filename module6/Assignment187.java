package module6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*WAP to handle a JavaScript Alert popup by accepting it
*/

public class Assignment187 {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		WebElement alerts = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alerts.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		driver.quit();

	}
}
