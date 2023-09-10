package GetCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.popuptest.com/popuptest2.html");
		//driver.close();//closes only one window
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		
		driver.quit();

	}

}
