package DataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().accept();
		
		//getting data from excel sheet
		FileInputStream file = new FileInputStream("D:\\selenium\\data2.xlsx");
		//get the workbook instance for xls file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i =1;i<=row;i++)
		{
			XSSFRow current_row = sheet.getRow(i);
			//System.out.println(currentrow);
			
			String First_Name = current_row.getCell(0).getStringCellValue();
			String Last_Name = current_row.getCell(1).getStringCellValue();
			double Phone = current_row.getCell(2).getNumericCellValue();
			String Email = current_row.getCell(3).getStringCellValue();
			String Address = current_row.getCell(4).getStringCellValue();
			String City = current_row.getCell(5).getStringCellValue();
			String State = current_row.getCell(6).getStringCellValue();
			double PostalCode = current_row.getCell(7).getNumericCellValue();
			String Country = current_row.getCell(8).getStringCellValue();
			String UserName = current_row.getCell(9).getStringCellValue();
			String Password = current_row.getCell(10).getStringCellValue();
			
			//Registration Process
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Entering Contact information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(String.valueOf(Phone));
			driver.findElement(By.name("userName")).sendKeys(Email);// emailid
			
			//Entering Mailing information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(PostalCode));
			
			//Country selection
			Select dropcountry = new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			//Entering User information
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//submitting form
			driver.findElement(By.name("submit")).click();
			
			if(driver.getPageSource().contains("Thank you for registering")) {
				
				System.out.println("Registration completed for "+row+" record");
			}
			else {
				System.out.println("Registration Failed for "+row+" record");
				//driver.close()
			}
			
		}
		System.out.println(" Data driven test completed");
		driver.close();
		driver.quit();
	}

}
