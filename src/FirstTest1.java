/*Test case
 * 1)Open a browser
 * 2)Open URL(http://newtours.demoaut.com/)
 * 3)Enter user name(find address using method)
 * 4)Enter password
 * 5)Click on ok
 * 6)Check the page title 
 */

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();//invoke the browser
		driver.get("http://demo.guru99.com/test/newtours/");
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		
		WebElement username =driver.findElement(By.name("userName"));
		username.sendKeys("mercury");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement submit  = driver.findElement(By.name("submit"));
		submit.click();
		
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		String exptitle = "Login: Mercury Tours";
				
		if(Actualtitle == exptitle)
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		driver.quit();
		
		
	}

}
