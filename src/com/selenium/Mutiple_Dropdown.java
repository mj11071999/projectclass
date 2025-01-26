package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mutiple_Dropdown {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement multi = driver.findElement(By.id("cars"));
		//ismultiple
		Select s = new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
	s.selectByValue("opel");
	s.selectByIndex(1);
	s.selectByVisibleText("Volvo");
		//deselect
	s.deselectByIndex(2);
	//getoptions
	System.out.println("**    all option   **");
	List<WebElement> options = s.getOptions();
	for (WebElement w : options) {
		System.out.println(w.getText());
	}
		
	//getallselectedoptions
	
	System.out.println("**    all selected option   **");
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement w1 : allSelectedOptions) {
		System.out.println(w1.getText());
	}
	
	//getfirstselectedoptions
	
	System.out.println("**   first selected option   **");
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	//deselectall
	
	s.deselectAll();
	
	
	
	
	
		

	}
}
