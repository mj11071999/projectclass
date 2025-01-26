package org.merlin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
         //webelement methods
          WebElement username = driver.findElement(By.id("email"));
          username.sendKeys("jervice123@gmail.com");
          //getattribute
          String attribute = username.getAttribute("data-testid");
          System.out.println(attribute);
          String attribute2 = username.getAttribute("value");
          System.out.println(attribute2);
          WebElement password = driver.findElement(By.id("pass"));
          password.sendKeys("12356");
          WebElement button = driver.findElement(By.name("login"));
          button.click();
         
         
          
          
          
          
	}
}
