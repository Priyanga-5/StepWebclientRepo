package com.step.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.step.qa.base.TestBase;
import com.step.qa.pages.HomePage;
import com.step.qa.pages.LoginPage;
import com.step.qa.pages.PersonalInformationPage;
import com.step.qa.pages.SettingsPage;

public class SettingsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	SettingsPage settingsPage;
	PersonalInformationPage personalInformationPage;
	
	public SettingsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		personalInformationPage = new PersonalInformationPage();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("pin"));
		settingsPage = homePage.clickOnSettings();
	}
	
	@Test
	public void VerifyPersonalInformationlinktest() {
		personalInformationPage = settingsPage.clickOnPersonalInformation();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}

}



