package SeleniumPkg;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.support.ui.Select;
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
	Select dropDownNameTitle;
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();//Chrome driver integrate
		op = new ChromeOptions();
		op.setHeadless(false);//set headless true or false
		driver = new ChromeDriver(op);
		sa=new SoftAssert();
		//dropDownNameTitle = new Select(driver.findElement(By.id("user_title")));
		
		//driver.get("https://www.demo.guru99.com/V4/");
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		
	}
	
	@Test 
	public void login() { 
		//check credentials of site
		//driver.findElement(By.name("uid")).sendKeys("mngr454880");
		//driver.findElement(By.name("password")).sendKeys("ygyzequ");
		
		//driver.findElement(By.name("btnLogin")).click();
		//driver.findElement(By.name("password")).submit();//this code use as submit(enter) a form
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));//set wait
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Customer")));
		//sa.assertEquals(((WebElement) driver.findElements(By.linkText("New Customer"))).getText(), "New Customer");
		
		
		//sa.assertTrue(driver.getCurrentUrl().contains("aaa"));
		//sa.assertTrue(driver.getPageSource().contains("dddd"));
		
		/*ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));*/
	    
	    //sa.assertEquals(driver.findElement(By.name("uid")).getAttribute("maxlength"), "10"); 
	    
	    //dropDownNameTitle.selectByIndex(2);
	    
	    //driver.switchTo().alert().accept();//ok button click on js alert box
	    //driver.switchTo().alert().dismiss();//cancel button click on js alert box
		
		driver.findElement(By.linkText("Register")).click();//click google link
		Select selectByValueTitle = new Select(driver.findElement(By.id("user_title")));
		Select selectByValueYear = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		Select selectByValueMonth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		Select selectByValueDate = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		Select selectByValueLicence = new Select(driver.findElement(By.id("user_licenceperiod")));
		Select selectByValueOcupation = new Select(driver.findElement(By.id("user_occupation_id")));
		//selectByValue.selectByValue("greenvalue");
		//selectByValue.selectByVisibleText("Red");
		selectByValueTitle.selectByIndex(0);
	    
	    driver.findElement(By.id("user_firstname")).sendKeys("Ishan");
	    driver.findElement(By.id("user_surname")).sendKeys("Gamaarachchi");
	    driver.findElement(By.id("user_phone")).sendKeys("0741198262");
	    selectByValueYear.selectByVisibleText("1989");
	    selectByValueMonth.selectByVisibleText("April");
	    selectByValueDate.selectByVisibleText("23");
	    
	    driver.findElement(By.id("licencetype_f")).click();
	    selectByValueLicence.selectByVisibleText("2");
	    selectByValueOcupation.selectByVisibleText("Student");
	    
	    driver.findElement(By.id("user_address_attributes_street")).sendKeys("Habarana");
	    driver.findElement(By.id("user_address_attributes_city")).sendKeys("Dambulla");
	    driver.findElement(By.id("user_address_attributes_county")).sendKeys("Sri Lanka");
	    driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("50150");
	    driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("ishangamaarachchi@gmail.com");
	    driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("123");
	    driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("123");
	    
	    driver.findElement(By.name("submit")).click();
	    
	    driver.findElement(By.id("email")).sendKeys("ishangamaarachchi@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123");
	    
	    driver.findElement(By.name("submit")).click();
	    //sa.assertEquals(((WebElement) driver.findElements(By.linkText("Broker Insurance WebPage"))).getText(),"Broker Insurance WebPage");
	} 

	@AfterTest
	public void tearDown() {
		
		driver.close();//close current tab
		driver.quit();//close browser
	}
	
	
}
