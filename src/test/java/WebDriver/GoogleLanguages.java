package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguages {

	public static WebDriver driver;
	
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
			
		}
		
//	public static void clickLinks(String str) {
//		
//		driver.findElement(By.xpath(str)).click();
//		driver.findElement(By.linkText("English")).click();
//	}
	public static void hindi() {
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]")).click();
		driver.findElement(By.linkText("English")).click();
	}
	
	public static void bengali() {
		
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[2]")).click();
		driver.findElement(By.linkText("English")).click();
	}
	
	public static void telugu() {
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[3]")).click();
		driver.findElement(By.linkText("English")).click();
		
	}
	public static void marathi() {
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[4]")).click();
		driver.findElement(By.linkText("English")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openURL();
		hindi();
		bengali();
		telugu();
		marathi();
		
		
		//parameterization
//		clickLinks("//div[@id='SIvCob']/a[1]");
//		clickLinks("//div[@id='SIvCob']/a[2]");
//		clickLinks("//div[@id='SIvCob']/a[4]");
//		clickLinks("//div[@id='SIvCob']/a[4]");
	}

}
