package Child_Browser_pop_up;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 
{
	public static void main(String[] args) 
	{
		WebDriver m =new ChromeDriver();
		m.get("https://skpatro.github.io/demo/links/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> all = m.getWindowHandles();
		ArrayList<String> id=new ArrayList<String>(all);
		m.switchTo().window(id.get(1));
		
		
		
		boolean img = m.findElement(By.xpath("(//img[contains(@class,'vc_single_image-img')])[2]")).isDisplayed();
		if(img==true)
		{
			System.out.println("image is present");
			
		}
		else
		{
			System.out.println("no image found");
		}
		m.switchTo().window(id.get(0));
		 m.findElement(By.xpath("//input[@name='NewWindow']")).click();
		 Set<String> sa = m.getWindowHandles();
		 ArrayList<String> l=new  ArrayList<String> (sa);
		 
		 for(String o:l)
		 {
			 System.out.println(o);
		 }
		 m.switchTo().window(l.get(2)).manage().window().fullscreen();
		 m.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("TestNG");
		 m.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).click();
		 m.findElement(By.xpath("(//li[contains(@class,'menu-item menu-item-type-custom me')])[10]")).click();
		 m.switchTo().window(l.get(0));
		 m.findElement(By.xpath("//input[@name='home']")).click();
		 m.findElement(By.xpath("//a[text()='iFrames']")).click();
		 m.switchTo().frame("Frame1");
		String as = m.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(as);
		m.findElement(By.xpath("//a[text()='Category1']")).click();
		WebElement ass = m.findElement(By.xpath("//a[text()='Category2']"));
		System.out.println(ass.getText());
		ass.click();
		m.switchTo().defaultContent();
		m.switchTo().frame("Frame2");
		WebElement asss = m.findElement(By.xpath("//a[text()='Category3']"));
		System.out.println(asss);
		asss.click();
		Set<String> sds = m.getWindowHandles();
		ArrayList<String> id3=new ArrayList<String>(sds);
		for(String d:id3)
		{
			System.out.println(d);
		}
		 
		 
		 
		 }

}
