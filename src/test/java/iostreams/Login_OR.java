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

public class Login_OR {
	public WebDriver driver;
	public Workbook w;
	public Sheet s1,s2;
  @Test
  public void hmsLogin() throws Exception {
	  FileInputStream f = new FileInputStream("D:\\selenium\\testdata\\loginOR.xls");
	   w = Workbook.getWorkbook(f);
	  s1 = w.getSheet("Sheet1");
//	  System.out.println(s1.getCell(0, 0).getContents());
//	  System.out.println(s1.getCell(0, 1).getContents());
	  //System.out.println(s1.getCell(3, 1).getContents());
	  driver.findElement(By.name(s1.getCell(0,0).getContents())).sendKeys("admin");
	  driver.findElement(By.name(s1.getCell(1,0).getContents())).sendKeys("admin");
	  driver.findElement(By.name(s1.getCell(2,1).getContents())).click();
  }
  @Test
  public void hmsLogout() {
	  s2=w.getSheet("Sheet2");
	  driver.findElement(By.linkText(s2.getCell(0,1).getContents())).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
