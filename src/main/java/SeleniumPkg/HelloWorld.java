package SeleniumPkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {
	
	WebDriver driver;
	SoftAssert sa;
	ChromeOptions op;
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();//Chrome driver integrate
		op = new ChromeOptions();
		op.setHeadless(false);//set headless true or false
		driver = new ChromeDriver(op);
		sa=new SoftAssert();
		driver.get("https://www.demo.guru99.com/V4/");
		
		
	}
	
	@Test 
	public void login() { 
		//check credentials of site
		driver.findElement(By.name("uid")).sendKeys("mngr454880");
		driver.findElement(By.name("password")).sendKeys("ygyzequ");
		driver.findElement(By.name("btnLogin")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));//set wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Customer")));
		sa.assertEquals(((WebElement) driver.findElements(By.linkText("New Customer"))).getText(), "New Customer");
	} 

	@AfterTest
	public void tearDown() {
		
		driver.close();//close current tab
		driver.quit();//close browser
	}
	
	
}
