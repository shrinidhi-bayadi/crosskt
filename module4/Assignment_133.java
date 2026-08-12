package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAP to go to google.com
then count the number of options in the given autosuggestion
print those auto suggestions
*/
public class Assignment_133 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("India");
	Thread.sleep(3000);
	List<WebElement> auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	System.out.println("Number of auto suggestion --->"+auto.size());

	System.out.println("Auto suggestions are -->");
	for(int i=0;i<auto.size();i++)
	{
		System.out.println(auto.get(i).getText());
	}

}
}
