package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("//input[@id='input']")).sendKeys("Testing"); no such element exception
		
		WebElement root = driver.findElement(By.tagName("app-header")); //shadow host
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowDom1 =(WebElement)js.executeScript("return arguments[0].shadowRoot", root);
		
		WebElement appheader = shadowDom1.findElement(By.tagName("app-header"));
		WebElement apptoolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement bookinputdecarotor=apptoolbar.findElement(By.tagName("book-input-decorator"));
		
		bookinputdecarotor.findElement(By.cssSelector("input#input")).sendKeys("Testing");
	
	}

}
