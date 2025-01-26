package org.merlin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class X_Path {
    public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          //implict wait
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          //xpath
          //syntax1
          WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
          user.sendKeys("abcetguijo");
          //explicit wait
          WebDriverWait w = new WebDriverWait(driver, 10);
          w.until(ExpectedConditions.visibilityOf(user));
          //suntax2
          WebElement pass = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
          pass.sendKeys("123567");
         
          TakesScreenshot ts =(TakesScreenshot) driver;
          File gh = ts.getScreenshotAs(OutputType.FILE);
          File hk= new File("C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Screenshots\\jr.png");
          FileUtils.copyFile(gh, hk);
          
          
          
          
          
          
          
          
          
          
          
	}
}
