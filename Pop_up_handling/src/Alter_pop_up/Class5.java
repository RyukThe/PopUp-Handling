package Alter_pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 
{
	public static void main(String[] args)
	{
		WebDriver m= new ChromeDriver();
		m.get("https://demo.guru99.com/test/delete_customer.php");

		m.findElement(By.xpath("//input[@name='cusid']")).sendKeys("5454");
		m.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		String st = m.switchTo().alert().getText();
		System.out.println(st);
		
		m.switchTo().alert().dismiss();
		
		
	}

}
