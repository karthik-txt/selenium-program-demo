/**
 * 
 */
package com.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author karthik
 *
 */
public class loginpage {

	WebDriver driver;
	
	By username=By.xpath("//input[@id='txtUsername']");
	By pasword=By.xpath("//input[@id='txtPassword']");
	By loginbutton=By.xpath("//input[@id='btnLogin']");
	/*By welcomadmin=By.xpath("//a[text()='Welcome Admin']");
	By logout=By.xpath("Logout");*/
	
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void login(String uname,String password) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(pasword).sendKeys(password);
		driver.findElement(loginbutton).click();
		/*driver.findElement(welcomadmin).click();
		driver.findElement(logout).click();*/
	}
}
