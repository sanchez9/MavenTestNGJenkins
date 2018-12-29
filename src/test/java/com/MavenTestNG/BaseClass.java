package com.MavenTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	
@Test	
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("");
		driver.get("https://www.google.com/");
		
	
	}
	
}
