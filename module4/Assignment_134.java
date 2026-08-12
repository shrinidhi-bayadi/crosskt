package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to go to google.com
//then select the 1st number autosuggestion

public class Assignment_134 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		Thread.sleep(2000);

		List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		String first = auto.get(0).getText();

		System.out.println("First auto suggestion is -->" + first);

		auto.get(0).click(); //get Recaptcha -I am not robot .Click on that it shows first auto suggestion
		Thread.sleep(3000);

	}
}
