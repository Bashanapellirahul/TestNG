package mavenDmo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyingGoogleTitle {
  @Test
	public void verifytitle() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		String expectedTitle = "Google";
		
		String actualtitle = driver.getTitle();
		
		System.out.println("actual title is :"+actualtitle);
		
		AssertJUnit.assertEquals(actualtitle, expectedTitle);
		
	}
	
  
		
  
}
