package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;");
		driver.manage().window().maximize();
		//index
		driver.switchTo().frame(0);
		
		
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		
		driver.switchTo().defaultContent();
		
	//multi or nested frame
		Thread.sleep(2000);
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(outer);
		
		driver.switchTo().frame("frame2");
		WebElement button1 = driver.findElement(By.id("Click"));
		 button1.click();
		//outer frame
		 driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
}
}
