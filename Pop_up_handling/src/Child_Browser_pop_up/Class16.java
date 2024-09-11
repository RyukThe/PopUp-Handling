package Child_Browser_pop_up;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class16
{
	public static void main(String[] args)
	{
		WebDriver m = new ChromeDriver();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://skpatro.github.io/demo/links/");


		
		m.findElement(By.xpath("//input[@name='NewTab']")).click();
	
		Set<String> allId = m.getWindowHandles();
		ArrayList<String> id=new ArrayList<String>(allId);
		String main = id.get(0);
		String child = id.get(1);
		m.switchTo().window(child);
		m.findElement(By.xpath("//span[text()='Training']")).click();
		Set<String> saa = m.getWindowHandles();
		ArrayList<String> mm= new ArrayList<String>(saa);
		
		
				
		m.switchTo().window(mm.get(1));
				m.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button']")).click();
				
				
				
		
	}
}
