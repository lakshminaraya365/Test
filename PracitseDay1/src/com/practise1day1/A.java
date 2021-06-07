package com.practise1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\login.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ymahesh947@");
		driver.findElement(By.id("pass")).sendKeys("64643");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		
		
	}

}
