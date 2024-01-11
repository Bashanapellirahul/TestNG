package mavenDmo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//This is maven project

public class TutorialsNinja {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options= new ChromeOptions();
//		options.addArguments("--incognito");///because of cache/cookie related issues
//		options.addArguments("--headless");
//        options.addArguments("--remote-allow-origins=*");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver() ;
        
        driver.get("https://www.google.com/webhp?authuser=1");
		
		driver.navigate().to("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));		//asking the browser to wait until it load
		
		Thread.sleep(2000);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		Thread.sleep(2000);
		WebElement firstNamefield= driver.findElement(By.xpath("//input[@id='input-firstname']"));
		firstNamefield.sendKeys("Rahul");
        
		Thread.sleep(2000);
		WebElement lastNamefield= driver.findElement(By.xpath("//input[@id='input-lastname']"));
		lastNamefield.sendKeys("Bashanapelli");
		
		Thread.sleep(2000);
        WebElement emailField= driver.findElement(By.xpath("//input[@id='input-email']"));
        emailField.sendKeys("rahulbashanapelly@gmail.com");
		
        Thread.sleep(2000);
        WebElement telephone= driver.findElement(By.xpath("//input[@id='input-telephone']"));
        telephone.sendKeys("2016651158");
        
        Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("//input[@id='input-password']"));
        password.sendKeys("Rahul@123");
        
        Thread.sleep(2000);
        WebElement passwordconfirm= driver.findElement(By.id("input-confirm"));
        passwordconfirm.sendKeys("Rahul@123");
        
        Thread.sleep(2000);
		WebElement agreecheckbox = driver.findElement(By.xpath("//input[@name='agree']"));
		agreecheckbox.click();
        
        Thread.sleep(2000);
		WebElement continuebutton= driver.findElement(By.xpath("//input[@value='Continue']"));
		continuebutton.click();
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
