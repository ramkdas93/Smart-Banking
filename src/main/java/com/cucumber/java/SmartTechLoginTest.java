package com.cucumber.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SmartTechLoginTest {

	SoftAssert sa;
	WebDriver driver;

	public void getLogin() throws InterruptedException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"file:///Users/iamramkdas/Library/Containers/net.whatsapp.WhatsApp/Data/tmp/documents/B01DE28B-F771-4DE8-8CC8-35ABFCFF309C/SmartTech_Batch44.html");

		Thread.sleep(1000);

		driver.findElement(By.id("username")).sendKeys("Batch44");
		driver.findElement(By.id("password")).sendKeys("student123@");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn'])[1]")).click();
		Thread.sleep(1000);

		WebElement logoutBtn = driver.findElement(By.xpath("//*[@id = 'logoutBtn']"));
		Thread.sleep(1000);
		System.out.println(logoutBtn.isDisplayed());

		WebElement header = driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());

		logoutBtn.click();
		driver.quit();

	}

}
