package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a Selenium program to enter your name in the First Name text box using Absolute XPath.
public class EnabledMethod {

       public static void main(String[] args) throws InterruptedException 
       {
               ChromeDriver driver=new ChromeDriver();
               driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
               driver.manage().window().maximize();
               Thread.sleep(2000);
               WebElement e1=driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
               e1.sendKeys("Shrinidhi");
               Thread.sleep(3000);
               //driver.quit();
       
               
               WebElement cb=driver.findElement(By.id("123"));
               if(cb.isEnabled()&&cb.isDisplayed())
               {
            	   cb.click();
               }
       }
}