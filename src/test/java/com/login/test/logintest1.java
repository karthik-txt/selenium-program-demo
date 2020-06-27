/**
 * 
 */
package com.login.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.login.pages.homepage1;
import com.login.pages.loginpage1;

import Browserfactory.browsers1;

/**
 * @author karthik
 *
 */
public class logintest1 {

	WebDriver driver;
	@Test
	public void orangehrmloginpage() throws InterruptedException {
		driver=browsers1.getbrowser(driver, "chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		loginpage1 login=PageFactory.initElements(driver, loginpage1.class);
		login.loginpage("Admin", "admin123");
		String text=driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		System.out.println("text is:"+text);
		Assert.assertTrue(text.contains("board"));
		System.out.println("dashboard verified is exsisted in homepage");
	}
	
	@Test(dependsOnMethods="orangehrmloginpage")
	public void orangehrmlivehomepage() throws InterruptedException {
		homepage1 home=PageFactory.initElements(driver, homepage1.class);
		home.orangehrmhomepage("r", "6");
	}
}
