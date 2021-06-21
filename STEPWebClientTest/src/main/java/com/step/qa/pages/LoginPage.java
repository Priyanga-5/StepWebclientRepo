package com.step.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(name="txtLoginId")
	WebElement username; 
	
	@FindBy(name="txtPin")
	WebElement pin;
	
	@FindBy(id="loginBtn")
	WebElement Login;
	
	@FindBy(className="login-theader")
	WebElement steplogo;
	
	@FindBy(xpath="//*[@class=\"alert alert-danger\"]")
	WebElement ErrorMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validatesteplogo() {
		return steplogo.isDisplayed();
	}
	
	public String ValidateEmptylogin(){
		Login.click();
		String EmptyLogin;
		return EmptyLogin = ErrorMessage.getText();
		
		}
	
     public String ValidateIncorrectEmailid() {
    	username.sendKeys("steptesterstage@gmail");
 		pin.sendKeys("153202");
 		Login.click();
 		String IncorrectEmail;
 		return IncorrectEmail = ErrorMessage.getText();
    	 
     }
     
     public String ValidateIncorrectPin() {
    	username.sendKeys("steptesterstage@gmail.com");
 		pin.sendKeys("1532");
 		Login.click();
 		String IncorrectPin;
 		return IncorrectPin = ErrorMessage.getText();
    	 
     }
	
     public HomePage Login(String un, String pwd) {
    	username.sendKeys(un);
 		pin.sendKeys(pwd);
 		Login.click();
 		return new HomePage();
    	 
     }

	
	
	




}
