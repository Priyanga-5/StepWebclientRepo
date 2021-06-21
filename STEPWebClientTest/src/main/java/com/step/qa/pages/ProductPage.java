package com.step.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.qa.base.TestBase;

public class ProductPage extends TestBase{
	
	@FindBy(id="couponCode")
	WebElement CouponCode;
	
	@FindBy(xpath="(//*[@type=\"button\"])[2]")
	WebElement Apply;
	
	@FindBy(className= "get-free-button")
	WebElement BuyNow;
	
	@FindBy(className= "alert alert-danger")
	WebElement EmptyMessage;
	
	@FindBy(xpath="//*[@class=\"text-center modal-body\"]/p")
	WebElement IncorrectMessage;
	
	
	
	public ProductPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void EmptyCouponCode() {
		
	}
	
	public void VaildateInvaildCouponCode() {
		CouponCode.sendKeys("coupon");
		Apply.click();
		
		
	}
	
	public void VaildateVaildOfferCode() {
		
	}
	
	public void VaildateExpiredOfferCode() {
		
	}

}
