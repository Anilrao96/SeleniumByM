package iostreams;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class CreateExcelFile {
	public WebDriver w;
	public FileOutputStream f;
	public WritableWorkbook wb;
	public WritableSheet ws;
	
  @Test
  public void f() throws Exception {
	  f = new FileOutputStream("D:\\selenium\\testdata\\results.xls");
	  wb = Workbook.createWorkbook(f);
	  ws=wb.createSheet("results", 0);
	  Label un = new Label(0,0,"username");
	  Label pw = new Label(1,0,"password");
	  Label rs = new Label(2,0,"results");
	  ws.addCell(un);
	  ws.addCell(pw);
	  ws.addCell(rs);
	  wb.write();
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() {
  }

}
