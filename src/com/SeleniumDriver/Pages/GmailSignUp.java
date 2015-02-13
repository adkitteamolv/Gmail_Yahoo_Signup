package com.SeleniumDriver.Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignUp {
	
	By gmailLink = By.xpath("//a[@class='gb_g']");
	By createAnAccount = By.partialLinkText("Create an account");

	//Sign Up form Values//	
	By firstName = By.xpath("//input[@id='FirstName']");
	By lastName = By.xpath("//input[@id='LastName']");
	By emailAddress = By.xpath("//input[@id='GmailAddress']");
	By password = By.xpath("//input[@name='Passwd']");
	By confirmPassword= By.xpath("//input[@id='PasswdAgain']");
	
	By birthMonth= By.xpath("//span[@id='BirthMonth']");
	By birthDay = By.xpath(".//*[@id='BirthDay']");
	By birthYear = By.xpath(".//*[@id='BirthYear']");
	
	By selectGender= By.xpath("//div[@id='Gender']");
	
	By selectCountryValue= By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div");
	By phoneNumber = By.xpath("//input[@id='RecoveryPhoneNumber']");
	By recoveryEmailValue= By.xpath("//input[@id='RecoveryEmailAddress']");
	By skipCaptchaValue= By.xpath("//input[@id='SkipCaptcha']");
	By termsOfService= By.xpath("//input[@id='TermsOfService']");
	By nextStep= By.xpath("//input[@id='submitbutton']");
	
	By clickContinueButton= By.xpath("//input[@id='next-button']");
	
	
	WebDriver driver = null;
	
	public GmailSignUp(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void clickGmailLink(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(gmailLink));
		driver.findElement(gmailLink).click();
	}
	
	public void createAnAccount(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(createAnAccount));
		driver.findElement(createAnAccount).click();
	}
	
	public void enterFirstName(){
		
		CharSequence[] fName={"Amol"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(firstName).sendKeys(fName);
	}
	
	public void enterLastName(){
		
		CharSequence[] lName={"Adkitte"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lastName));
		driver.findElement(lastName).sendKeys(lName);
	}
	
	public void enterEmailAddress(){
		
		CharSequence[] emailAddressValue={"adamol318759"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(emailAddress));
		driver.findElement(emailAddress).sendKeys(emailAddressValue);
	}
	
	public void enterPassword(){
		
		CharSequence[] passwdEnter={"OmSai$29A"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(password));
		driver.findElement(password).sendKeys(passwdEnter);		
	}
	
	public void enterConfirmPassword(){
		
		CharSequence[] confirmPasswdEnter={"OmSai$29A"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(confirmPassword));
		driver.findElement(confirmPassword).sendKeys(confirmPasswdEnter);		
	}
	
	public void enterBirthMonth(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(birthMonth));
		
		driver.findElement(birthMonth).click();
		
		driver.findElement(By.xpath("//div[@id=':b']")).click();
		
		//Select birthMonthValue= new Select(driver.findElement(By.xpath("//div[@id=':b']")));
		
		//birthMonthValue.selectByVisibleText("November");
		
		/*	WebElement element = driver.findElement(birthMonth); 
		
		Select mon= new Select(element);
		
		List<WebElement> li= mon.getOptions();
		Iterator<WebElement> i = li.iterator();
		System.out.println(li.size());
		while (i.hasNext()) {
			WebElement el = (WebElement) i.next();
			if(el.getText().equals("November")){
				
				el.click();
				
			}
			else{
				
				System.out.println("November not in list");
			}
			
		}
		 */
		
		
	}
	
	
	public void enterDay() {
		
	//	CharSequence[] birthDayValue={"29"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(birthDay));
		//driver.findElement(birthDay).click();
		driver.findElement(birthDay).sendKeys("29");
	}
	
	public void enterYear(){
		
		//CharSequence[] birthYearValue={"1988"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(birthYear));
		driver.findElement(birthYear).sendKeys("1988");
	}
	
	public void selectGenderValue(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(selectGender));
		
		driver.findElement(selectGender).click();
		
		driver.findElement(By.xpath("//div[@id=':f']")).click();
		
	}
	
	public void selectCountry(){
		
		WebElement element= driver.findElement(selectCountryValue);
		
		element.click();
		
		driver.findElement(By.xpath("//div[@id=':7n']")).click();
		
		/*Select count= new Select(element);
		
		List li = count.getOptions();
		
		Iterator it= li.iterator();
		
		while (it.hasNext()) {
			WebElement el = (WebElement) it.next();
			
			System.out.println(el.getText());
		}*/
		
		
	}
	
	public void enterPhoneNumber(){
	
		CharSequence[] phone = {"9960277546"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(phoneNumber));
		driver.findElement(phoneNumber).sendKeys(phone);
		
	}
	
	public void enterRecoveryEmail(){
		
		CharSequence[] recoveryEmail={"adkitteamolv@gmail.com"};
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(recoveryEmailValue));
		driver.findElement(recoveryEmailValue).sendKeys(recoveryEmail);
	}
	
	public void clickSkipCaptcha(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(skipCaptchaValue));
		driver.findElement(skipCaptchaValue).click();
	}
	
	public void clickTermsOfService(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(termsOfService));
		driver.findElement(termsOfService).click();
	}
	
	public void clickNextStepButton(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(nextStep));
				
		driver.findElement(nextStep).click();
	}
	
	public void clickOnContionueButton(){
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(clickContinueButton));
		
		driver.findElement(clickContinueButton).click();
	}

}
