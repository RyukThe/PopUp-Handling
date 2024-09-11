package Hidden_Division_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_HiddenDivisionPopup
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		//enter UN
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("xyz");
		
		//click on login btn
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		//getText from alert popup
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
		
		
	}

}