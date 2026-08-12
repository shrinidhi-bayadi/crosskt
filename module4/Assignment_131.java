package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * WAP to automate the grotechminds registration form dropdown

https://grotechminds.com/registeration-form/"
 */
public class Assignment_131 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement fname=driver.findElement(By.name("firstName"));
		fname.sendKeys("Shrinidhi");
		Thread.sleep(1000);
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Bayadi");
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("bnidhib8@gmail.com");
		Thread.sleep(1000);
		
		WebElement phone=driver.findElement(By.id("phone"));
		phone.sendKeys("1234567898");
		Thread.sleep(1000);
		
		WebElement gender=driver.findElement(By.id("select2-gender-container"));
		gender.click();
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.sendKeys(Keys.ARROW_DOWN);
		a1.sendKeys(Keys.ARROW_DOWN);
		a1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		WebElement region=driver.findElement(By.id("select2-state-container"));
		region.click();
		Thread.sleep(3000);
		Actions a2=new Actions(driver);
		a2.sendKeys(Keys.ARROW_DOWN);
		a2.sendKeys(Keys.ARROW_DOWN);
		a2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		WebElement adhaar=driver.findElement(By.id("aadhaar"));
		adhaar.sendKeys("123456789812");
		Thread.sleep(1000);
		
		WebElement pan=driver.findElement(By.id("pan"));
		pan.sendKeys("abcde1234a");
		Thread.sleep(1000);
		
		
		WebElement check=driver.findElement(By.id("c_bs_1"));
		check.click();
		Thread.sleep(2000);
		
		
		
	
		
	}
}
