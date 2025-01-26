package org.merlin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(element);
		s.selectByIndex(1);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s.getOptions();
		for (WebElement w : options) {
			System.out.println(w.getText());
		}
		
		
}
}
