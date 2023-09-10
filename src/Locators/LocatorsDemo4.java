package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Absolute xpath
		//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-shirts");
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button	")).click();
		
		
		//Relative xpath
		//driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T shirts");
		//driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
		
		//xpath options
		//--OR
		//--AND
		//--CONTAINS()
		//--STARTS-WITH()
		//--TEXT()
		//--CHAINED XPATH
		
		
		
		//Xpath with OR 
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();
	
		//xpath with AND
		//driver.findElement(By.xpath("//input[@name='search_query' and @id='search_query_top']")).sendKeys("Shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
		
		//xpath with contains
		//driver.findElement(By.xpath("//input[contains(@id,'top')]")).sendKeys("Shirts");
		//driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();
		
		//xpath with starts with
		//driver.findElement(By.xpath("//input[starts-with(@id,'search')]")).sendKeys("Shirts");
		//driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		
		//xpath with text()
		//driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		
		//chained xpath
		driver.findElement(By.xpath("//form[@id='searchbox']/input[4]")).sendKeys("Shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
	}

}
