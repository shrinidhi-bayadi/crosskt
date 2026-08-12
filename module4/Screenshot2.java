package module4;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
/*Write a Selenium program to count all <input> tags 
 *present on the JSAM webpage
  (HTML link shared on whatsapp .please check)
 */
public class Screenshot2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> e1=driver.findElements(By.tagName("input"));
		int size=e1.size();
		System.out.println("count input tag-->"+size);
TakesScreenshot ts=driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\bnidh\\eclipse-workspace\\AB67Maven\\test-output\\screenshot\\one.png");
FileHandler.copy(source, dest);

		//driver.quit();
	}
	
	}