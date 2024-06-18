package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass_Prgm {

	public static void main(String[] args) 
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 WebElement category_dd = driver.findElement(By.id("searchDropdownBox"));
		 Select s1 = new Select(category_dd);
		 s1.deselectByIndex(0);

	}

}
