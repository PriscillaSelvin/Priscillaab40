package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/registration");
		Thread.sleep(3000);
		WebElement upload = driver.findElement(By.xpath("//input[@id='file']"));
		upload.click();
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\pasel\\OneDrive\\Documents\\ebe.txt");

	}

}
