package com.SeleniumDriver.Model;

public class MainForm {

	private String month;
	private String lastName;
	private String firstName;
	private String day;
	private String userName;
	private String password;
	private String confirmPassword;
	private String year;
	private String gender;
	private String country;
	private String mobile;
	private String currentEmail;

	public MainForm(String firstName, String lastName,
			String userName, String password, String confirmPassword,String month, String day, String year, String gender, String country, String mobile, String currEmail) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.country= country;
		this.mobile=mobile;
		this.currentEmail=currEmail;
		this.gender=gender;
		this.year=year;
		this.day=day;
		this.month=month;
		
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCurrentEmail() {
		return currentEmail;
	}
	
	public String getDay() {
		return day;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String getMonth() {
		return month;
	}
	
	public String getYear() {
		return year;
	}
	
	
}

