package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Go to https://www.bseindia.com/markets/equity/equitysensexstream
 * Find Security code of ADANIPORTS
 
 */
public class Assignment_149 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	
	WebElement securitycode=driver.findElement(By.xpath("//b[text()=' ADANIPORTS ']/ancestor::tr/td[text()=' 532921 ']"));
	
	System.out.println("Security code of ADANIPORT is -->"+securitycode.getText());
}
}
