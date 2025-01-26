package org.merlin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1] /div[2]/div/form/div/div[1]/div/label/input  "));
		user.sendKeys("jervice123@gmail.com");

		WebElement pass = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1] /div[2]/div/form/div/div[2]/div/label/input                                           "));
		pass.sendKeys("12356");

	}
}