package com.practise1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown1 = new Select(dropDown);
		dropdown1.selectByIndex(3);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		dropdown1.selectByVisibleText("AED");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		dropdown1.selectByValue("INR");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
	}

}
