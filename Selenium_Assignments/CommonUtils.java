package seleniumTopics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {

	public static void clickElement(WebElement ele, String Elementname)
	{
		ele.click();
		System.out.println("clicked on  " + Elementname);
	}
	public static void selectvalfromDD(WebElement ele,String valText )
	{
		// TODO Auto-generated method stub
       Select select = new Select(ele);
       select.selectByVisibleText(valText);
		
	}

	public static void selectvalfromDD(WebElement ele,int indexNo)
	{
		Select select = new Select(ele);
	    select.selectByIndex(indexNo);
	}
	
	public static void verifyValueinDD(WebElement ele,String checkVal)
	{
		boolean status = false;
		Select select = new Select(ele);
		List<WebElement> vals = select.getOptions();
		for (int i=0; i < vals.size(); i++)
		{
			String value = vals.get(i).getText();
			if (value.equals(checkVal))
			{
				status = true;
				System.out.println(checkVal);
				break;
			}
			else
			{
				status = false;
			}
		}
	}
}
