package com.SeleniumDriver.CalltoPageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SeleniumDriver.Pages.Yahoo_SignUp;

public class YahooSignupMethodCall {
	
	
	WebDriver driver= null;
	WebElement element=null;
	
	public YahooSignupMethodCall(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void callYahooSignupMethod(){

	Yahoo_SignUp yahooSignUpObject= new Yahoo_SignUp(driver);
	
	yahooSignUpObject.navigateToYahoo();
	yahooSignUpObject.clickCreateAccountbutton();
	
	yahooSignUpObject.enterFirstNAme();
	yahooSignUpObject.enterLastNAme();
	yahooSignUpObject.enterYahooId();
	yahooSignUpObject.enterPassword();
	yahooSignUpObject.showPassword();
	yahooSignUpObject.enterMobileNumber();
	yahooSignUpObject.selectDay();
	yahooSignUpObject.selectMonth();
	yahooSignUpObject.selectYear();
	yahooSignUpObject.selectGender();
	yahooSignUpObject.enterResidenceMobile();
	yahooSignUpObject.enterRelationship();
	/*try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	yahooSignUpObject.clickCreateAccount_Button();
	
	driver.quit();
	}
	
	
}
