package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		//all data
		System.out.println("  All data    ");
		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : elements) {
			System.out.println(all.getText());
		}
		//row data
		System.out.println("    row data   ");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement row : rowdata) {
			System.out.println(row.getText());
			
		}
		//column data
		System.out.println("   column data   ");
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement column: columndata) {
			System.out.println(column.getText());
			
		}
		
		//particular data
		System.out.println("          particular data    " );
		WebElement particulardata = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
		System.out.println(particulardata.getText());
		//headers
		System.out.println("        headers    ");
		List<WebElement> allheaders = driver.findElements(By.tagName("th"));
		for (WebElement headers : allheaders) {
			System.out.println(headers.getText());
		}
		
		
		
		
		
		
		
		
}
}
