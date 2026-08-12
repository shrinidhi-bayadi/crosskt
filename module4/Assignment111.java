package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Open Google.
Identify the search box using TagName.
Enter "grotechminds".
Press Enter.
quit()
 */
public class Assignment111 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.tagName("textarea"));
		e1.sendKeys("grotechminds" + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
