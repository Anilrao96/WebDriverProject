package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		//self
		String text = driver.findElement(By.xpath("//a[contains(text(),'Zee Entertainment En')]/self::a")).getText();
		System.out.println(text);
		
		//parent
		text  = driver.findElement(By.xpath("//a[contains(text(),'Zee Entertainment En')]/parent::td")).getText();
		System.out.println(text);
		
		//Child-selects all children of the current node(one or many)
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements: "+childs.size());
		
		//Ancestor-selects all ancestors(parent,grandparent etc...)
		text = driver.findElement(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//Descendant-selects all descendants(children,grandchildren etc...) of the current node
		 List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes: "+descendants.size());
		
		
		//following - selects everything in the document after the closing tag of the current node
		List<WebElement> followingnodes = driver.findElements(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr/following::tr"));
		System.out.println("number of following nodes: "+followingnodes.size());
		
		//following-sibling: selects all siblings after the current node
		
		List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr/following-sibling::tr"));
		System.out.println("following siblings: "+followingsiblings.size());
		
		//preceding nodes-selects all the nodes that appear before the current node in the document
		List<WebElement> precedingnodes=driver.findElements(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr/preceding::tr"));
		System.out.println("preceding nodes: "+precedingnodes.size());
		driver.close();
		
		List<WebElement> precsibling = driver.findElements(By.xpath("//a[contains(text(),'Zee Entertainment En')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("preceding siblings: "+precsibling.size());
	}

}
