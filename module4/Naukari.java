package module4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	String parentid=driver.getWindowHandle();
	System.out.println("Parent id-->"+parentid);
	Thread.sleep(5000);
	WebElement s=driver.findElement(By.linkText("Remote"));
	Thread.sleep(3000);
	s.click();
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> i=ids.iterator();
	String pid=i.next();
	String cid=i.next();
	System.out.println("Parent id -->"+pid);
	System.out.println("Child id -->"+cid);
	driver.switchTo().window(cid);
	Thread.sleep(3000);
	WebElement m=driver.findElement(By.xpath("//span[text()='Jobs']"));
	m.click();
	
}
	
	
}
