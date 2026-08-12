package module4;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *  1. Launch SauceDemo  -https://www.saucedemo.com/
2. Login
3. Sort Price High to Low
4. Click on 3rd Product
5. Add to Cart
6. Open Cart
7. Checkout
8. Enter Customer Details
9. Finish Order
10. Logout

 */
public class Assignment_146 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);

		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		Thread.sleep(5000);

		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s1 = new Select(filter);
		s1.selectByContainsVisibleText("Price (high to low)");
		Thread.sleep(3000);

		List<WebElement> product = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		product.get(2).click();
		Thread.sleep(3000);

		WebElement addtocart = driver.findElement(By.id("add-to-cart"));

		addtocart.click();
		Thread.sleep(2000);

		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();
		Thread.sleep(3000);

		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(3000);

		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("shrinidhi");
		Thread.sleep(2000);

		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Bayadi");
		Thread.sleep(2000);

		WebElement post = driver.findElement(By.name("postalCode"));
		post.sendKeys("123456");
		Thread.sleep(2000);

		WebElement cont = driver.findElement(By.id("continue"));

		cont.click();

		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.id("react-burger-menu-btn"));
		button.click();
		Thread.sleep(2000);

		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));

		logout.click();
		Thread.sleep(2000);

	}
}