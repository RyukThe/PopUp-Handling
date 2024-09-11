package Alter_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver m= new ChromeDriver();
		m.get("https://demo.guru99.com/test/delete_customer.php");
		m.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		m.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt = m.switchTo().alert();
		String s = alt.getText();
		System.out.println(s);
		
	}

}
