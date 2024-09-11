package Alter_pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup2
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
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		//getText from alert popup
		String text = alt.getText();
		System.out.println(text);
		
//		//click on "Cancel" btn from alert popup
//		alt.dismiss();
		
		//click on "OK" btn from 1st alert popup
		alt.accept();
		
		//click on "OK" btn from 2nd alert popup
		alt.accept();
	}

}