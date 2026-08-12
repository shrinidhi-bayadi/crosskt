package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch https://testautomationpractice.blogspot.com/
Scroll down and you see Static Web Table .Please work on below questions
Count total rows in BookTable excluding header.
Count total columns in BookTable.
Print all book names.
Print author of "Learn Selenium".
Print price of "Master In Java".
Print the names of the books whose subject is "Selenium".
Print the names of the books whose price is greater than or equal to 1000.
 */
public class Assignment_147 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Count total rows in BookTable excluding header.

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[1]"));
		System.out.println("Number of rows-->" + rows.size());

		// Count total columns in BookTable.

		List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));

		System.out.println("Number of column-->" + column.size());

		// Print all book names.
		System.out.println("All Book names-->");
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText());
		}
		// Print author of "Learn Selenium".

		WebElement author = driver.findElement(By.xpath("//td[text()='Learn Selenium']/following-sibling::td[1]"));

		System.out.println("Autor of Learn Selenium--->" + author.getText());

//Print price of "Master In Java".

		WebElement price = driver.findElement(By.xpath("//td[text()='Master In Java']/following-sibling::td[3]"));

		System.out.println("Price of Master In Java--->" + price.getText());
//Print the names of the books whose subject is "Selenium".

		List<WebElement> bname = driver.findElements(By.xpath("//td[text()='Selenium']/preceding-sibling::td[2]"));
		System.out.println("Booknames of subject Selenium");
		for (int i = 0; i < bname.size(); i++) {
			System.out.println(bname.get(i).getText());
		}

		// Print the names of the books whose price is greater than or equal to 1000.

		List<WebElement> p = driver.findElements(By.xpath("//td[text()>='1000']/preceding-sibling::td[3]"));
		System.out.println("print names of the books whose price is >=1000");

		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getText());
		}
	}
}
