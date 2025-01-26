package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//click
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions ac = new Actions(driver);
		ac.click(button).build().perform();
		//rightclick
		WebElement element = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(element).build().perform();
		//double click
		WebElement element2 = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(element2).build().perform();
		//mouse hover
		driver.navigate().to("https://www.flipkart.com/");
		WebElement element3 = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
		ac.moveToElement(element3).build().perform();
		//drag and drop
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		WebElement drop = driver.findElement(By.id("form:drop"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
}
}
