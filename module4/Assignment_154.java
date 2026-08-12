package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  WAP to go to 
  https://www.irctc.co.in/nget/train-search
  click on English
  search from -To to any destination , select date  and click on Search Trains button 
  print all the  train names
 
 */
public class Assignment_154 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement english=driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]"));
	english.click();
	Thread.sleep(4000);
	
	WebElement from=driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
	
	from.sendKeys("KSR BENGALURU - SBC ");
	Thread.sleep(2000); 

	
	WebElement to=driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
	
	to.sendKeys("CHENNAI EGMORE - MS (CHENNAI)");
	Thread.sleep(2000);
	
	WebElement calendar=driver.findElement(By.xpath("//span[@class='ng-tns-c69-9 ui-calendar']/input"));
	calendar.click();
	Thread.sleep(2000);
	
	WebElement date=driver.findElement(By.xpath("//a[text()='30']"));
	date.click();
	Thread.sleep(2000);

	WebElement submit=driver.findElement(By.xpath("//button[text()=' Search Trains ']"));
	submit.click();
	Thread.sleep(5000);
	
	List<WebElement> train=driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']/strong"));
	
	int size=train.size();
	System.out.println("Train names--->");
	for(int i=0;i<size;i++)
	{
		System.out.println(train.get(i).getText());
	}
	
	

	
}
}
