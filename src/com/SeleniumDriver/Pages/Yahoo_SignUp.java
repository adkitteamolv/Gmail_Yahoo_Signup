package com.SeleniumDriver.Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yahoo_SignUp
{
	WebDriver driver=null;
	
	
	//By enterSearchyahoovalue= By.name("q");
	//By listElements = By.xpath("//div[@class='sbsb_a']/ul");
	
	By clickSignUp = By.xpath(".//*[@id='login-signup']/span");
	By enterFname = By.xpath("//input[@name='firstname']");
	By enterLname = By.xpath("//input[@name='secondname']");
	By enterYahooid = By.xpath("//input[@name='yahooid']");
	By enterPassword = By.xpath("//input[@id='password']");
	By showPassword = By.xpath("//label[@id='show-password-label']");
	By enterMobileNo = By.xpath("//input[@id='mobile']");
	
	By date = By.xpath(".//*[@id='day']");
	By month = By.xpath(".//*[@id='month']");
	By year = By.xpath(".//*[@id='year']");
	
	By gender = By.xpath(".//*[@id='male']");
	
	By mobileresidence = By.xpath("//input[@id='mobile-rec']");
	
	By relation = By.xpath("//input[@id='relationship']");
	
	public Yahoo_SignUp(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void navigateToYahoo()
	{
		driver.navigate().to("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.pd=c%3D6T7evjap2e6CwWSb86QVdqk-&.done=https%3A%2F%2Fin.yahoo.com%2F");
		
	}
	
	public void clickCreateAccountbutton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickSignUp));
		driver.findElement(clickSignUp).click();
		
	}
	
	
	public void enterFirstNAme()
	{
		CharSequence[] fname={"Amol"};
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(enterFname));
		driver.findElement(enterFname).sendKeys(fname);
		
	}
	
	
	public void enterLastNAme()
	{
		CharSequence[] lname={"Adkitte"};
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(enterLname));
		driver.findElement(enterLname).sendKeys(lname);
		
	}
	
	
	public void enterYahooId()
	{
		CharSequence[] yahooid={"adam1234"};
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(enterYahooid));
		driver.findElement(enterYahooid).sendKeys(yahooid);
		
	}
	
	
	public void enterPassword()
	{
		CharSequence[] password={"amol9960277546"};
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(enterPassword));
		driver.findElement(enterPassword).sendKeys(password);
		
	}
	
	
	public void showPassword()
	{
		//CharSequence[] password={"amol9960277546"};
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(showPassword));
		driver.findElement(showPassword).click();
		
	}
	
	
	public void enterMobileNumber()
	{
		CharSequence[] mobile={"9960277546"};
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(enterMobileNo));
		driver.findElement(enterMobileNo).sendKeys(mobile);
		
	}
	
	
	public void selectDay()
	{
		
		WebElement element= driver.findElement(date);
		
		Select emp=new Select(element);
		
		List li=emp.getOptions();
		
		Iterator it=li.iterator();
		
		System.out.println(li.size());
		
		
		while (it.hasNext()) {
			WebElement el = (WebElement) it.next();
			
			System.out.println(el.getText());
			
			if (el.getText().equals("29")){
				
				el.click();
			}
		}
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(date));
		
		//driver.findElement(date).click();
		
		/*WebElement element=driver.findElement(date);
		element.click();
		
		Select dayvalue= new Select(element);
		
		dayvalue.selectByValue("29");*/
		
		
	}
	
	
	public void selectMonth()
	{
		
		WebElement element= driver.findElement(month);
		
		Select emp=new Select(element);
		
		List li=emp.getOptions();
		
		Iterator it=li.iterator();
		
		System.out.println(li.size());
		
		
		while (it.hasNext()) {
			WebElement el = (WebElement) it.next();
			
			System.out.println(el.getText());
			
			if (el.getText().equals("November")){
				
				el.click();
			}
		}
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(month));
		//driver.findElement(month).click();
		
	/*	WebElement element=driver.findElement(month);
		element.click();
		
		Select dayvalue= new Select(element);
		
		dayvalue.selectByValue("11");*/
		
		
	}
	
	
	public void selectYear()
	{
		
		WebElement element= driver.findElement(year);
		
		Select emp=new Select(element);
		
		List li=emp.getOptions();
		
		Iterator it=li.iterator();
		
		//System.out.println(li.size());
		
		
		while (it.hasNext()) {
			WebElement el = (WebElement) it.next();
			
			//System.out.println(el.getText());
			
			if (el.getText().equals("1988")){
				
				el.click();
			}
		}
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(year));
		//driver.findElement(year);
		
		/*WebElement element=driver.findElement(year);
		element.click();
		
		Select dayvalue= new Select(element);
		
		dayvalue.selectByValue("1988");*/
		
		
	}
	
	
	public void selectGender()
	{
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(gender));
		//driver.findElement(gender).click();
		
		driver.findElement(By.id("male")).click();
	}
	
	
	public void enterResidenceMobile()
	{
		CharSequence[] remobile={"1234567890"};
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(mobileresidence));
		driver.findElement(mobileresidence).sendKeys(remobile);
		
	}
	
	public void enterRelationship()
	{
		CharSequence[] relationship={"Single"};
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(relation));
		driver.findElement(relation).sendKeys(relationship);
		
	}
	
	
	
	
}
	
//	public void IterateListValuesandPrint(){
//		
//		WebElement element= driver.findElement(listElements);
//		
//		Select emp=new Select(element);
//		
//		java.util.List<WebElement> li=emp.getOptions();
//		
//		java.util.Iterator<WebElement> it=li.iterator();
//		
//		System.out.println(li.size());
//		
//		
//		while (it.hasNext()) {
//			WebElement el = (WebElement) it.next();
//			
//			System.out.println(el.getText());
//			
//			/*if (el.getText().equals("501 - 1000 employees")){
//				
//				el.click();
//			}*/
//		}
//		
//	}
	
	
	


