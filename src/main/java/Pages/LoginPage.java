package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By userTitle= By.id("user_title");
	
	
	public  LoginPage(WebDriver driver) {//overloaded constructor
		this.driver=driver;
	}
	
	 public void setUserTitle(String strUserTitle){

	        driver.findElement(userTitle).sendKeys(strUserTitle);

	    }
	 public void loginToGuru99(String strUserTitle){

	        //Fill user name

	        this.setUserTitle(strUserTitle);

	        //Fill password

	        //this.setPassword(strPasword);

	        //Click Login button

	        //this.clickLogin();        
	    }
	 
}
