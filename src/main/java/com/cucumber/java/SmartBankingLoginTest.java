package com.cucumber.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBankingLoginTest {

	public void getLogin() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///Users/iamramkdas/Desktop/qa_online%20Banking%20monthly_yearly%20statement%20-copy.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Batch44");
		driver.findElement(By.id("password")).sendKeys("student123@");
		
		driver.findElement(By.xpath("//*[@value ='Login']")).click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
