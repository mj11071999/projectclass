package com.dm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement car = driver.findElement(By.id("cars"));
		Select s = new Select(car);
		s.selectByValue("opel");
		s.selectByIndex(3);
		s.selectByVisibleText("Volvo");
		s.deselectByVisibleText("Volvo");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s.getOptions();
		for (WebElement w : options) {
			System.out.println(w.getText());
				
		}
		System.out.println("      ** all selected options**");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement w1 : allSelectedOptions) {
		System.out.println(w1.getText());	
		}
		System.out.println("               firstSelectedOption  ");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println( firstSelectedOption.getText());
		
		
}
}
