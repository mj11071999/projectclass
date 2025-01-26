package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
    public static void main(String[] args) throws AWTException {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement appli = driver.findElement(By.xpath("//a[@aria-label='Appliances']"));
		Actions a = new Actions(driver);
		a.contextClick(appli).build().perform();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		 
	    WebElement flight = driver.findElement(By.xpath("//a[@aria-label='Flight Bookings']"));
	    a.contextClick( flight).build().perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String st: windowHandles) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
		}
		 String s = "Tvs And Appliances New Clp Store Online ";
		 for (String st : windowHandles) {
			if (driver.switchTo().window(st).getTitle().equals(s)) {
				break;
			}
		}
		
		
		
	}
}
