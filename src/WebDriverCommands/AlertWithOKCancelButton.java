package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKCancelButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//alert with ok cancel button link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		//alert with ok cancel button
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		String ExpTextOk = "You pressed Ok";
		//String ExpTextCancel = "You Pressed Cancel";
		driver.switchTo().alert().accept();
		
		String ActText = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		if(ExpTextOk.equals(ActText)==true) {
			System.out.println("test case is passed");
		}
//		String ExpTextCancel = "You Pressed Cancel";
//		driver.switchTo().alert().dismiss();
//		ActText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).click();
//		if(ExpTextCancel.equals(ActText)==true) {
//			System.out.println("test is passed");
//		}
		
		
		
		
	}

}
