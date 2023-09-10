package WebDriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\software\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getWindowHandle());
		Set <String> s = driver.getWindowHandles();
		
		for(String i:s) {
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if(t.contains("Frames & windows")) {
				driver.close();
			}
		}

	}

}
