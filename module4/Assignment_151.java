package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Go to -->https://www.bseindia.com/markets/equity/eqreports/mktwatchr?filter=gainer*all$all$
 find out the group of the TOP Company i.e whichever is on Top
 */
public class Assignment_151 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/eqreports/mktwatchr?filter=gainer*all$all$");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement group=driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
		System.out.println("Group of top company-->"+group.getText());
		
		
	}
	
}
