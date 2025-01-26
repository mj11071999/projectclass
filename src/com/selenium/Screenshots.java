package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	 public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
		    TakesScreenshot ts = (TakesScreenshot) driver;
		 
		     File src = ts.getScreenshotAs(OutputType.FILE);
		     File d = new File("C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Screenshots\\fb.png");
		     FileUtils.copyFile(src, d);
	}

}
