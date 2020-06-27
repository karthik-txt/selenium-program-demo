/**
 * 
 */
package com.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browserfactory.javascript;

/**
 * @author karthik
 *
 */
public class homepage {
	
	WebDriver driver;
	
	By leavelist=By.xpath("//span[text()='Leave List']");
	By from=By.xpath("(//img[@class='ui-datepicker-trigger'])[1]");
	By form1=By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='10']");
	By to=By.xpath("(//img[@class='ui-datepicker-trigger'])[2]");
	By t01=By.xpath("//table[@class='ui-datepicker-calendar']/tbody//a[text()='20']");
	By  scheduled=By.xpath("//input[@id='leaveList_chkSearchFilter_2']");
	By employee=By.xpath("//input[@name='leaveList[txtEmployee][empName]']");
	By name=By.xpath("//div[@class='ac_results']//li[text()='Jasmine Mo']");
	By subunit=By.xpath("//select[@id='leaveList_cmbSubunit']");
	By PE=By.xpath("//input[@id='leaveList_cmbWithTerminated']");
	By search=By.xpath("//input[@id='btnSearch']");
	By save=By.xpath("//input[@name='btnSave']");
	By admin=By.xpath("//a[@id='welcome']");
	By logout=By.xpath("//a[text()='Logout']");
	
	
	public homepage(WebDriver driver) {
	this.driver=driver;
	}
	
	
	public void homewebpage(String names) throws InterruptedException {
		driver.findElement(leavelist).click();
		Thread.sleep(2000);
		driver.findElement(from).click();
		driver.findElement(form1).click();
		driver.findElement(to).click();
		driver.findElement(t01).click();
		driver.findElement(scheduled).click();
		driver.findElement(employee).sendKeys(names);
		driver.findElement(name).click();
		WebElement ele=driver.findElement(subunit);
		Select sel=new Select(ele);
		sel.selectByValue("6");
		driver.findElement(PE).click();
		driver.findElement(search).click();
		Thread.sleep(2000);
		javascript.scroll3(driver, save);
		Thread.sleep(2000);
		driver.findElement(save).click();
		driver.findElement(admin).click();
		Thread.sleep(2000);
		driver.findElement(logout).click();
		
		
	}
}
