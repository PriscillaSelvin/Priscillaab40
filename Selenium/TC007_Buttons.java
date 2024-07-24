package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC007_Buttons
{
      public static WebDriver driver = null;
      
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		BaseClass bc = new BaseClass();
		driver = bc.LaunchBrowser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		// searchField.clear();

		Thread.sleep(5000);

		driver.quit();
		// driver.close();
	}

}
 
