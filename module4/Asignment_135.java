package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to go to amazon.in
//then select the 1st number autosuggestion
public class Asignment_135 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	
WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("Toys");
Thread.sleep(3000);
List<WebElement> auto=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
auto.get(0).click();

}
}
