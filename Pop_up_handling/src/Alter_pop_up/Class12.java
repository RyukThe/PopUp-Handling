package Alter_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		m.get("https://demo.guru99.com/test/delete_customer.php");
		m.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		m.findElement(By.xpath("//input[@name='submit']")).click();
		Alert al = m.switchTo().alert();
		String t = al.getText();
		System.out.println(t);
		al.accept();
		al.accept();
	}

}
