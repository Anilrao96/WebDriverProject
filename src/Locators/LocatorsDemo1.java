package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//id and name locators
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		searchBox.sendKeys("T-shirts");
		
		driver.findElement(By.name("submit_search")).click();
		
		
		//link test
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
		// class and tagname are used to find more than one element
	}

}
