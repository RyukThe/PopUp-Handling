package Implicitly_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\3rd Sept Mrng\\chromedriver_win32 (1)\\chromedriver.exe");                    //diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}