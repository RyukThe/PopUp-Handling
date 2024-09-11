package Child_Browser_pop_up;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 
{
	public static void main(String[] args) 
	{
		WebDriver m =new ChromeDriver();
		m.get("https://skpatro.github.io/demo/links/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = m.getWindowHandles();
		ArrayList<String> ids= new ArrayList<>(id);
		String s = ids.get(1);
		System.out.println(s);
		m.switchTo().window(s);
		m.findElement(By.xpath("//span[text()='Training']")).click();
		String sd = ids.get(0);
		m.switchTo().window(sd);
		m.findElement(By.xpath("//input[@name='NewWindow']")).click();
		System.out.println(ids);
		
		
	}

}
