package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JqueryToolTip {
	public static WebDriver driver;
  @Test
  public void f() {
	  List <WebElement> frames = driver.findElements(By.tagName("iframe"));
	  System.out.println("No of frames available: "+frames.size());
	  driver.switchTo().frame(0);
	  //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-free']")));
	  String str1 = driver.findElement(By.linkText("Tooltips")).getAttribute("title");
	  System.out.println(str1);
	  String str2 = driver.findElement(By.linkText("ThemeRoller")).getAttribute("title");
	  System.out.println(str2);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip/");
	  driver.manage().window().maximize();
  }

}
