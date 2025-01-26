package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merlin_Webapp {
	public static void main(String[] args) {
		// property setting
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		//launch the browser syntax
		WebDriver driver = new ChromeDriver();//upcasting
		//launch the url
		driver.get("https://www.facebook.com/");
		//manage
		driver.manage().window().maximize();
		//sentkeys
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("123@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("56778");
		//click
		//WebElement login = driver.findElement(By.name("login"));
		//login.click();
		//getattribute
		String attribute = email.getAttribute("placeholder");
		System.out.println(attribute);
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);
		//isdisplayed
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		//isenabled
		boolean enabled = pass.isEnabled();
		System.out.println(enabled);
		//clear
		pass.clear();
		
		

	}
}
