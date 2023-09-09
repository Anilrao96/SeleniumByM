package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class HMSLoginLogoutXml {
	public WebDriver driver;
  @Parameters({"username","password"})
  @Test
  public void hmsLoginlout(String uname,String pwd) {
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Logout")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
  }

}
