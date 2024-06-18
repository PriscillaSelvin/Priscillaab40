package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC009_Checkbox {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		BaseClass bc = new BaseClass();
		driver = bc.LaunchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//label[@for = \"radio-1\"]")).click();
		CommonUtils.clickElement(driver.findElement(By.xpath("//label[@for = \"radio-1\"]")),"NewYork");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
