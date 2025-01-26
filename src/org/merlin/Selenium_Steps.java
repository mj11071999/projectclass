package org.merlin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Steps {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          //webdriver methods
          //gettiltle
          String title = driver.getTitle();
          System.out.println(title);
          //getcurrenturl
          String currentUrl = driver.getCurrentUrl();
          System.out.println(currentUrl);
          //navigate to,forward,back,refresh
         
          driver.navigate().to("https://www.instagram.com/");
          
          
          
          
          
          
          
          
          
          
          
          
          
          
	}
}
