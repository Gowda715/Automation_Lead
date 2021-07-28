package Testing_IMP_Codes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println("message on alert box" + a.getText());
		a.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		a = driver.switchTo().alert();
		
		//to cancel the alert box
		a.dismiss();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		a= driver.switchTo().alert();
		
		//to provide input to the alert box
		a.sendKeys("Hello iam from test case");
		
		a.accept();
		

	}

}
