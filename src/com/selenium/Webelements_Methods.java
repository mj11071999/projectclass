package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.messenger.com/");
		driver.manage().window().maximize();
		//sentkeys
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("jervice123@gmail.com");
    	//getAttribute
	//	String attribute = element.getAttribute("placeholder");
	//	System.out.println(attribute);
	//	String attribute2 = element.getAttribute("value");
	//	System.out.println(attribute2);
		
    	WebElement element2 = driver.findElement(By.id("pass"));
    	element2.sendKeys("12355");
    	
    	//isdisplayed
    	boolean displayed = element2.isDisplayed();
    	System.out.println(displayed);
    	//isenabled
    	boolean enabled = element.isEnabled();
    	System.out.println(enabled);
    	//clear
    	//element2.clear();
    	
    	
    	
    	
    	
	}
}
