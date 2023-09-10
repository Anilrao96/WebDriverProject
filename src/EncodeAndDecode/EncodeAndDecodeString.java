package EncodeAndDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodeAndDecodeString {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/login");
		
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavanoltraining2gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodedString("dGVzdDEyMw=="));
		//driver.findElement(By.linkText("Login")).click();
	}
	static String decodedString(String password) {
		byte[] decodeString = Base64.decodeBase64(password);
		return(new String(decodeString));
	}

}
