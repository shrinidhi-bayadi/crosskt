package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
go to -->https://beta.bseindia.com/register/AuditorRegisteration.aspx

Launch the BSE Auditor Registration page.
Maximize browser.
Fill all mandatory fields with dummy test data.
no need to verify OTP 
Select dropdown values if available.
At last click on Reset button

 */
public class Assignment_150 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://beta.bseindia.com/register/AuditorRegisteration.aspx");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		WebElement firmname = driver.findElement(By.id("txtFirmName"));
		firmname.sendKeys("Shriii");
		Thread.sleep(2000);

		WebElement address = driver.findElement(By.id("txtFirmAddress"));
		address.sendKeys("Shri QA Solutions LLP");
		Thread.sleep(2000);

		WebElement mobile = driver.findElement(By.name("txtfirmmobile"));
		mobile.sendKeys("9876543210");
		Thread.sleep(2000);

		WebElement mail = driver.findElement(By.name("txtfirmemail"));
		mail.sendKeys("test@example.com");
		Thread.sleep(2000);

		WebElement pan = driver.findElement(By.id("txtfirmPAN"));
		pan.sendKeys("ABCDE1234F");
		Thread.sleep(2000);

		WebElement reg = driver.findElement(By.id("txtFirmRegNo"));
		reg.sendKeys("123456W");
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.name("Gridview1$ctl02$txtname"));
		name.sendKeys("Rahul Sharma");
		Thread.sleep(2000);

		WebElement membership = driver.findElement(By.name("Gridview1$ctl02$txtMembership"));
		membership.sendKeys("123456");
		Thread.sleep(2000);

		WebElement pan_num = driver.findElement(By.name("Gridview1$ctl02$txtPAN"));
		pan_num.sendKeys("PQRSX6789K");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("Gridview1_txtEmailid_0"));
		email.sendKeys("rahul.sharma.qa@gmail.com");
		Thread.sleep(2000);

		WebElement contact = driver.findElement(By.id("Gridview1_txtContact_0"));
		contact.sendKeys("9876543210");
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.id("Gridview1_txtNoyear_0"));
		year.sendKeys("4");
		Thread.sleep(2000);

		WebElement drop = driver.findElement(By.xpath("//select[@id='Gridview1_ddlpatnership_0']"));
		Select s1 = new Select(drop);
		s1.selectByValue("1");
		Thread.sleep(3000);

		WebElement sp = driver.findElement(By.name("txtstopspam"));
		sp.sendKeys("77");
		Thread.sleep(2000);

		WebElement check = driver.findElement(By.id("chkConfirm"));
		check.click();
		Thread.sleep(2000);
		WebElement reset = driver.findElement(By.id("btnReset"));

		reset.click();
		Thread.sleep(2000);

	}
}
