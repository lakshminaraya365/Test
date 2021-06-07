package com.practise1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegualExpression {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http:\\login.salesforce.com");
driver.findElement(By.xpath("//input[contains(@name,'usernam')]")).sendKeys("jgpjp");
driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("gohgo");

	}

}
