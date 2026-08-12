package module6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * Write a selenium program to count total number of Autosuggestion and print each Autosuggestion
 */
public class Assignment_193 {
public static void main(String[] args) {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.google.com/");
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement search=driver.findElement(By.name("q"));
search.sendKeys("india");

List<WebElement> auto=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span"));
int count=auto.size();
System.out.println("number of auto suggestion-->"+count);

System.out.println("print autosuggestion-->");
for(WebElement i:auto)
{
	System.out.println(i.getText());
}

driver.quit();

}

}
