package com.SeleniumDriver.Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Constructs {
	
	
	static WebDriver driver;
	
	public static WebDriver startup_Driver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\318759\\Desktop\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
