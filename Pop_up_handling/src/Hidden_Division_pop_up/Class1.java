package Hidden_Division_pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver m =new ChromeDriver();
	m.get("https://www.flipkart.com/");
	m.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	m.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Saurav");
	m.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("213ghsg");
	m.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
	}

}
