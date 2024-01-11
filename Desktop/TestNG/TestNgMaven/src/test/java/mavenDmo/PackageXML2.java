package mavenDmo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PackageXML2 {
	@Test(groups="smoke")
	  public void testMethod_3() {
		  
		  System.out.println("this is a testmethod_3");
	  }
	 
	@Test(groups="sanity")
	
	  public void testMethod_4() {
		  
		  System.out.println("this is a testmethod_4");
	  }
	@Test(priority=1)
	public void testMethod_5() {
		  
		  System.out.println("this is a testmethod_5");
	  }
	
}
