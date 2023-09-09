package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMS_LoginLogout {

	public static WebDriver driver;
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
		
		
	}
	
	public static void verifyLogin() {
		
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
	}
	
	public static void verifyLogout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openURL();
		verifyLogin();
		verifyLogout();
	}

}
