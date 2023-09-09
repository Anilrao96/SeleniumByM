package iostreams;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ReadDataFromExcel {
	
	
	@Test
	public void f() {
		
	}
	
  @BeforeTest
  public void beforeTest() throws IOException, Exception {
	  
	  FileInputStream f = new FileInputStream("D:\\selenium\\testdata\\login.xls");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("Sheet1");
	  System.out.println(s.getCell(0, 0).getContents());
//	  System.out.println(s.getCell(0, 1).getContents());
//	  System.out.println(s.getCell(1, 0).getContents());
//	  System.out.println(s.getCell(1, 1).getContents());
  }
  

}
