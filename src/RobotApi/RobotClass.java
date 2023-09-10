package RobotApi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=KO--8kpBIGo");
		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[33]/div[2]/div[1]/button")).click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

}
