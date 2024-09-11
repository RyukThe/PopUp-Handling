package Alter_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver.exe");                  	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		//enter customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");	
	
		//click submit btn
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//getText from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
//		//click on "Cancel" btn from alert popup
//		driver.switchTo().alert().dismiss();
		
		//click on "OK" btn from 1st alert popup
		driver.switchTo().alert().accept();
		
		//click on "OK" btn from 2nd alert popup
		driver.switchTo().alert().accept();

	}

}
