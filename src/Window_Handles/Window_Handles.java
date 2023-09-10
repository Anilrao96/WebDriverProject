package Window_Handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		Set st = driver.getWindowHandles();
		
		Iterator it = st.iterator();
		String mainWindow = (String) it.next();
		
	}

}
