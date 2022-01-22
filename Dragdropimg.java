package com.sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropimg {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ANITHA\\eclipse-workspace\\selenium prac\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions Ac = new Actions(driver);
		Ac.dragAndDrop(img2, trash).build().perform();
		Ac.dragAndDrop(img2, trash).build().perform();
		
		
		
		
		
		
	}
	
	
	
	
}
