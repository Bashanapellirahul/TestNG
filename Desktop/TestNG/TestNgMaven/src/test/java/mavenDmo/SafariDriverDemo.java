package mavenDmo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SafariDriverDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeClass() {
		driver= new SafariDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
  @Test
  public void safaridriverLaunch() throws InterruptedException {
	  
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  
  }
  @Test
  public void youtube() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.get("https://www.youtube.com/");
  }
  
  @AfterTest
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }
}
