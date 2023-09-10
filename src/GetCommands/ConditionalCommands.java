package GetCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("ram@gmail.com");
		}
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("abc");
		}
		driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='u_f_2_TG']")).isSelected());

	}

}

