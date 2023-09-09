package iostreams;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login_Results {
	public WebDriver driver;
	public FileInputStream f;
	public Workbook w;
	public Sheet s;
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	public String str;
  @Test
  public void f() throws Exception, IOException {
	  f = new FileInputStream("D:\\selenium\\testdata\\login.xls");
	  w = Workbook.getWorkbook(f);
	  s = w.getSheet("Sheet1");
	  
	  fo = new FileOutputStream("D:\\selenium\\testdata\\results.xls");
	  wb = Workbook.createWorkbook(fo);
	  ws=wb.createSheet("results", 0);
	  
	  for(int i =1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0,i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  try {
			  driver.findElement(By.linkText("Logout")).isDisplayed();
			  System.out.println("valid creds");
			  str = "PASS";
			  driver.findElement(By.linkText("Logout")).click();
		  }catch(Exception e) {
			  System.out.println("invalid credentials");
			  str = "FAIL";
			  driver.switchTo().alert().accept();
		  }
		  Label results = new Label(2,i,str);
		  ws.addCell(results);
		  }
	  wb.write();
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
