package com.step.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(className ="UserNameText")
	WebElement usernametext;
	
	@FindBy(id="Settings")
	WebElement Settings;
	
	@FindBy(id="Buy a Course")
	WebElement BuyACourse;
	
	@FindBy(id="Online Lessons")
	WebElement OnlineLessons;
	
	@FindBy(id="Live Classes")
	WebElement LiveClasses;
	
	@FindBy(id="Coach Calls")
	WebElement CoachCalls;
	
	@FindBy(xpath="(//*[@href=\"/logout\"])[1]")
	WebElement Logout;
	
	@FindBy(className="changecourse")
	WebElement changeCourse;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public String verifyUserNameText() {
		return usernametext.getText();
	}
	
	public BuyACoursePage clickOnBuyACourse() {
		BuyACourse.click();
		return new BuyACoursePage();
	}
	
	public SettingsPage clickOnSettings() {
		Settings.click();
		return new SettingsPage();
	}
	
	
	}
	
	

