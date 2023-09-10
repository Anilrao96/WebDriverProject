package AuthenticationPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
	}

}
