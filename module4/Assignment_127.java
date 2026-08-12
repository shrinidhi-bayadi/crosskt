package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAP to automate 'All' dropdown using selectbyVisibletext
public class Assignment_127 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement all=driver.findElement(By.id("searchDropdownBox"));
	System.out.println(all.isDisplayed()); // this is giving false
	Thread.sleep(5000);
	Select s1=new Select(all);
	s1.selectByVisibleText("Alexa Skills");

}
}
