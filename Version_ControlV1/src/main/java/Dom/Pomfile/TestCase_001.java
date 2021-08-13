package Dom.Pomfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_001 {
	WebDriver driver;

	public void openurl() {
		System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir", "Version_ControlV1\\Drivers"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}
	
	public void usern()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vinuamma2@gmail.com");
	}
	
	public void pass()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8892625187");
	}
	
	public void lg()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
	}
	
	public void Create()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
	}
	
	
}

