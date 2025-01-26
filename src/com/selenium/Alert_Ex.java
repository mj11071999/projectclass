package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
	  
	 //simple alert
		WebElement element = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		element.click();
	  
	  Alert s = driver.switchTo().alert();
	  s.dismiss();
	  //conform alert
	  WebElement element2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	  element2.click();
	  
	  Alert cancel = driver.switchTo().alert();
	  cancel.dismiss();
	  //prompt alert
	  WebElement element3 = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
	  element3.click();
	  Alert c = driver.switchTo().alert();
	  c.sendKeys("MERLIN JERVICE");
	  System.out.println(c.getText());
	 c.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
