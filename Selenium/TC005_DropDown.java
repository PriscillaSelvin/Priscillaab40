package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC005_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement monthdd = driver.findElement(By.name("birthday_month"));
		WebElement daydd = driver.findElement(By.name("birthday_day"));
		WebElement yeardd = driver.findElement(By.name("birthday_year"));
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Create new account")).click();
		/*Select month = new Select(monthdd);
		month.selectByVisibleText("May");
		Select day = new Select(daydd);
		day.selectByIndex(10);
		Select year = new Select(yeardd);
		year.selectByValue("2017");*/
		
		CommonUtils.selectvalfromDD(monthdd, "Jan");
		CommonUtils.selectvalfromDD(yeardd, 3);
		CommonUtils.verifyValueinDD(monthdd,"Dec");
		
		Thread.sleep(5000);
		driver.quit();
		
		//driver.findElement(By.name("birthday_month")).sendKeys("aug");
	}

}
