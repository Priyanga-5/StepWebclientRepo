package com.step.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.qa.base.TestBase;

public class SettingsPage extends TestBase {

	@FindBy(xpath="//*[contains(text(),'Personal Information')]")
	WebElement Settings;
	
	@FindBy(xpath="(//*[contains(text(),'Settings')])[3]")
	WebElement PersonalInformation;
	
	public SettingsPage() {
		PageFactory.initElements(driver,this);
	}

	public PersonalInformationPage clickOnPersonalInformation(){
		 PersonalInformation.click();
		 return new PersonalInformationPage();
	}
	
}

