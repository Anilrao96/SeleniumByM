package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Googlelanguages {
	public WebDriver driver;
 
  public void clickLinks(String str) {
	  driver.findElement(By.xpath(str)).click();
	  driver.findElement(By.linkText("English")).click();
  }
  @Test
  public void googleLinks() {
	  clickLinks("//div[@id='SIvCob']/a[1]");// Hindi
	  clickLinks("//div[@id='SIvCob']/a[2]");// Bengali
	  clickLinks("//div[@id='SIvCob']/a[3]");// Telugu
	  clickLinks("//div[@id='SIvCob']/a[4]");// Marathi
	 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
  }

}
