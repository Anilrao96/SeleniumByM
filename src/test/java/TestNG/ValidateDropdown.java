package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ValidateDropdown {
  public static WebDriver driver;
  @Test
  public void f() {
	  List <WebElement> ddvalues = new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	  System.out.println(ddvalues.size());
	  for(int i = 1;i<ddvalues.size();i++) {
		  System.out.println(ddvalues.get(i).getText());
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/HMS/");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.get("http://www.seleniumbymahesh.com/HMS/perminent_registraion.php");
	  driver.manage().window().maximize();
  }

}
