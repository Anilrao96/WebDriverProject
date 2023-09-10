import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		List <WebElement> links = driver.findElements(By.tagName("li"));
		for(int i = 0;i<=links.size();i++) {
			
			System.out.println(links.get(i));
		}
		//System.out.println(links);
		
		//System.out.println(l);
		
		
		driver.close();
	}
	

}
