package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement( By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().sendKeys("automation testing");
		driver.switchTo().alert().accept();
		
		String ActText = "Hello Automation Testing user How are you today";
		
		String ExpTest = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/p")).getText();
		if(ExpTest.equals(ActText)==true) {
			System.out.println("test is passed");
		}

	}

}
