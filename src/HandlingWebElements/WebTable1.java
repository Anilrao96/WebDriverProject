//Test case
//1)Open URL: https://opensource-demo.orangehrmlive.com/
//2)Login(Admin/admin)
//3)Admin-->User management-->users

//count the employees whose status is enabled

package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		int rowcount = driver.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		//System.out.println(rowcount);
		int statuscount =0;
		for (int i =1;i<=rowcount;i++) {
			String status = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();
			
			if(status.equals("Enabled")) {
				statuscount=statuscount+1;
			}
		}
		System.out.println("No of employees enabled "+statuscount);
		driver.close();
		
	}

}
