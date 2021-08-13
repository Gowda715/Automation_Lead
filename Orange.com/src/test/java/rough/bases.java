package rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class bases {

	
	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Log4j\\Log4j.Properties");
		FileInputStream log =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Log4j\\Locators.Properties");
		pro.load(fis);
		pro.load(log);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("testurl"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
	


}
}