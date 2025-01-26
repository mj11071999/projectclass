package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {
  public static void main(String[] args) {
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	WebElement find = driver.findElement(By.xpath("//input[@type='text']"));
	find.sendKeys("bag");
	WebElement click = driver.findElement(By.xpath("nav-search-submit-button"));
	click.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
