package CookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		
		
		System.out.println(driver.manage().getCookieNamed("session-id-time"));//prints specific cookie accordingly
		
		//add a new cookie to browser
		Cookie cobj = new Cookie("mycookie", "1234567890");
		driver.manage().addCookie(cobj);
		Set <Cookie> cookies = driver.manage().getCookies();//capture all the cookies from the browser
		System.out.println("Size of cookies "+cookies.size());//print size of cookies
		//System.out.println(cookies);

		for(Cookie cookie:cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());//prints name and value of cookies
		}
		//delete the cookie
		driver.manage().deleteCookie(cobj);
		driver.manage().deleteAllCookies();

	}

}
