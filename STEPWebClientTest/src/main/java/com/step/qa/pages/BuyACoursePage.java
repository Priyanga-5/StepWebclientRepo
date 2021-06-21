package com.step.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.qa.base.TestBase;

public class BuyACoursePage extends TestBase{
	
	@FindBy(xpath="(//*[@class=\"RecommendedCourseButtonBuy\"])[3]")
	WebElement LearnMore;
	
	
	public BuyACoursePage() {
		PageFactory.initElements(driver,this);
	}

	public ProductPage clickOnLearnMore() {
		LearnMore.click();
		return new ProductPage();
	}
	
}
