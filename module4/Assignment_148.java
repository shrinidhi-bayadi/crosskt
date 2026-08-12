package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*

Register your Account here-->https://demowebshop.tricentis.com/

Launch https://demowebshop.tricentis.com/
login
Search for "computer"
Click 1st product
Add to cart
Open cart
Update quantity to 2
Click Update shopping cart
 */
public class Assignment_148{
	
	public static void login(ChromeDriver driver) throws InterruptedException
	{
		WebElement login= driver.findElement(By.linkText("Log in"));
		login.click();
		
		WebElement email=driver.findElement(By.name("Email"));
		email.sendKeys("shrinidhibayadi@gmail.com");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("123@gms");
		Thread.sleep(2000);
		
		WebElement loginbutton= driver.findElement(By.xpath("//input[@value='Log in']"));
				loginbutton.click();
				Thread.sleep(4000);

	}
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	login(driver);
	
	WebElement search=driver.findElement(By.id("small-searchterms"));
	search.sendKeys("computer"+Keys.ENTER);
	Thread.sleep(3000);
	
	WebElement product=driver.findElement(By.xpath("//h2/a[1]"));
	product.click();
	Thread.sleep(3000);

	
	
	WebElement addtocart=driver.findElement(By.id("add-to-cart-button-72"));
	addtocart.click();
	Thread.sleep(5000);
	

	WebElement shoppingcart=driver.findElement(By.linkText("Shopping cart"));
	shoppingcart.click();
	Thread.sleep(3000);

	WebElement num=driver.findElement(By.xpath("//span[text()='Qty.:']/following-sibling::input"));
	num.clear();
	Thread.sleep(2000);

	num.sendKeys("2");
	Thread.sleep(3000);
	
	WebElement updatecart=driver.findElement(By.name("updatecart"));
	updatecart.click();
	Thread.sleep(3000);

}
}
