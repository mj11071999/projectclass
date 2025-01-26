package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merli_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/login");
		driver.manage().window().maximize();
		//xpath 5 syntax---------
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		user.sendKeys("gghghj");
		//xpath  1 synatx
		WebElement pass = driver.findElement(By.xpath("//input[@data-uia='password-field']"));
		pass.sendKeys("878899");
		//xpath  syntax 5-------
		WebElement login = driver.findElement(By.xpath("//button[contains(@data-uia,'login')][1]"));
		login.click();
		//gettext() syntax 2
		WebElement text = driver.findElement(By.xpath("//h1[text()='Sign In']"));
		System.out.println(text.getText());
		
		//syntax//is selected
		WebElement box = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		System.out.println(box.isSelected());
		  
		//attribute
		String attribute = user.getAttribute("Forgot password?");
		System.out.println(attribute );
		
		//gettext sybtax 4
		WebElement mer = driver.findElement(By.xpath("//span[contains(text(),'This page is protected by Google reCAPTCHA ')]"));
		System.out.println(mer.getText());
		
		//syntax 3
		WebElement te = driver.findElement(By.xpath("(//p[contains(@class,' default')])[1]"));
		System.out.println(te.getText());
		
		
		
		
		
		
		
		
		
		
		
	}
}
