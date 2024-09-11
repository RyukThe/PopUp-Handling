package Child_Browser_pop_up;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 
{
	public static void main(String[] args)
	{
		WebDriver fd= new ChromeDriver();
		fd.get("https://skpatro.github.io/demo/links");
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fd.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> allid = fd.getWindowHandles();
		ArrayList<String> id=new ArrayList<String> (allid);
		for(String S:id)
		{
			System.out.println(S);
		}
		fd.switchTo().window(id.get(1));
		fd.findElement(By.xpath("//span[text()='Training']")).click();
		fd.switchTo().window(id.get(0));
		fd.findElement(By.xpath("//input[@name='home']")).click();
		
		
		
	}

}
