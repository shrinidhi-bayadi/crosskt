package module6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//WAP to handle Browser based Pop up using ChromeOptions
public class Assignment_182 {

	@Test
	public void handlepopup() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(4000);
		driver.get("https://www.walgreens.com/");
		driver.quit();

	}
}
