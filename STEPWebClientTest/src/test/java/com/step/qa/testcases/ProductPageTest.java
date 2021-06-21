package com.step.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.step.qa.base.TestBase;
import com.step.qa.pages.HomePage;
import com.step.qa.pages.LoginPage;


public class ProductPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	
	public ProductPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("pin"));
		
	}
	

	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}

	

}


