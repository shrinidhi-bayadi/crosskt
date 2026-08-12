package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//WAP to demonstrate various CSS Selector syntaxes
public class Assignment_195 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/automation-practice-form");

		WebElement fname = driver.findElement(By.cssSelector("#firstName"));
		fname.sendKeys("shri");

		WebElement lname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lname.sendKeys("b");
		WebElement email = driver.findElement(By.cssSelector("input#userEmail"));
		email.sendKeys("bnnnn@gmail.com");
		WebElement gender = driver.findElement(By.cssSelector("input.form-check-input[value='Female']"));
		gender.click();

		WebElement mobile = driver.findElement(By.cssSelector("input[placeholder^='Mobile']"));

		mobile.sendKeys("1234567898");

		WebElement dob = driver.findElement(By.cssSelector("#dateOfBirthInput"));
		dob.click();

		WebElement cdate = driver.findElement(By.cssSelector("div[aria-label='Choose Saturday, August 8th, 2026']"));
		cdate.click();

		WebElement subject = driver.findElement(By.cssSelector(".subjects-auto-complete__input"));
		subject.sendKeys("math");
		subject.sendKeys(Keys.ENTER);

		WebElement read = driver.findElement(By.cssSelector("#hobbies-checkbox-2"));
		read.click();

		WebElement file = driver.findElement(By.cssSelector("input[type='file']"));
		file.sendKeys("C:\\Users\\bnidh\\OneDrive\\Desktop\\Fileupload.txt");

		WebElement address = driver.findElement(By.cssSelector("textarea.form-control"));
		address.sendKeys("abcddd");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", address);

		WebElement state = driver.findElement(By.cssSelector("input[id='react-select-3-input']"));
		state.sendKeys("Haryana");
		state.sendKeys(Keys.ENTER);

		WebElement city = driver.findElement(By.cssSelector("#react-select-4-input"));
		city.click();
		city.sendKeys(Keys.ARROW_DOWN);
		city.sendKeys(Keys.ENTER);

	}
}
