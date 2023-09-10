package FilUpload_Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		Screen s = new Screen();
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		
		String imagesFilepath = "D:\\selenium";
		String inputFilePath = "D:\\selenium";
		Screen s1 = new Screen();
		
		Pattern fileInputTextbox = new Pattern(imagesFilepath+"filepath.PNG");
		Pattern openButton = new Pattern(inputFilePath+"openbutton.PNG");
		
		Thread.sleep(5000);
		s1.wait(fileInputTextbox,20);
		s1.type(fileInputTextbox,inputFilePath+"apple.jpg");
		s.click(openButton);
	}

}
