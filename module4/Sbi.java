package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sbi {

        public static void main(String[] args) throws InterruptedException 
        {
                ChromeDriver driver=new ChromeDriver();
                driver.get("https://retail.sbi.bank.in/retail/login.htm");
                driver.manage().window().maximize();
                Thread.sleep(3000);
                WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
                e1.click();
                
                WebElement usname=driver.findElement(By.id("username"));
                usname.sendKeys("Shri");
                
                }
}
