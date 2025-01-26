package org.merlin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Sample {
   public static void main(String[] args) throws IOException {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot) driver;//narrowing upcasting
	File mer = ts.getScreenshotAs(OutputType.FILE);
	File jer = new File("C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Screenshots\\MJ.png");
	FileUtils.copyFile(mer, jer);
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
