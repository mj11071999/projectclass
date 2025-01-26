package org.merlin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//dropdown-multi
		WebElement element = driver.findElement(By.id("cars"));
		Select s = new Select(element);
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
s.deselectByValue("saab");
boolean multiple = s.isMultiple();
System.out.println(multiple);
System.out.println("    get options            ");
List<WebElement> options = s.getOptions();
for (WebElement w : options) {
	System.out.println(w.getText());
	System.out.println(     " all selected options   ");
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement w1 : options) {
		System.out.println(w1.getText());
	}
}

















	}
}
