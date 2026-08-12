package module4;

import org.openqa.selenium.chrome.ChromeDriver;

/*
WAP to 
Launch Chrome browser.
Open https://grotechminds.com/.
Wait for 3 seconds.
Close the browser.
 */
public class Assignment_105 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/");
	Thread.sleep(3000);
	driver.quit();
}
}
