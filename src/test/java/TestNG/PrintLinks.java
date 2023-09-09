package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PrintLinks {
	public static WebDriver driver;
  @Test
  public void f() throws Exception {
	  List <WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("tool links available "+links.size());
	  int count = 0;
	  for(int i =0;i<links.size();i++) {
		  if(!links.get(i).getText().isEmpty()) { 
		  System.out.println(links.get(i).getText());
		  Thread.sleep(1000);
		  count++;
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip/");
	  driver.manage().window().maximize();
  }

}
