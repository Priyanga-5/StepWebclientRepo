package com.step.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.step.qa.base.TestBase;

public class PersonalInformationPage extends TestBase{
	
	@FindBy(xpath= "//*[contains(text(),'Edit')]")
	WebElement edit;
	
	@FindBy(name="fullName")
	WebElement Name;
	
	@FindBy(name="gender")
	WebElement Gender;
	
	@FindBy(name="age")
	WebElement Age;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(name="userType")
	WebElement WhoAreYou;
	
	@FindBy(id="primaryPurpose")
	WebElement PurposeOfUsingStep;
	
	@FindBy(xpath= "(//*[contains(text(),'SAVE')])")
	WebElement Save;
	
	public PersonalInformationPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void editProfile( String name, String gender, String background, String purpose, String age) {
		edit.click();	
		Name.sendKeys(name);
		
		Select select = new Select(Gender);
		select.selectByVisibleText(gender);
		
		Age.sendKeys(age);
		
		Select select1 = new Select(WhoAreYou);
		select1.selectByVisibleText(background);
		
		Select select2 = new Select(PurposeOfUsingStep);
		select2.selectByVisibleText(purpose);
		
		Save.click();
		
	}

}
