package com.practise1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    Thread.sleep(4000);
	    int i=1;
	    while(i<5) {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    	i++;
	    }
	    driver.findElement(By.cssSelector("input[value='Done']")).click();
	//Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"5 Adult");
	
}

}
