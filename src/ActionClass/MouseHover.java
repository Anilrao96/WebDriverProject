package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin-->User management-->Users
		Actions act = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement UserMgmt = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement Users = driver.findElement(By.xpath("//a[normalize-space()='Users']"));
		
		act.moveToElement(admin).build().perform();
		act.moveToElement(UserMgmt).build().perform();
		act.moveToElement(Users).click().build().perform();
		
		//act.moveToElement(admin).moveToElement(UserMgmt).moveToElement(Users).click().build().perform();
		

	}

}
