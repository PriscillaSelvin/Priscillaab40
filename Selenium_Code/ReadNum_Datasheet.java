package Package2.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ReadNum_Datasheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\Datasheet\\PriscillaSheet.xlsx");

		Workbook w1= WorkbookFactory.create(f1);
		// String username= w1.getSheet("Amazon_cred").getRow(2).getCell(0).getStringCellValue();
		String password= w1.getSheet("LoginDetails").getRow(2).getCell(1).getStringCellValue();

		String username= NumberToTextConverter.toText(w1.getSheet("LoginDetails").getRow(2).getCell(0).getNumericCellValue());

		System.out.println(username);
		System.out.println(password);
	}

}
