package Automate_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException  {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.bel-india.in/");
		driver.findElement(By.xpath("//span[contains(text(),'About Us')]\"")).click();
		//The below automation code is showing on working different elements
		
			WebElement Element;
			Element=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
			Element.click();
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);

			Thread.sleep(5000);
		 
			Robot ro = new Robot();
			ro.keyPress(KeyEvent.VK_PAGE_UP);
		 
			driver.close();

		
		
		
				

	}

}
