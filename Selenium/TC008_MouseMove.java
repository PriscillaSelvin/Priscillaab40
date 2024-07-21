package seleniumTopics;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TC008_MouseMove {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		
		BaseClass bc = new BaseClass();
		driver = bc.LaunchBrowser("Chrome");
		
		driver.get("https://jqueryui.com/droppable/");
		Actions actions =   new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("CLA")).click();  */
		
		//right click		
		//actions.contextClick(driver.findElement(By.linkText("Contribute"))).build().perform();
		//doubleclick
		
		actions.doubleClick(driver.findElement(By.linkText("Contribute"))).build().perform();
	    Thread.sleep(5000);
		driver.quit();
		
	}

}
