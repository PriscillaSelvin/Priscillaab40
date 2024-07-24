package Assignments;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException 
	{
		SafariDriver driver = new SafariDriver();
		 driver.get("https://www.amazon.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();

	}
	

}
