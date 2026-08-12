package module4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Automate this:
On the below website
https://www.ebay.com/
Search Toys product and click on 3rd one.
Click on Add to cart
Click on Checkout 1 Item
*/

public class Assignment_141 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement search = driver.findElement(By.name("_nkw"));
		search.sendKeys("Toys" + Keys.ENTER);
		Thread.sleep(6000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='srp-results srp-grid clearfix']/li"));

		list.get(2).click();
		Thread.sleep(5000);

		Set<String> id = driver.getWindowHandles();

		Iterator<String> i = id.iterator();
		String pid = i.next();
		String cid = i.next();
		driver.switchTo().window(cid);
		Thread.sleep(5000);

		WebElement addtocart = driver.findElement(By.id("atcBtn_btn_1"));
		addtocart.click();
		Thread.sleep(3000);

		WebElement checkout = driver.findElement(By.linkText("Checkout 1 item"));
		checkout.click();
		Thread.sleep(3000);

	}
}
