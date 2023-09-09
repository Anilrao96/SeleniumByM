package WebDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class app_Login {

	
	
	public static WebDriver driver;
	public static void openURL() throws Exception {
			//System.setProperty("werbdriver.chrome.driver", "D:\\\\software\\\\chromedriver_win32 (3)\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramad\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://web.admin-serp-qa.361b27e29e1b449facec.centralindia.aksapp.io/login");
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			//Thread.sleep(5000);
			//*[@id="username"]
		}
	
	public static void verifyLogin() throws Throwable {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[1]")).click();
		//driver.findElement(By.name("email")).sendKeys("Mahesh");
		//*[@id="username"]
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testadmin2@mankind.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/form/div/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/form/div/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[8]/div/li/div/span/p")).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/button[2]")).click();
		
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.id("username")).sendKeys("anil");
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testmr2.serp@mankindpharma.com");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/form/div/div[1]/input")).sendKeys("jksdhssv");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/form/div/div[3]/div/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testmr2.serp@mankindpharma.com");
		//driver.findElement(By.name("login")).click();
		
		
		//*[@id="username"]
	}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		openURL();
		verifyLogin();
		//Logger.info("ede");
	}

}
