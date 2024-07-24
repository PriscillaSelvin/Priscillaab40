package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver = null;
	
	
	public WebDriver LaunchBrowser(String Browname)
	{
		 if (Browname == "Chrome")
		 {
			  driver = new ChromeDriver();
			 
		 }
		 
		 else if (Browname == "Edge")
		 {
			 driver = new EdgeDriver();
		 }
		 else
			 System.out.println("Pass arguments Chrome / Edge");
		     driver.manage().window().maximize();
		     return driver;
		 
	}
}
