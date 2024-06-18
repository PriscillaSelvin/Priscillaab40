package Assignments;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignments8 {

	public static void main(String[] args) throws InterruptedException
	{
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();

	}

}
