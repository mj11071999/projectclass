package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	 public static void main(String[] args) {
		
		 //property setting
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		//browser launch
		WebDriver driver = new ChromeDriver();
		
		//get
		driver.get("https://instagram.com/");
		//maximize
		driver.manage().window().maximize();
		 
		 
		 
		 
		 
	}

}
