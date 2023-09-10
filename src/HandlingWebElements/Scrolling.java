package HandlingWebElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.scrolling by using pixel
		//js.executeScript("window.scrollBy(0,1000)","");
		
		//2.scrolling page till we find element
		//WebElement flag = driver.findElement(By.xpath("//*[@id="content"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]")
		//js.executeScript("arguments[0].scrollIntoView();",flag);
		
		//3.Scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
