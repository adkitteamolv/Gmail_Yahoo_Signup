package com.SeleniumDriver.Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select_Opt_from_DropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\318759\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://salesforce.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='button-login']")).click();
		
		driver.findElement(By.linkText("Sign up for free.")).click();
		
		
		WebElement element= driver.findElement(By.xpath(".//*[@id='CompanyEmployees']"));
		
		Select emp=new Select(element);
		
		List li=emp.getOptions();
		
		Iterator it=li.iterator();
		
		System.out.println(li.size());
		
		
		while (it.hasNext()) {
			WebElement el = (WebElement) it.next();
			
			System.out.println(el.getText());
			
			if (el.getText().equals("501 - 1000 employees")){
				
				el.click();
			}
		}
		
		
		WebElement lang=driver.findElement(By.xpath(".//*[@id='CompanyLanguage']"));
		
		Select la=new Select(lang);
		
	    List lali=la.getOptions();
	    
	    Iterator itla=lali.iterator();
	    
	    while (itla.hasNext()) {
			WebElement ella = (WebElement) itla.next();
			
			System.out.println(ella.getText());
			
         if (ella.getText().equals("Portuguese  (Brazilian)")){
				
				ella.click();
			}
			
			
		}
		
		//driver.close();
		
		

	}

}
