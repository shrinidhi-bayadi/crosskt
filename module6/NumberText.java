package module6;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*
 * Create a TestNG DataProvider to fetch multiple username and password combinations from an Excel sheet using Apache POI,
 *  perform Amazon login, and validate empty username, invalid email,
 *  incorrect password, and successful login scenarios using SoftAssert.
 */
public class NumberText {
	@DataProvider()

	public Object inputs() throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\bnidh\\eclipse-workspace\\AB67Maven\\test-output\\Exceldata\\shirnidhi.xlsx");
		Workbook wb = WorkbookFactory.create(fs);

		Object d1[][] = new Object[5][2];
		for (int row = 0; row < 5; row++) {
			
			for(int col=0;col<2;col++)
			{
		
			String value = wb.getSheet("AmazonDDT").getRow(row).getCell(col).getStringCellValue();

			d1[row][col] = value;

		}
		}

		return d1;
	}

	@Test(dataProvider = "inputs")
	public void amazonlogin(String input1,String input2) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SoftAssert a2 = new SoftAssert();
		WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Hello')]"));
		sign.click();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(input1);
		WebElement cnt = driver.findElement(By.xpath("//input[@aria-labelledby='continue-announce']"));
		cnt.click();
//assert for empty username
		if (input1.equals("")) {
			WebElement emptyusername = driver.findElement(By.id("empty-claim-alert"));
			a2.assertEquals(emptyusername.getText(), "Enter your mobile number or email",
					"Empty username validation failed");
		} 
		//assert for incorrect email
		else if (!input1.equals("bnidhib8@gmail.com")) {
			WebElement invalidemail = driver.findElement(By.id("invalid-email-alert"));
			a2.assertEquals(invalidemail.getText(), "Invalid email address");
		} else {
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(input2);
			WebElement signin = driver.findElement(By.id("signInSubmit"));
			signin.click();
//check for correct password entry
			if (!input2.equals                                                                                                     																																										 																				("Ambika67!")) {
				WebElement incorrrectpassword = driver.findElement(
						By.xpath("//div[@id='auth-error-message-box']/descendant::div[@class='a-alert-content']"));
				a2.assertTrue(incorrrectpassword.getText().contains("Your password is incorrect"));
			}

			else
				a2.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.", "sorry login failed");

		}
		a2.assertAll();
		driver.quit();

	}

	}

