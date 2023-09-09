package iostreams;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login_Retesting {
	public WebDriver driver;
	public FileInputStream f;
	public Workbook w1;
	public Sheet s;
  @Test
  public void hmsLoginLogout() throws Exception {
	  f = new FileInputStream("D:\\selenium\\testdata\\login.xls");
	  w1 = Workbook.getWorkbook(f);
	  s = w1.getSheet("Sheet1");
	  for(int i =1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0,i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  try {
			  driver.findElement(By.linkText("Logout")).isDisplayed();
			  System.out.println("valid creds");
			  driver.findElement(By.linkText("Logout")).click();
		  }catch(Exception e) {
			  System.out.println("invalid credentials");
			  driver.switchTo().alert().accept();
		  }
		
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
