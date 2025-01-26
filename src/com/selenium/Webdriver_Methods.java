package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapchat.com/");
		driver.manage().window().maximize();
		//getTitle
		String title = driver.getTitle();
		System.out.println(title);
		//getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//navigation methods
		driver.navigate().to("https://www.meesho.com/ ");
		
		//back
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		
		//close
		driver.close();
		
		
		
	}
}
