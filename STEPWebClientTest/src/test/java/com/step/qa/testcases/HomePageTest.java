package com.step.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.step.qa.base.TestBase;
import com.step.qa.pages.HomePage;
import com.step.qa.pages.LoginPage;
import com.step.qa.pages.SettingsPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	SettingsPage settingsPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		settingsPage = new SettingsPage();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("pin"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String HomePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(HomePageTitle, "STEP | Online English Course, English Learning App", "Home page tiitle not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTextTest() {
		String UserNameText = homePage.verifyUserNameText();
		Assert.assertEquals(UserNameText, "Hello, priyanga");
	}
	
	@Test(priority=3)
	public void verifySettingslinktest() throws InterruptedException {
		Thread.sleep(5000);
		settingsPage = homePage.clickOnSettings();
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}

}


