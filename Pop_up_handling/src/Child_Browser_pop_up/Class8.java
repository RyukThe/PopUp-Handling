package Child_Browser_pop_up;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.Option;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Class8 
{
	public static void main(String[] args) throws InterruptedException, IOException 
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
		 m.switchTo().window(id3.get(0));
		 m.findElement(By.xpath("//input[@name='home']")).click();
		 m.findElement(By.xpath("//a[text()='Alerts']")).click();
		 m.findElement(By.xpath("//input[@value='Submit']")).click();
		 Thread.sleep(2000);
		 m.switchTo().alert().accept();
		 m.findElement(By.xpath("//input[@value='PromptMe']")).click();
		Alert alt = m.switchTo().alert();
		 Thread.sleep(2000);
		 System.out.println(alt.getText());
		 Thread.sleep(2000);
		 alt.sendKeys("Saurav");
		 Thread.sleep(2000);
		 
		alt.accept();
		
		m.findElement(By.xpath("//input[@value='Confirm']")).click();
		Alert altq = m.switchTo().alert();
		 Thread.sleep(2000);
		altq.dismiss();
		m.findElement(By.xpath("//input[@name='home']")).click();
		m.findElement(By.xpath("//a[text()='SignUp Form']")).click();
		m.findElement(By.xpath("//input[@name='uname']")).sendKeys("Saurav");
		m.findElement(By.xpath("//input[@id='email']")).sendKeys("SauravKAsture@gamil.com"
				);
		m.findElement(By.xpath("//input[@id='tel']")).sendKeys("68768687676876");
		boolean sasa = m.findElement(By.xpath("//input[@id='fax']")).isEnabled();
		System.out.println(sasa);
		if(sasa==true)
		{
			System.out.println("Button is enable");
		}
		else
		{
			System.out.println("FAx button is disable");
		}
		 
		WebElement ssss = m.findElement(By.xpath("//select[@name='sgender']"));
		
		
		Select mmm= new Select(ssss);
		mmm.selectByIndex(0);
		
		WebElement radio = m.findElement(By.xpath("//input[@value='two']"));
		boolean rd = radio.isSelected();
		if (rd==true)
		{
			System.out.println(" radio is  selected");
		}
		else
		{
			System.out.println("Not Selected ");
			File shoot = ((TakesScreenshot)m).getScreenshotAs(OutputType.FILE);
			
			String rds = RandomString.make(2);
			
			File sam= new File("F:\\ScreenShotsel\\sassa"+rds+".jpg");
			FileHandler.copy(shoot, sam);
			
			
		}
		radio.click();
		
		m.findElement(By.xpath("//input[@value='Selenium']")).click();
		  m.findElement(By.xpath("//option[@value='white']")).click();
		  m.findElement(By.xpath("//input[@name='commit']")).click();

		  Thread.sleep(2000);
		  
		  m.switchTo().alert().accept();
		  
		  
		  System.out.println("-------------------------------------------------------------------");
		  
		  FileInputStream x =new FileInputStream("F:\\Excel\\Book1.xlsx");
		  Sheet sh = WorkbookFactory.create(x).getSheet("Sheet3");
		  int ri = sh.getLastRowNum();
		  for(int i=0;i<=ri;i++)
		  {
			 int ci = sh.getRow(i).getLastCellNum();
			 for(int j=0;j<=ci-1;j++)
			 {
				 Cell ceel = sh.getRow(i).getCell(j);
				CellType t = ceel.getCellType();
				if(t==CellType.STRING)
				{
					String ksks = ceel.getStringCellValue();
					System.out.print(ksks+" ");
				}
				else if (t==CellType.BOOLEAN)
				{
					boolean bool = ceel.getBooleanCellValue();
					System.out.print(bool+" ");
				}
				else
				{
					double num = ceel.getNumericCellValue();
					System.out.print(num+ " ");
				}
				
			 }
			 System.out.println();
		  }

		
		 }

}
