package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Open the JSAM HTML form.
   verify that the First Name and Last Name textboxes are displayed and enabled using isDisplayed() and isEnabled().
   then enter valid data into both fields.
  
 */
public class Assignment_138 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement fname = driver.findElement(By.name("fname"));
		if (fname.isDisplayed() && fname.isEnabled()) {
			System.out.println("You can enter firstname");
			fname.sendKeys("Shrinidhi");
		} else {
			System.out.println("You can not enter firstname");
		}
		WebElement lname = driver.findElement(By.id("121"));
		if (lname.isDisplayed() && lname.isEnabled()) {
			System.out.println("You can enter lastname");
			lname.sendKeys("Bayadi");
		} else {
			System.out.println("You can not enter lastname");
		}
	}
}
