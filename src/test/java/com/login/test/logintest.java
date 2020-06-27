/**
 * 
 */
package com.login.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.login.pages.homepage;
import com.login.pages.loginpage;

import Browserfactory.browser;

/**
 * @author karthik
 *
 */
public class logintest {

	WebDriver driver;
	
	@Test
	public void orangehrmlogin() {
		driver=browser.getbrowser(driver, "chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		loginpage login=new loginpage(driver);
		login.login("Admin", "admin123");
		String admin=driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		System.out.println("text:"+admin);
		Assert.assertTrue(admin.contains("board"));
	}
	@Test(dependsOnMethods="orangehrmlogin")
	public void orangehrmhomepage() throws InterruptedException {
		
	}
}
