/**
 * 
 */
package com.login.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author karthik
 *
 */
public class loginpage1 {

	WebDriver driver;
	@FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	@CacheLookup
	WebElement login_button;
	
	
	/*@FindBy(how=How.XPATH,using="//a[text()='Welcome Admin']")
	@CacheLookup
	WebElement welcomeadmin;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;*/
	
	
	public loginpage1(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void loginpage(String uname,String pwd) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login_button.click();
		/*welcomeadmin.click();
		Thread.sleep(2000);
		logout.click();*/
		
	}
}
