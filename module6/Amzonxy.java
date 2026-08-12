package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//find x and y of amazon locater
public class Amzonxy {

	@Test
	public void amazon()
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement e1=driver.findElement(By.linkText("About Amazon"));
		int x=e1.getLocation().getX();
		int y=e1.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		e1.click();
	}
}

