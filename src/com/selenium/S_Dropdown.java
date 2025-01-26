package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S_Dropdown {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver",
 				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.facebook.com/");
 		driver.manage().window().maximize();
 	  WebElement a= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
 	  a.click();
 	WebElement multi = driver.findElement(By.id("day"));
 	  Select s = new Select(multi);
 	  boolean multiple = s.isMultiple();
 	  System.out.println(multiple);
 	  s.selectByValue("3");
 	  s.selectByIndex(4);
 	  s.selectByVisibleText("20");
 	  
 	  //getoption
 	  System.out.println("  ** all options  **");
 	  List<WebElement> options = s.getOptions();
 	  for (WebElement web : options) {
		System.out.println(web.getText());
	}
 	//getallselectedoptions
 	 System.out.println("  ** all  selected options  **");
 	  List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
 	  for (WebElement webEl : allSelectedOptions) {
		System.out.println(webEl.getText());
	}
 	  //getfirstselectedoption
 	 System.out.println("  ** first selected options  **");
 	  WebElement firstSelectedOption = s.getFirstSelectedOption();
 	  System.out.println( firstSelectedOption .getText());
 	 
 	  
 	  
 	  
 	  
 	  
 	  
	}
}
