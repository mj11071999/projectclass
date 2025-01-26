package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MERL_Drop {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	   WebElement ph = driver.findElement(By.xpath("//input[@name='mobile']"));
	   ph.sendKeys("8838283117");
		WebElement id = driver.findElement(By.id("email_id"));
		id.sendKeys("jervice123@gmail.com");
	   WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	   button.click();
	   
	   WebElement element = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	   Select s = new Select(element);
	   s.selectByIndex(2);
	   
	   
	   
	   
	   
}
}
