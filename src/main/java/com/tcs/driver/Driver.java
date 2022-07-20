package com.tcs.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static WebDriver getChromeDriver() {
		// System Property for Chrome Driver
	System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse workspace\\flipkart.web.automation\\src\\main\\resources\\drivers\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		return driver;
	}
	
}
