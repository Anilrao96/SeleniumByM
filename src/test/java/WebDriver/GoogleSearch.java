package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static WebDriver driver;
	
	public static void openURL() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\software\\\\\\\\chromedriver_win32 (3)\\\\\\\\chromedriver_win32 (3)\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	}
	
	public static void googleSearch() {
		driver.findElement(By.name("q")).sendKeys("Ram");
		System.out.println("working");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("h3.LC20lb MBeuO DKV0Md")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openURL();
		googleSearch();
	}

}
