package com.sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ANITHA\\eclipse-workspace\\selenium prac\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("welcome to selenium");
		
		
		WebElement clickbt = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions Ac = new Actions(driver);
		Ac.doubleClick(clickbt).perform();
		
		
		
		
	}

}
