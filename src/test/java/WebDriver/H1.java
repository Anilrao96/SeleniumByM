package WebDriver;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1 {

	public static WebDriver driver;
	
	public static void  setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\software\\\\chromedriver_win32 (3)\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	
	public static void verifyLogin(String str1,String str2) {
		
	driver.findElement(By.id("user-name")).sendKeys(str1);
	driver.findElement(By.id("password")).sendKeys(str2);
	driver.findElement(By.id("login-button")).click();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 setup();
	 
	}
	
	public static void data() {
		
		HashMap m = new HashMap();
		m.put("standard_user", "secret_sauce");
		m.put("locked_out_user", "secret_sauce");
		m.put("problem_user", "secret_sauce");
		m.put("performance_glitch_user", "secret_sauce");
		
//		for(Object s:m.entrySet()) {
//					verifyLogin(m.getKey(),m.getvalue());		
//		}
		
		
		
	}

}
