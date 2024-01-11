package mavenDmo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependsOnMethod {
  
  @Test
	public void methodOne() {
	System.out.println("Helloo.. Im in method adding numbers");
	}

	@Test
	public void MethodTwo() {
	System.out.println("Helloo.. Im in method divided by zero");
	int e = 1 / 0;
	}

	@Test(dependsOnMethods="MethodTwo")
	public void methodThree() {
	System.out.println("Helloo.. Im in method skip");
	}
}


///here we use the "dependsOnMethods" to skip any method which is depended on another method. So here we used depednsOnMethods in methodThree which is skipped based on the execution of methodtwo