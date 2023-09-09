package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ValidationCommands {
	public WebDriver driver;
  @Test
  public void validationCommands() {
	  if(driver.findElement(By.name("username")).isEnabled()) {
		  System.out.println("username is enabled");
		  driver.findElement(By.name("username")).sendKeys("Mahesh");
		  }
	  else {
		  System.out.println("username is disabled");
	  }
	  if(driver.findElement(By.name("reset")).isDisplayed()) {
		  System.out.println("reset button is displayed");
		  driver.findElement(By.name("reset")).click();
	  }
	  else {
		  System.out.println("reset button is not displayed");
	  }
	  driver.get("http://spicejet.com");
	  if(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-zso239']")).isSelected()) {
		  System.out.println("one wY Radio button is selected");
		  
	  }
	  else {
		  System.out.println("one way button is not selected");
	  }
	  }
	  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
