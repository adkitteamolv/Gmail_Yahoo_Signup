package com.SeleniumDriver.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.SeleniumDriver.CalltoPageMethods.GmailSignupMethodCall;
import com.SeleniumDriver.CalltoPageMethods.YahooSignupMethodCall;
import com.SeleniumDriver.Initialization.Selenium_Constructs;
import com.SeleniumDriver.Pages.GmailSignUp;
import com.SeleniumDriver.Pages.Yahoo_SignUp;

public class Inint {

	static WebDriver driver = null;
	static WebElement element = null;
	
	
	public static void main(String[] args) {
						
 // GMAIL SIGNUP
		
		driver= Selenium_Constructs.startup_Driver();
		
		GmailSignupMethodCall gmailSignupObject=new GmailSignupMethodCall(driver);
		gmailSignupObject.callGmailSignupMethod();
		
		
		

  // YAHOO SIGNUP
		
		driver = Selenium_Constructs.startup_Driver();
		
		YahooSignupMethodCall yahooSignupObject= new YahooSignupMethodCall(driver);
		yahooSignupObject.callYahooSignupMethod();
		
		
		

   // CODE TO OPEN NEW TAB
		
//		Actions newTab = new Actions(driver);
//	    newTab.sendKeys(Keys.CONTROL + "t").perform();
		
//		element = driver.findElement(By.cssSelector("body"));
//		Actions actionOpenLinkInNewTab = new Actions(driver);
//		actionOpenLinkInNewTab.moveToElement(element).keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
		
		
	}

}
