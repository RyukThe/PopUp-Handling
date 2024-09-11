package Hidden_Division_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7
{
	public static void main(String[] args)
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.flipkart.com/");
		m.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("adsds");
		m.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("sauravsagdh");
		m.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
	
	}

}
