package Assignments;

 
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignments6 {

	public static void main(String[] args) throws InterruptedException
	{
		 InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("https://www.amazon.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();

	}

}
