package com.dm;

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
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		//all data
		System.out.println(" //  all data //");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : alldata) {
			System.out.println(all.getText());
		}
		System.out.println(" //  column data //");
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement w : columndata) {
			System.out.println(w.getText());
		}
		System.out.println(" // particular data //");
		
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[7]/td[5]"));
		System.out.println(particular.getText());
		System.out.println(" // headers //");
		List<WebElement> headers = driver.findElements(By.tagName("td"));
		for (WebElement h : headers) {
			System.out.println(h.getText());
		}
	}
}
