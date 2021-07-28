package Automate_Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D://Softwares//Geeko//driver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/");

	}

}
