package DropDownTests;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Element = driver.findElement(By.id("animals"));
		Select se = new Select(Element);
		
		List originalList=new List();
		
		for(WebElement e:se.getOptions()) {
			originalList.add(e.getText());
		}
		
//		List tempList=originalList;
//		Collections.sort(tempList);
//		Assert.assertEquals(tempList,originalList);
		
	}

}
