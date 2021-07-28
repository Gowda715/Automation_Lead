package MyAutomations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Iteration_Method {

	
	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.tagName("span"));
		for(WebElement list1:list)
		{
			System.out.println(list1.getText());
			
		}
		

}
}
