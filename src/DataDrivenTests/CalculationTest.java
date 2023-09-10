package DataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculationTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("D:\\selenium\\data3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
				XSSFRow row = sheet.getRow(i);
				
				//1st method
				//String var = row(0).getStringCellValue();
				
				//2nd method
				XSSFCell principlecell = row.getCell(0);
				int princ = (int)principlecell.getNumericCellValue();//type casting
				
				//or 
				//int princ = row.getCell(0).getNumericCellValue();//type casting				 
				XSSFCell roi = row.getCell(1);
				int rateofinterest= (int)roi.getNumericCellValue();
				
				XSSFCell period = row.getCell(2);
				int per = (int)period.getNumericCellValue();
				
				XSSFCell Frequency = row.getCell(3);
				String Freq = Frequency.getStringCellValue();
				
				XSSFCell MaturityValue = row.getCell(4);
				int Exp_mvalue = (int)MaturityValue.getNumericCellValue();
				
				driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
				driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
				driver.findElement(By.id("interest")).sendKeys(String.valueOf(per));
				
				Select periodcombo = new Select(driver.findElement(By.name("tenurePeriod")));
				periodcombo.selectByVisibleText("year(s)");
				
				Select frequency = new Select(driver.findElement(By.id("frequency")));
				frequency.selectByVisibleText(Freq);
				
				driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]")).click();
				
				String actvalue = driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
				
				if(Double.parseDouble((actvalue))==Exp_mvalue)
				{
					System.out.println("Test passed");
				}
				else {
					System.out.println("test failed");
				}
		}
	}

}
