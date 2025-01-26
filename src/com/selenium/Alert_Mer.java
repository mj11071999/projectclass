package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Mer {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		element.click();
		//simple alert
		Alert a = driver.switchTo().alert();
		a.accept();
		//confirm alert
		WebElement element2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		element2.click();
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
		//prompt alert
		WebElement element3 = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
		element3.click();
		
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("john richard");
		System.out.println(a3.getText());
		a3.accept();
		
		
		
		
   }
}
