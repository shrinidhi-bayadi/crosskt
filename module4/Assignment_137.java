package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * WAP to go to https://retail.sbi.bank.in/retail/login.htm
 * Click on contact us 
 */
public class Assignment_137 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://retail.sbi.bank.in/retail/login.htm");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement contact=driver.findElement(By.linkText("Contact Us"));
			
			contact.click();
	
}
}
