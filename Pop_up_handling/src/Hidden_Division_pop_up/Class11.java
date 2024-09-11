package Hidden_Division_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class11 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.navigate().to("https://www.flipkart.com/");
		m.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Saurav");
		m.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("saudsdsad");
		m.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
	}

}
