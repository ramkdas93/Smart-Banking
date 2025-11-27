package com.cucumber.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class OrangeHRMLoginTest {

	public void getLogin() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[contains(@class,'orangehrm-login-button')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class = 'oxd-userdropdown-name']")).click();

		WebElement logoutBtn = driver
				.findElement(By.xpath("//*[contains(@class,'oxd-userdropdown-link') and text()='Logout']"));

		Thread.sleep(2000);
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(logoutBtn.isDisplayed(), "logout button should be visible");
		logoutBtn.click();
		sa.assertAll();

		driver.quit();

	}

	// WebDriverWait() method used instead thread sleep:

	/*
	 * public void getLogin() {
	 * 
	 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 * driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@name='username']"))).sendKeys("Admin");
	 * driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	 * 
	 * driver.findElement(By.xpath("//*[contains(@class,'orangehrm-login-button')]")
	 * ).click();
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//*[@class = 'oxd-userdropdown-name']"))).click();
	 * 
	 * WebElement logoutBtn =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//*[contains(@class,'oxd-userdropdown-link') and text()='Logout']")));
	 * 
	 * SoftAssert sa= new SoftAssert(); sa.assertTrue(logoutBtn.isDisplayed(),
	 * "logout button should be visible"); logoutBtn.click();
	 * 
	 * sa.assertAll(); driver.quit();
	 * 
	 * }
	 */

}
