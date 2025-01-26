package org.merlin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event {
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Java_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	   //click
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement click1 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions a = new Actions(driver);
		a.click(click1).build().perform();
	   //right click-context click
		WebElement right = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(right).build().perform();
		WebElement doublebt = driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(doublebt).build().perform();
		//move to element-mouse hover 
		driver.navigate().to("https://www.meesho.com/");
		WebElement movetobutton = driver.findElement(By.xpath("(//span[@color='greyBase'])[3]"));
		a.moveToElement(movetobutton).build().perform();
		//drag and drop
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		WebElement drop = driver.findElement(By.id("form:drop_content"));
		a.dragAndDrop(drag, drop).build().perform();
		//2
		WebElement element = driver.findElement(By.id("form:conpnl"));
		a.dragAndDrop(element, element).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
