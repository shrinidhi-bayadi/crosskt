package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*

Write a Selenium program to open the JSAM HTML page.
use absolute xpath:
Enter First Name 
Select the second checkbox button -> I have a Girl.
use relative xpath:
who are you? -> Select female radio button
Click  to know about us link.
 */
public class Assignment_119 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement firstname=driver.findElement(By.xpath("(/html/body/form)[1]/input[1]"));
		firstname.sendKeys("Shrinidhi");
		WebElement firstcb=driver.findElement(By.xpath("(/html/body/form)[2]/input[2]"));
		firstcb.click();
		Thread.sleep(3000);
		WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		female.click();
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.xpath("//a"));
		link.click();
		Thread.sleep(3000);
	
	}
}
