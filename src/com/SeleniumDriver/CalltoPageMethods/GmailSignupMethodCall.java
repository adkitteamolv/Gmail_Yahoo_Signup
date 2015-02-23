package com.SeleniumDriver.CalltoPageMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SeleniumDriver.Model.MainForm;
import com.SeleniumDriver.Pages.GmailSignUp;
import com.SeleniumDriver.ReadFile.FileReader;

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
		List<MainForm> mainForms = FileReader
				.readCsvData("C:\\Users\\318759\\Desktop\\workspace\\Practise_SeleniumPrograms\\GmailSignUp.csv");
		for(MainForm form : mainForms){
				
		gsignup.enterFirstName(form.getFirstName());
		gsignup.enterLastName(form.getLastName());
		gsignup.enterEmailAddress(form.getUserName());
		gsignup.enterPassword(form.getPassword());
		gsignup.enterConfirmPassword(form.getConfirmPassword());
		
		gsignup.enterBirthMonth();
		gsignup.enterDay(form.getDay());
		gsignup.enterYear(form.getYear());
		
		String str = form.getGender().toLowerCase().toString();
		System.out.println(str);
		
		driver.findElement(By.xpath("//div[@id='Gender']")).click();
		
		
		if (str.equals("male")){
			driver.findElement(By.xpath("//div[@id=':f']")).click();	
			
		}
		else{
			
			driver.findElement(By.xpath(".//*[@id=':e']/div")).click();
		}
				
		
		//gsignup.selectGenderValue();
		gsignup.selectCountry();
		gsignup.enterPhoneNumber(form.getMobile());
		gsignup.enterRecoveryEmail(form.getCurrentEmail());
		gsignup.clickSkipCaptcha();
		gsignup.clickTermsOfService();
		
		// Click on next Step
		gsignup.clickNextStepButton();
		
		gsignup.clickOnContionueButton();
		
		
	//	
		//driver.findElement(By.id("TermsOfService")).click();
		}
//		Actions newTab = new Actions(driver);
//        newTab.sendKeys(Keys.CONTROL + "t").perform();
		
		// driver quit
		
		driver.quit();
	}

}
