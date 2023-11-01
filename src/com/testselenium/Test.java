package com.testselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.testingshastra.com");
	driver.findElement(By.id("menu-item-19143")).click();
	driver.findElement(By.xpath("//span[text()='Our Courses']")).click();
	
}
}

	


