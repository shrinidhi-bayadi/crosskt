package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 WAP  to go to   https://www.amazon.in/
 search "shoes"
After searching the product on Amazon
Click on the checkbox of Campus Brand.
			
 */
public class Assignment_144 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes" + Keys.ENTER);
		Thread.sleep(3000);

		WebElement campus = driver.findElement(By.xpath(
				"//div[@id='brandsRefinements']/descendant::span[text()='Campus']/ancestor::span[@class='a-list-item']/descendant::i"));
		campus.click();
		Thread.sleep(3000);

		driver.quit();
	}
}
