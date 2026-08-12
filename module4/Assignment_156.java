package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 
 WebSite: Local HTML Practice Page (iframehtmlpagefromGROTECHMINDS.html)
[This HTML file was shared during the class on 29 June 2026.]

Launch the local HTML webpage.
Maximize the browser window.
Enter the student name and mobile number.
Select   the gender.
Select Automation Testing from the Course dropdown.
Accept the Terms & Conditions checkbox.
Click the Register Student button.
Enter the teacher name.
Increase the teacher's experience to 3 years using keyboard actions.
Enter teacher remarks.
Switch to Iframe Level 1.
Enter student feedback.
Select Good as the feedback rating.
Click the Submit Feedback button.
Switch back to the main webpage using defaultContent().
 */
public class Assignment_156 {
	public static void main(String[] args) throws InterruptedException {
		

ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/iframehtmlpagefromGROTECHMINDS.html");
driver.manage().window().maximize();
Thread.sleep(5000);


WebElement studentname=driver.findElement(By.id("studentName"));
studentname.sendKeys("Shrinidhi");
Thread.sleep(1000);

WebElement mobile=driver.findElement(By.name("studentMobile"));
mobile.sendKeys("1234567898");
Thread.sleep(1000);
WebElement gender=driver.findElement(By.id("genderFemale"));
gender.click();
Thread.sleep(1000);

WebElement course=driver.findElement(By.xpath("//select[@id='course']"));

Select s1=new Select(course);
s1.selectByValue("automation");
Thread.sleep(1000);

WebElement terms=driver.findElement(By.id("acceptTerms"));
terms.click();
Thread.sleep(1000);

WebElement register=driver.findElement(By.id("studentSubmitBtn"));
register.click();
Thread.sleep(1000);

WebElement teachername=driver.findElement(By.id("teacherName"));
teachername.sendKeys("MKT");
Thread.sleep(1000);

WebElement experience=driver.findElement(By.xpath("//input[@id='teacherExperience']"));
experience.click();
experience.sendKeys(Keys.ARROW_UP);
experience.sendKeys(Keys.ARROW_UP);
experience.sendKeys(Keys.ARROW_UP);
Thread.sleep(1000);

WebElement remark=driver.findElement(By.id("teacherRemarks"));
remark.sendKeys("great teacher");
Thread.sleep(1000);

WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeLevel1']"));

driver.switchTo().frame(iframe);

WebElement feedback=driver.findElement(By.id("feedbackText"));
feedback.sendKeys("Wonderful class");
Thread.sleep(1000);

WebElement rating=driver.findElement(By.xpath("//input[@value='Good']"));
rating.click();
Thread.sleep(1000);

WebElement sub=driver.findElement(By.id("feedbackSubmitBtn"));
sub.click();
Thread.sleep(1000);

driver.switchTo().defaultContent();



	}
}