package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//: launch amazon india from the category dropdown select books
//type world war and click on search button
public class Amazon_SelectClass

{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search_category = driver.findElement(By.id("searchDropdownBox"));
		Select sel_category = new Select(search_category);
		sel_category.selectByVisibleText("Books");
		Thread.sleep(3000);
		driver.findElement(By.name("field-keywords")).sendKeys("world War");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(7000);
        driver.close();
	}

}
