package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationTest();
		
	}
	
	@Test (enabled=false,alwaysRun = true)
	public static void ApplicationTest()
	{ 
	System.out.println("A is running"); 
	Assert.assertTrue(2 > 3); 
	System.out.println("B is running"); 
	}

}
