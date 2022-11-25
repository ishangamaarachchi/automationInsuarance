package TestClasses;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
    LoginPage objLogin;

    @BeforeTest
    public void setup() throws FileNotFoundException, IOException{

    	WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
           
    }
    
    @Test
    public void loginToGuru() {
    	objLogin = new LoginPage(driver);
    	objLogin.loginToGuru99("mgr123");
    }
}
