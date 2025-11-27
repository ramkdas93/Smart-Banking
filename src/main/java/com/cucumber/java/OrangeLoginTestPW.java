package com.cucumber.java;

import java.util.Arrays;

import org.testng.asserts.SoftAssert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OrangeLoginTestPW {

	public void getLogin() throws InterruptedException {

		// using PlayWright
		Playwright pw = Playwright.create(); // initializes or creates the automation engine.

		// to open a browser like Chromium with UI visible because setHeadless is false.
		Browser browser = pw.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(Arrays.asList("--start-maximized")));

		// creates a new isolated browser profile or session inside the Browser.
		// 'setViewportSize(null)' means to use browser Window's size instead.
		BrowserContext bct = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

		// opens a new tab (or window) inside the browser context.
		Page pageObj = bct.newPage();

		pageObj.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		pageObj.locator("*[name='username']").fill("Admin");
		pageObj.locator("*[name='password']").fill("admin123");

		// using CSS selector to click on Login Button
		pageObj.locator("button.orangehrm-login-button").click();
		Thread.sleep(3000);

		pageObj.locator("*[class = 'oxd-userdropdown-name']").click();
		
		// using xpath <a> with text
		Locator logoutBtn = pageObj.locator("//a[text()='Logout']");
		
		// let's validate now.
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(logoutBtn.isVisible());
		System.out.println(logoutBtn.isVisible());
		Thread.sleep(2000);
		sa.assertAll();
		
		logoutBtn.click();

		pageObj.close();
		browser.close();
		pw.close();

	}
}
