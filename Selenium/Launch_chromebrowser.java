package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chromebrowser {

	public static void main(String[] args) throws InterruptedException
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();

	}

}
