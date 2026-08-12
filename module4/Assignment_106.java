package module4;

import org.openqa.selenium.chrome.ChromeDriver;

/*
Wap on below Browser Methods
Launch Chrome.
Open Facebook.
Print:
Title
Current URL
quit the browser.
 */
public class Assignment_106 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();

		String url = driver.getCurrentUrl();

		System.out.println("title-->" + title);

		System.out.println("Current url-->" + url);

		driver.quit();
	}
}
