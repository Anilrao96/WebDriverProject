import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://demo.nopcommerce.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
