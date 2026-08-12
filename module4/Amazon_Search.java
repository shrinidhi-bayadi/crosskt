package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Search {

	        public static void main(String[] args) throws InterruptedException 
	        {
	                ChromeDriver driver=new ChromeDriver();
	                driver.get("https://www.amazon.in");
	                
	                Thread.sleep(3000);
	                WebElement e1=        driver.findElement(By.id("twotabsearchtextbox"));
	                e1.sendKeys("toys");
	                WebElement e2=        driver.findElement(By.id("nav-search-submit-button"));
	                e2.click();
	                Thread.sleep(3000);
	                
	                List<WebElement>        list =driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	                list.get(0).click();
	                
	        }
	}
	
