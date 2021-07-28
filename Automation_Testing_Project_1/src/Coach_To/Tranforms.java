package Coach_To;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tranforms {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://coach-to-transformation.com");
		driver.manage().window().maximize();

	}

}
