package Automate_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		List<WebElement> mylist = driver.findElements(By.tagName("a"));
		int r=mylist.size();
		System.out.println(r);
		
		for(WebElement link: mylist)
		{
			//System.out.println(link.getText());
			Thread.sleep(5000);
			if("Demo Site".equals(link));
			{
				link.click();
			}
		}
		
			driver.close();
		
	}

}
