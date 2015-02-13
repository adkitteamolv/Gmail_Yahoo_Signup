package com.SeleniumDriver.CalltoPageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.SeleniumDriver.Pages.GmailSignUp;

public class GmailSignupMethodCall {
	
	WebDriver driver= null;
	WebElement element=null;
	
	public GmailSignupMethodCall(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void callGmailSignupMethod(){
		
		GmailSignUp gsignup= new GmailSignUp(driver);
		gsignup.clickGmailLink();
		gsignup.createAnAccount();
		
		// Sign up data entry
		
		gsignup.enterFirstName();
		gsignup.enterLastName();
		gsignup.enterEmailAddress();
		gsignup.enterPassword();
		gsignup.enterConfirmPassword();
		
		gsignup.enterBirthMonth();
		gsignup.enterDay();
		gsignup.enterYear();
		
		gsignup.selectGenderValue();
		gsignup.selectCountry();
		gsignup.enterPhoneNumber();
		gsignup.enterRecoveryEmail();
		gsignup.clickSkipCaptcha();
		gsignup.clickTermsOfService();
		
		// Click on next Step
		gsignup.clickNextStepButton();
		
		gsignup.clickOnContionueButton();
		
//		Actions newTab = new Actions(driver);
//        newTab.sendKeys(Keys.CONTROL + "t").perform();
		
		// driver quit
		
		driver.quit();
	}

}
