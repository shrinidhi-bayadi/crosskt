package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Go to https://grotechminds.com/
 * Click on manish photo and enter your name
 * close the bot 
 * Click on Apply Now 
 * Enter data and submit
 */
public class Assignment_153 {
public static void main(String[] args) throws InterruptedException {
	
	
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/");
driver.manage().window().maximize();
Thread.sleep(8000);

WebElement bot=driver.findElement(By.id("chat-bot-launcher-button"));
bot.click();
Thread.sleep(5000);

WebElement iframe=driver.findElement(By.id("chat-bot-iframe"));
driver.switchTo().frame(iframe);

WebElement text=driver.findElement(By.id("textInput"));
text.sendKeys("shrinidhi b"+Keys.ENTER);
Thread.sleep(4000);
driver.switchTo().defaultContent();
Thread.sleep(2000);
WebElement close=driver.findElement(By.id("chat-bot-widget-close"));
close.click();
Thread.sleep(2000);



WebElement apply=driver.findElement(By.xpath("//button[text()='Apply Now']"));
apply.click();
Thread.sleep(2000);

WebElement name=driver.findElement(By.name("your-name"));
name.sendKeys("shri");
Thread.sleep(2000);

WebElement mail=driver.findElement(By.name("your-email"));
mail.sendKeys("bnidhib8@gmail.com");
Thread.sleep(2000);

WebElement card=driver.findElement(By.name("your-number"));
card.sendKeys("123456789");
Thread.sleep(2000);

WebElement submit=driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit has-spinner']"));

submit.click();


}
}
