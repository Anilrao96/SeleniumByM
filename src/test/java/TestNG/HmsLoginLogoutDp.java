package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HmsLoginLogoutDp {
	public WebDriver driver;
  @Test(dataProvider = "Authentication")
  public void hmsLoginLogout(String uname, String pwd) {
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }

  @DataProvider(name="Authentication")
  public Object[][] credentials() {
    return new Object[][] {
      { "admin", "admin" },{ "mahesh", "mahesh" },{"ram","ram"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
  }

}
