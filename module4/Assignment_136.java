package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 go to https://www.flipkart.com/
search for sunglass and choose 1st auto suggestion
 * 
 */
public class Assignment_136 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement pop=driver.findElement(By.xpath("//span[@role='button']"));
	pop.click();
	WebElement search=driver.findElement(By.name("q"));
	
	search.sendKeys("sunglass");
	Thread.sleep(3000);
	
	List<WebElement> auto=driver.findElements(By.xpath("//form/ul/li"));
	Thread.sleep(3000);
	auto.get(0).click();
	
	
}
}
