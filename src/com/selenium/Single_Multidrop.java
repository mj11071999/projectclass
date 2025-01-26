package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Multidrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
          WebElement element = driver.findElement(By.id("cars"));
          Select s = new Select(element);
          //ismultiple
          boolean multiple = s.isMultiple();
          System.out.println(multiple);
          //select
          s.selectByIndex(0);
          s.selectByValue("saab");
          s.selectByVisibleText("Audi");
		//deselect
          s.deselectByIndex(0);
		//getoptions
          List<WebElement> options = s.getOptions();
          for (WebElement w : options) {
        	  System.out.println(w.getText());
			
		}
		//getallselectedoption
          System.out.println("       **getallselectedoption ** ");
          List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
          for (WebElement w1 : allSelectedOptions) {
			System.out.println(w1.getText());
		}
          //getfirstselectedoption
          System.out.println("       **get first selectedoption ** ");
          WebElement firstSelectedOption = s.getFirstSelectedOption();
          System.out.println(firstSelectedOption .getText());
          
          
		
	}
}
