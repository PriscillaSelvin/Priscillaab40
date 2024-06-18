package Assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException 
	{
		 EdgeDriver driver = new EdgeDriver();
		 driver.get("https://www.flipkart.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();

	}

}
