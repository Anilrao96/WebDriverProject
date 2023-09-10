package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test()
	void loginByEmail(){
		System.out.println("Login By Email");
		Assert.assertEquals("f","f");//true
		
	}
	@Test
	void loginByFacebook() {
		System.out.println("Login by facebook");
		Assert.assertEquals("Ram", "ram");//false
	}

}
