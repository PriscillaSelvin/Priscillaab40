package Package2.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\Datasheet\\PriscillaSheet.xlsx");
        Workbook w1 = WorkbookFactory.create(f1);
        String c1 = w1.getSheet("LoginDetails").getRow(4).getCell(1).getStringCellValue();
        System.out.println(c1);
	}
}
