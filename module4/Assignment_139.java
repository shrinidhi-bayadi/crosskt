package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
WAP to go to
1. Launch https://pharmeasy.in/
2. Search for "dolo 650"
3. Click 1st product/search result
4. Add 4 quantity 
5. Click Add to Cart
  
 */
public class Assignment_139 {

		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://pharmeasy.in/");
			driver.manage().window().maximize();
			Thread.sleep(6000);

			WebElement sclick = driver.findElement(By.xpath("//button[@aria-label=\"Search\"]"));
			sclick.click();
			Thread.sleep(1000);

			WebElement search = driver.findElement(By.xpath("//input"));

			search.sendKeys("dolo 650" + Keys.ENTER);

			Thread.sleep(3000);

			WebElement addtocart = driver.findElement(By.xpath("(//button[@id='proceed'])[1]"));
			addtocart.click();
			Thread.sleep(3000);

			WebElement qty = driver.findElement(By.xpath("//span[text()='4']"));
			qty.click();
			Thread.sleep(3000);

		}
	}

