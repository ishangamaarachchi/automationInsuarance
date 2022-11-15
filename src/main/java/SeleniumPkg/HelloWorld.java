package SeleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		//Chrome driver integrate
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	
		
	}
	
	@Test 
	public void login() {
		
		
	} 

	@AfterTest
	public void tearDown() {
		
		
	}
	
	
}
