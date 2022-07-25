package com.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.tcs.driver.Driver;

public class FlipkartAddToCartFlow {
	public static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		 
		/**
		 * Get the driver and navigate to Flipkart
		 * this approach will help us to use multiple drivers
		 */
		driver =Driver.getChromeDriver();	
		driver.manage().window().maximize();
     	driver.navigate().to("https://www.flipkart.com");
     	
     	/**
     	 *This method is used to login on the website
     	 */
		login("9015677021","Flipkart@123");
		
		/**
		 * This method is for loging out form the site
		 */
		logout();
		
	}

	private static void logout() throws InterruptedException {
		
		Thread.sleep(1000);
		
		//
		
		WebElement myAccountBox=driver.findElement(By.cssSelector("div [class=exehdJ]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(myAccountBox).build().perform();
		
		Thread.sleep(1000);
		
		WebElement logoutButton =driver.findElement(By.cssSelector("a[href*=\"#\"]"));
		logoutButton.click();
		//actions.moveToElement(myAccountBox);("div [class=3vhnxf]")
	}

	private static void login(String username,String password) throws InterruptedException {
		
		Thread.sleep(1000);
		
		WebElement loginBox=driver.findElement(By.cssSelector("div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input"));
		loginBox.sendKeys(username);
		
		Thread.sleep(1000);

		WebElement passwordBox=driver.findElement(By.cssSelector("input[type=password]"));
		passwordBox.sendKeys(password);	
		
		WebElement submitButton=driver.findElement(By.cssSelector("button[type=submit] span"));
		submitButton.submit();		
		
	}

}
