package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).click();
		Runtime.getRuntime().exec("C:\\autoitfiles\\fileupload.exe"+" "+"D:\\selenium\\apple.PNG");
	}

}
