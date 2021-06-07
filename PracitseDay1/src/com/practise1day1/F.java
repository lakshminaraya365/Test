package com.practise1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//Thread.sleep(3000);
driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	}

}
