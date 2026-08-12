package module4;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 *  
 	
WAP to login to amazon->
search the prodouct->
add it to wishlist->
add it to cart->
Reach payment page ->
Select Credit card option and enter your card details -this is present in iframe
 */
public class Assignment_152 {
	public static void login(ChromeDriver driver) throws InterruptedException {
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("bnidhib8@gmail.com");
		Thread.sleep(2000);

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		Thread.sleep(5000);

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Shop123$$");
		Thread.sleep(2000);

		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Thread.sleep(4000);

	}

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);

		WebElement sign = driver.findElement(By.id("nav-link-accountList"));
		sign.click();
		Thread.sleep(2000);

		login(driver);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mat" + Keys.ENTER);
		Thread.sleep(2000);

		WebElement mat = driver.findElement(By.xpath("(//a/h2/span)[1]"));
		mat.click();
		Thread.sleep(5000);

		WebElement wish = driver
				.findElement(By.xpath("//div[@class='lists-framework-unfilled-heart-accessibility-wrapper']/i"));
		wish.click();
		Thread.sleep(2000);

		WebElement hello = driver.findElement(By.xpath("//span[text()='Hello, Shrinidhi']"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(hello);

		Thread.sleep(2000);

		WebElement shoppinglist = driver.findElement(By.linkText("Shopping List"));

		shoppinglist.click();
		Thread.sleep(4000);

		WebElement addtocart = driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']"));

		addtocart.click();
		Thread.sleep(4000);

		WebElement car = driver.findElement(By.id("nav-cart-count"));
		car.click();
		Thread.sleep(6000);

		WebElement proceed = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
		proceed.click();
		Thread.sleep(4000);

		WebElement delivery = driver
				.findElement(By.id("checkout-primary-continue-button-id"));
		delivery.click();
		Thread.sleep(4000);

		WebElement newcard = driver.findElement(By.xpath("//div[@class='a-row pmts-add-cc-default-trigger']/img[1]"));
		newcard.click();
		Thread.sleep(4000);

		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@class,'apx-secure-iframe')]"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);

		WebElement card_num = driver.findElement(By.name("addCreditCardNumber"));
		card_num.sendKeys("341226197741019");
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.name("ppw-accountHolderName"));
		name.sendKeys("SHRINIDHI BAYADI");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//span[text()='01']"));
		month.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li/a[text()='09']")).click();
	
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("//span[text()='2026']"));
		year.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li/a[text()='2029']")).click();

		Thread.sleep(2000);
//
//		WebElement cvv=driver.findElement(By.name("addCreditCardVerificationNumber"));
//		cvv.sendKeys("118");
		WebElement add = driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent"));
		add.click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

	}
}
