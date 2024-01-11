package mavenDmo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProveider {
	
	//@DataProvider annotation helps us write data-driven test cases. 
	//The @DataProvider annotation enables us to run a test method multiple times by passing different data-sets.
	
	//In simple words, if we want to run the same test case for multiple sets of test data we will use the dataPrvider annotation
	//In this class we used 3different sets of test data which is stored in the form of an array. 
	
  @Test(dataProvider="getData")
  public void setData(String username, String password) {
	  
	  System.out.println("you have provided user name as: "+username);
	  System.out.println("you have provided password as: "+password);
  }
  
  @DataProvider
  public Object[][] getData(){
	  
	  Object[][] data =new Object[3][2];
	  
	  data[0][0] = "test1";
	  data[0][1] = "test@123";
	  
	  data[1][0] = "test2";
	  data[1][1] = "test@1234";
	  
	  data[2][0] = "test3";
	  data[2][1] = "test@12345";
	  
	  
	  
	return data ;
	  
  }
}
