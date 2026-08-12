package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAP to automate 'All' dropdown using selectbyIndex
public class Assignment_126 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
//	WebElement c=driver.findElement(By.linkText("Continue shopping"));
//	Thread.sleep(3000);
//	c.click();
//	driver.manage().window().maximize();
Thread.sleep(5000);
	WebElement all=driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(all);
	  s1.selectByIndex(3);  
		
}
}
