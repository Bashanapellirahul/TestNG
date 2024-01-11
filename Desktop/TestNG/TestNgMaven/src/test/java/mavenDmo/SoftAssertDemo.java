package mavenDmo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	
	SoftAssert softassert = new SoftAssert();
  @Test
  public void SoftAsserts() {
	  System.out.println("test case one is started");
	  
	  AssertJUnit.assertEquals("hello", "hello");
	  
	  System.out.println("soft assert success");
	  
	  AssertJUnit.assertTrue("Hello".equals("hello"));
	  
	  System.out.println("soft assert fail");
	  
	  softassert.assertAll(); //thhis method will fail the test case in softassertion
	  
	  System.out.println("test case one  ended");

	  
	  
	  
  }
}
