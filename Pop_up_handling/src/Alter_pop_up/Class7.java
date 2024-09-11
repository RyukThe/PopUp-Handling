package Alter_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver m= new ChromeDriver();
		m.manage().window().maximize();
		m.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		m.findElement(By.xpath("//input[@name='cusid']")).sendKeys("121");
		m.findElement(By.xpath("//input[@name='submit']")).click();
		Alert al = m.switchTo().alert();
		String str = al.getText();
		System.out.println(str);
		al.accept();
		Thread.sleep(2000);
		al.accept();
	}

}
