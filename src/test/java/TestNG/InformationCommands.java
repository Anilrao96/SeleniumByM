package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InformationCommands {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println("Text available in linktext "+str1);
	  
	  String str2 = driver.findElement(By.name("btn1")).getAttribute("aria-label");
	  System.out.println("Text available in button: "+str2);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

}
