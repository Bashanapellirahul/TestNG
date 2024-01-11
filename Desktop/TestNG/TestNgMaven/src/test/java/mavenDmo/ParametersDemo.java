package mavenDmo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
  @Parameters({"userName","Password"})
	@Test
  public void Login(String userName, String Password) {
	  
	  System.out.println("the userName is :"+userName);
	  System.out.println("the Password is :"+Password);
  }
}
