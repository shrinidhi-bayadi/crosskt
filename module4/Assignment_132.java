package module4;
//WAP to automate the passport seva for city dropdown using keys functionality

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_132 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://services2.passportindia.gov.in/forms/registration?_gl=1%2Abyz5f1%2A_ga%2AMzU3ODkyMDMxLjE3ODE1ODEzNTE.%2A_ga_B4255W3J9F%2AczE3ODE1ODEzNTAkbzEkZzEkdDE3ODE1ODEzNjMkajQ3JGwwJGgw%2A_ga_JTJJBP5DNH%2AczE3ODE1ODEzNTAkbzEkZzEkdDE3ODE1ODEzNjMkajQ3JGwwJGgw");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		WebElement passport = driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-rs99b7 r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[2]"));
		passport.click();
		Thread.sleep(2000);

		WebElement office = driver.findElement(By.xpath(
				"//select[@class='r-14lw9ot r-ry2h4h r-1f0042m r-rs99b7 r-1qd0xha r-1b43r93 r-eu3ka r-crgep1 r-1hfyk0a']"));

		office.click();
		Thread.sleep(3000);

		office.sendKeys(Keys.ARROW_DOWN);
		office.sendKeys(Keys.ARROW_DOWN);
		office.sendKeys(Keys.ARROW_DOWN);
		office.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}
}
