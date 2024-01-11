package mavenDmo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadDemo {

	@Test(priority=1)
  public void LaunchGoogle() {
		
	 System.out.println("test case one with thread id :"+Thread.currentThread().getId());
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
	}

	@Test(priority = 2)
	public void LaunchTutorialsNinja() {
		System.out.println("test case two with thread id :" + Thread.currentThread().getId());
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

	}

	@Test(priority = 3)
	public void LaunchJavaTpoint() {
		System.out.println("test case three with thread id :"+Thread.currentThread().getId());
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.javatpoint.com/testng-annotations");

	}

}
