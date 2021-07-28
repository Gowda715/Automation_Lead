package MyAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles 
{
	@Test() 
	public void dologin()
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.ge.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://bel-india.in/");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
	}
	

}
