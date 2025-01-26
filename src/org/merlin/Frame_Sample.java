package org.merlin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Sample {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		// singleframe
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		driver.switchTo().defaultContent();
        //multi frame
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(outer);
		driver.switchTo().frame("frame2");
		WebElement button1 = driver.findElement(By.id("Click"));
	button1.click();
		
		
		//screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File op = ts.getScreenshotAs(OutputType.FILE);
		File is = new File("C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Screenshots\\mer.png");
		 FileUtils.copyFile(op, is);
		
		
		
		
		
		
		
		
		
	}
}
