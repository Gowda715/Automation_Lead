package Com.UberproPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;

public class Comlogin {
	WebDriver driver;

	public void openurl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.applitools.com");

	}

	public void username() {
		WebElement user;
		user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("vinod");

	}

	public void pass() {
		WebElement pass;
		pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Bombay27");
	}

	public void login() {
		WebElement log;
		log = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		log.click();
	}	
		
			
	}

