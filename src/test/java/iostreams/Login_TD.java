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

public class Login_TD {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  FileInputStream f = new FileInputStream("D:\\selenium\\testdata\\login.xls");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("Sheet1");
	  driver.findElement(By.name("username")).sendKeys(s.getCell(0,1).getContents());
	  driver.findElement(By.name("password")).sendKeys(s.getCell(1,1).getContents());
	  driver.findElement(By.name("submit")).click();
	  System.out.println(s.getCell(0, 0).getContents());
//	  System.out.println(s.getCell(0, 1).getContents());
//	  System.out.println(s.getCell(1, 0).getContents());
//	  System.out.println(s.getCell(1, 1).getContents());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
