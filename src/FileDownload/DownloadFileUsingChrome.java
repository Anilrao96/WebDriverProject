package FileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		//driver.quit();
		driver.findElement(By.id("pdfbox")).sendKeys("pdf version");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		

	}

}
