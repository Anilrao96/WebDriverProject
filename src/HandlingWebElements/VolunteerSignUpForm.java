package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignUpForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Name, City, Email and phone
		driver.get("https://fs29.formsite.com/q44asy/kukhzblnf8/index.html?1623404817841");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Ram");
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("ramaduguanil@gmail.com");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("9092716951");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("Hyderabad");
		
		WebElement drptime = driver.findElement(By.id("RESULT_RadioButton-5"));
		Select t = new Select(drptime);
		t.selectByIndex(2);//by Index
		//t.selectByIndex("Radio-2");
		//t.selectByVisibleText("Evening");
		
		System.out.println(t.getOptions().size());
		
		//radio button selection
		driver.findElement(By.id("RESULT_RadioButton-10_0")).isSelected();
		driver.findElement(By.id("RESULT_RadioButton-10_0")).click();
		
		//check boxes selection
		driver.findElement(By.id("RESULT_CheckBox-12_0")).click();
		driver.findElement(By.id("RESULT_CheckBox-12_6")).click();
		
		
		//bigger text box/area
		driver.findElement(By.id("RESULT_TextArea-14")).sendKeys("Testing");
		
		driver.findElement(By.id("FSubmit")).click();
	}

}
