package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//google searchtext width,height
public class Googlewidthheight {
@Test
public void search()
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement e1=driver.findElement(By.name("q"));
	int ht=e1.getSize().getHeight();
	int wd=e1.getSize().getWidth();
	System.out.println(ht);
	System.out.println(wd);
	}
}
