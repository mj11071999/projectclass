package com.dm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
	   WebElement element = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
	   element.click();
	   org.openqa.selenium.Alert a = driver.switchTo().alert();
	   a.accept();
	   WebElement element2 = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
	   element2.click();
	   org.openqa.selenium.Alert a1 = driver.switchTo().alert();
	   a1.dismiss();
	   WebElement element3 = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
	   element3.click();
	   org.openqa.selenium.Alert a2 = driver.switchTo().alert();
	   a2.sendKeys("merlin jervice");
	   System.out.println(a2.getText());
	   a2.accept();
	  
	   
}
}
