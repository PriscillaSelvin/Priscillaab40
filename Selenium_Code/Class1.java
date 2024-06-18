package Package2.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		  FileInputStream f1 = new FileInputStream("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\Datasheet\\PriscillaSheet.xlsx");
          Workbook w1 = WorkbookFactory.create(f1);
          Sheet s1 = w1.getSheet("LoginDetails");
          Row r1 = s1.getRow(4);
          Cell c1 = r1.getCell(1);
          String Cname = c1.getStringCellValue();
          System.out.println(Cname);
          ChromeDriver driver = new ChromeDriver();
 		 
          driver.get("https://www.google.com");
          driver.manage().window().maximize();
          
	}

}
