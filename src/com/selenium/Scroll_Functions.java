package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Functions {
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver",
 				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.flipkart.com/");
 		driver.manage().window().maximize();
 		WebElement pay = driver.findElement(By.xpath("//a[@aria-label='Payments']"));
 		JavascriptExecutor js =(JavascriptExecutor) driver;
 		js.executeScript("arguments[0].scrollIntoView();", pay);
 		Thread.sleep(2000);
 		
 		WebElement eag = driver.findElement(By.xpath("(//img[@loading='eager'])[1]"));
 		js.executeScript("arguments[0].scrollIntoView();", eag);
 		
 		
 		
 		
	}
}
