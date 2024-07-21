package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement login = driver.findElement(By.tagName("button"));
	 
		boolean b1 = login.isDisplayed();
		boolean b2 = login.isEnabled();
		if (b1 && b2)
		{
			login.click();
		}
	}

}
