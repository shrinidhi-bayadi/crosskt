package module6;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Excelfetch 
{
        public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
        {
                // Create a FileInputStream to connect to the Excel file
                FileInputStream fs = new FileInputStream("C:\\Users\\bnidh\\eclipse-workspace\\AB67Maven\\test-output\\Exceldata\\shirnidhi.xlsx");
                Workbook wb=WorkbookFactory.create(fs);
        		String un=wb.getSheet("Amazonlogin").getRow(1).getCell(0).getStringCellValue();
        		String pwd=wb.getSheet("Amazonlogin").getRow(1).getCell(1).getStringCellValue();
        		//String ph=NumberToTextConverter.toText(wb.getSheet("Amazonlogin").getRow(2).getCell(0).getNumericCellValue());
        		//System.out.println(ph);
        		ChromeOptions options=new ChromeOptions();
        		options.addArguments("start-maximized");
                WebDriver driver=new ChromeDriver(options);
                WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
                
                driver.get("https://www.amazon.com/");
                wait.until(ExpectedConditions.titleContains("Amazon"));
                
        		WebElement accountlist=wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
        		accountlist.click();
        		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        		username.sendKeys(un);
        		WebElement cnt=wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
        		cnt.click();

        		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        		password.sendKeys(pwd);
        		
        		WebElement signin=wait.until(ExpectedConditions.elementToBeClickable(By.id("signInSubmit")));
        		signin.click();
        		
        		Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.","sorry assertion failed");
        		WebElement account=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hello, Shrinidhi']")));
        		Actions a1=new Actions(driver);
        		a1.moveToElement(account).perform();
        		WebElement signout=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign Out']")));
        		signout.click();
        		WebElement e1=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='claim-collection-container']/h1")));
        		Assert.assertEquals(e1.getText(), "Sign in or create account","Sorry assertiosn failed");
        		
        		driver.quit();
        	}
        }



