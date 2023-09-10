package HandlingWebElements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		//capture links from a webpage
		List <WebElement> links = driver.findElements(By.linkText("a"));
		
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			//by using href attribute we can getURL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			//CREATE A CONNECTION USING URL OBJECT 'LINK'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		
			//Wait time 2 seconds
			Thread.sleep(2000);
			//establish connection
			httpConn.connect();
			
			int rescode = httpConn.getResponseCode();//return response if res code is above 400:broken links
			if(rescode>=200) {
				System.out.println(url+" - "+"is broken link");
			}
			else {
				System.out.println(url+" - "+"is valid link");
			}
		}
	}

}
