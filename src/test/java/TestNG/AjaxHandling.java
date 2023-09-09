package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class AjaxHandling {
	public static WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(5000);
	  String s = driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
	  System.out.println(s);
	  String [] sp = s.split("\n");
	  System.out.println("no of values in the table"+sp.length);
	  for(int i = 0;i<sp.length;i++) {
		  
		  if(sp[i].equalsIgnoreCase("selenium webdriver")) {
			  driver.findElement(By.name("q")).clear();
			  Thread.sleep(2000);
			  driver.findElement(By.name("q")).sendKeys(sp[i]);
			  driver.findElement(By.name("btnK")).click();
			  
		  }
	  }
		  }
	  
  
  @Parameters("Browser")
  @BeforeTest
  public void beforeMethod(String str) {
	  if(str.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();}
	  else if(str.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
	  }
  }

}
