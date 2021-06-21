package com.step.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.step.qa.base.TestBase;
import com.step.qa.pages.HomePage;
import com.step.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "STEP | Online English Course, English Learning App");
	}
	
	@Test(priority=2)
	public void stepLogoImageTest() {
			boolean flag = loginPage.validatesteplogo();
			Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void EmptyLoginTest() {
		String EmptyMessage = loginPage.ValidateEmptylogin();
		Assert.assertEquals(EmptyMessage, "Please enter a valid email or mobile number");
	}
	
	@Test(priority=4)
	public void IncorrectEmailidTest() {
		String EmailidMessage = loginPage.ValidateIncorrectEmailid();
		Assert.assertEquals(EmailidMessage, "Please enter a valid email");
	}
	
	@Test(priority=5)
	public void IncorrectPinTest() {
		String PinMessage = loginPage.ValidateIncorrectPin();
		Assert.assertEquals(PinMessage, "Sorry, the PIN you entered is invalid. Click on Forgot PIN to receive the correct PIN.");
	}
	
	@Test(priority=6)
	public void loginTest() {
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("pin"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}

}
