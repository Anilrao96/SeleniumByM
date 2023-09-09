package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseHover {
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  Actions a = new Actions(driver);
	  WebElement link = driver.findElement(By.linkText("FAQ'S"));
	  a.moveToElement(link).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Selenium FAQ's")).click();
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  Thread.sleep(3000);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
