package module6;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
Fetch multiple search keywords from an Excel sheet using Apache POI through a TestNG DataProvider and search each keyword on Amazon.
 */
public class Assignment191 {
	@DataProvider()

	public Object inputs() throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\bnidh\\eclipse-workspace\\AB67Maven\\test-output\\Exceldata\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fs);

		Object d1[][] = new Object[5][1];
		for (int row = 0; row < 5; row++) {
			String value = wb.getSheet("search").getRow(row).getCell(0).getStringCellValue();

			d1[row][0] = value;

		}

		return d1;
	}

	@Test(dataProvider = "inputs")
	public void amzonsearch(String input) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.amazon.in");
		wait.until(ExpectedConditions.titleContains("Amazon.in"));

		WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		e1.sendKeys(input + Keys.ENTER);
		Thread.sleep(2000);   // only so you can see the result page
       driver.quit();

	}
}
