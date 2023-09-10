package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//className
		int sliders = driver.findElements(By.className("homeslider-container")).size();  // this classname is present for multiple web elements
		System.out.println(sliders);
		
		//tagname
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}

}
