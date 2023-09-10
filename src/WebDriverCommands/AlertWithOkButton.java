package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//alert with ok link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//alert with ok button link
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		
		//switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//Ok button clicked and close the alert

	}

}
