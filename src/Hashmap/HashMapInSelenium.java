package Hashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	static HashMap<String,String> logindata(){
		HashMap <String,String> hm= new HashMap<String,String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury@mercury");
		hm.put("z","mercury@mercury");
		return hm;
	}
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		//login as x
		String credentials = logindata().get("x");
		String arr[]= credentials.split("@");
		
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		
		driver.findElement(By.name("submit")).click();
		//validation
		if(driver.getTitle().equals("Find a Flight:Mercury Tours:")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.findElement(By.linkText("Home")).click();;
	}

}
