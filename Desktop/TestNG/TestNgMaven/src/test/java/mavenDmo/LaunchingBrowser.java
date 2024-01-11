package mavenDmo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {

	
	WebDriver driver; // created a global variable for webdriver

	//@org.testng.annotations.BeforeClass
	
	@BeforeTest
	public void beforeClass() {

		System.out.println("starting browser before opening all the methods in this classs");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void tc1_launchGooglepage() {

		driver.get("https://www.google.com/");

	}

	@Test
	public void tc2_launchlinkedinpage() throws InterruptedException {

		Thread.sleep(2000);
		driver.get("https://www.linkedin.com/feed/");

	}

	@Test
	public void tc3_launchlinkedinpage() {

		System.out.println("selenium code for test case#3");

		int a = 10 / 0;

	}

	//@AfterClass
	@AfterTest
	public void afterClass() throws InterruptedException {

		System.out.println("Closing the browser after opening all the methods in this class");
		Thread.sleep(2000);
		driver.close();

	}
}
