package module6;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldow {
        public static void main(String[] args) throws InterruptedException 
        {
                ChromeDriver driver=new ChromeDriver();
                driver.get("https://www.amazon.in/");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                WebElement e1=driver.findElement(By.linkText("About Amazon"));
                int x=        e1.getLocation().getX();
                int y=        e1.getLocation().getY();
                System.out.println(x);
                System.out.println(y);
                
                //driver.executeScript("window.scrollBy(0,"+y+")");
                
                JavascriptExecutor js=        driver;
                js.executeScript("window.scrollBy(0,900)");
                
        }
}
