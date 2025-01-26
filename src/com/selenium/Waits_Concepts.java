package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Concepts {
    public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver",
 				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.instagram.com/");
 		driver.manage().window().maximize();
 		//implicit
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		
 		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
 		user.sendKeys("jervice123@gmail.com");
 		
 		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
 		//explicit wait
 		WebDriverWait w = new WebDriverWait(driver, 20);
 		w.until(ExpectedConditions.visibilityOf(pass));
 		pass.sendKeys("1234566");
 		
 		
 		
	}
}
