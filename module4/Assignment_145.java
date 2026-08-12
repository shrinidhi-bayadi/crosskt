package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Go to Employee table Html [shared on whatsapp]
FIND out how many rows are present?		
FIND out how many Columns  are present?		
FIND out how many QA's are working ?		
FIND out what is the salary of ram?		
print the dept of neha		
WAP to find oyt how many employees have the 
same salary as 80k	
WAP to iterate each employee names		
 */
public class Assignment_145 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/employee.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	
	//FIND out how many rows are present?	
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
	
	System.out.println("Number of Rows-->"+rows.size());
	
	//FIND out how many Columns  are present?	
	
	List<WebElement> column=driver.findElements(By.xpath("//table[@id='employeeTable']/descendant::th"));
	System.out.println("Number of column-->"+column.size());
	
	
	//FIND out how many QA's are working ?
	
	List<WebElement> qa_count=driver.findElements(By.xpath("//td[text()='QA']"));
	
	System.out.println("Number of QA-->"+qa_count.size());
	
	//FIND out what is the salary of ram?	
	
	WebElement ram_sal=driver.findElement(By.xpath("(//td[text()='Ram']/following-sibling::td)[2]"));
	System.out.println("Salary of Ram-->"+ram_sal.getText());
	
	
	//print the dept of neha	
	
	WebElement neha_Dept=driver.findElement(By.xpath("(//td[text()='Neha']/following-sibling::td)[1]"));
	System.out.println("Dept of Neha-->"+neha_Dept.getText());
	
//WAP to find out how many employees have the same salary as 80k
	
	List<WebElement> sal_80k=driver.findElements(By.xpath("//td[text()='80000']"));
	System.out.println("number of employees with 80k salary-->"+sal_80k.size());
	
	//WAP to iterate each employee names	
	
	List<WebElement> names=driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/td[1]"));
	
	System.out.println("iterate each employee names");
	for(int i=0;i<names.size();i++)
	{
		System.out.println(names.get(i).getText());
	}
	
	
}
}
