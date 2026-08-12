package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resume_PRogram {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.dice.com/dashboard/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cmpwrapper")));

		SearchContext shadowRoot = shadowHost.getShadowRoot();

		WebElement acceptAll = shadowRoot.findElement(By.cssSelector("a.cmpboxbtnyes"));

		acceptAll.click();

		wait.until(ExpectedConditions
				.titleContains("Login to Your Dice Account or Register Today for an Account | Dice.com"));
		WebElement username = driver.findElement(By.xpath("//input[@inputmode='email']"));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("bnidhib8@gmail.com");

		WebElement login = driver.findElement(By.xpath("//button[@data-testid='sign-in-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Job123$$");

		WebElement signin = driver.findElement(By.xpath("//button[@data-testid='submit-password']"));
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();

		Thread.sleep(4000);
		WebElement sb = driver.findElement(By.xpath("//button[@aria-label='Shrinidhi Bayadi']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(sb).perform();

		WebElement myprofile = driver.findElement(By.xpath("//a[@href='https://www.dice.com/profile']"));
		wait.until(ExpectedConditions.elementToBeClickable(myprofile)).click();
		Thread.sleep(3000);

		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
		file.sendKeys("C:\\Users\\bnidh\\OneDrive\\Desktop\\Shrinidhi Bayadi - Resume.pdf");

		driver.quit();

	}
}
