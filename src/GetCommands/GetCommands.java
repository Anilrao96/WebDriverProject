package GetCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");//opens the url
		
		System.out.println(driver.getTitle());//returns the title of the page
		System.out.println(driver.getCurrentUrl());//returns the url of the page
		String text = driver.findElement(By.xpath("//b[normalize-space()='Jul 6, 2017']")).getText();
		System.out.println(text);
		
		driver.close();//close current window
		
		driver.quit();//closes multiple windows
		
	}

}
