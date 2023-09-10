package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Tag & ID
		//driver.findElement(By.cssSelector("input#email")).sendKeys("David");
		//driver.findElement(By.cssSelector("#email")).sendKeys("David"); //input name is optional in this
		
		//Tag & class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("John");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("John");
		
		//Tag and Attribute
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("John");
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("John");
		
		//Tag, class and attribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("John");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("John");
		
	}

}
