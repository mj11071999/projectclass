package com.dm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upload {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;");
		driver.manage().window().maximize();
		
		//sendkeys
		WebElement file = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		//file.sendKeys("C:\\Users\\adams\\Desktop\\File_upload.txt");
		//robot
		Actions a = new Actions(driver);
		a.click( file).build().perform();
		StringSelection s = new StringSelection("C:\\Users\\adams\\Desktop\\File_upload.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r = new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
