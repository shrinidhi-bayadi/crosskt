package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * /*
Assignment:
1. Launch https://www.walgreens.com/
2. Search for "Tylenol"
3. Click the 3rd product from search results
4.close pop up	
5. Click 3 items as Add to Cart
6. Open cart
7.Delete item from cart

if above website is not working in your region - please use 
https://www.apollopharmacy.in  [this is restricted in US]
Also write code for similar scenario
*/

public class Assignment_142 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.walgreens.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement search=driver.findElement(By.id("ntt-placeholder"));
	search.click();
	Thread.sleep(1000);
	search.sendKeys("Tylenol"+Keys.ENTER);
	Thread.sleep(5000);

	
	WebElement product=driver.findElement(By.xpath("//ul[@class='product-container']/li[3]"));
	product.click();
	Thread.sleep(5000);

	WebElement pop=driver.findElement(By.xpath("//span[@class='icon']"));
	pop.click();
	Thread.sleep(2000);
	
	WebElement qty=driver.findElement(By.id("ff-pickup-cart-quantity-dropdown"));
	
	Select s1=new Select(qty);
	s1.selectByValue("3");
	Thread.sleep(2000);

	WebElement add=driver.findElement(By.linkText("Add for pickup"));
	add.click();
	Thread.sleep(2000);
	WebElement view=driver.findElement(By.linkText("View cart"));
	view.click();
	Thread.sleep(5000);

	WebElement del=driver.findElement(By.xpath("//span[@class='icon icon_lsg icon__trash']"));
	del.click();
	Thread.sleep(2000);

	
}
}
