/**
 * 
 */
package com.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import Browserfactory.javascripts;

/**
 * @author karthik
 *
 */
public class homepage1 {

	WebDriver driver;
	@FindBy(xpath="//span[text()='Leave List']")
	@CacheLookup
	WebElement leavelist;
	
	@FindBy(how=How.XPATH,using="//input[@name='leaveList[calFromDate]']") 
	@CacheLookup
	WebElement from;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//a[text()='10']") 
	@CacheLookup
	WebElement form1;
	
	@FindBy(how=How.XPATH,using="//input[@name='leaveList[calToDate]']") 
	@CacheLookup
	WebElement to;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody//a[text()='20']")
	@CacheLookup
	WebElement to1;
	
	@FindBy(how=How.XPATH,using="//input[@id='leaveList_chkSearchFilter_2']")
	@CacheLookup
	WebElement scheduled; 
	
	@FindBy(xpath="//input[@name='leaveList[txtEmployee][empName]']")
	@CacheLookup
	WebElement employee;
	
	@FindBy(how=How.XPATH,using="//div[@class='ac_results']/ul/li[3]")
	@CacheLookup
	WebElement name;
	
	
	@FindBy(xpath="//select[@id='leaveList_cmbSubunit']") 
	@CacheLookup
	WebElement subunit;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='leaveList_cmbWithTerminated']")
	@CacheLookup
	WebElement PE;
	
	
	@FindBy(xpath="//input[@id='btnSearch']") 
	@CacheLookup
	WebElement search;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='btnSave'][@name='btnSave']")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath="//a[@id='welcome']")
	@CacheLookup
	WebElement admin;
	
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Logout']")
	@CacheLookup
	WebElement logout;
	
	public void orangehrmhomepage(String names,String values) throws InterruptedException {
		leavelist.click();
		Thread.sleep(2000);
		from.click();
		Thread.sleep(2000);
		form1.click();
		Thread.sleep(2000);
		to.click();
		to1.click();
		Thread.sleep(2000);
		scheduled.click();
		employee.sendKeys(names);
		Thread.sleep(2000);
		name.click();
		Select s=new Select(subunit);
		s.selectByValue(values);
		PE.click();
		search.click();
		javascripts.scroll(driver);
		save.click();
		admin.click();
		Thread.sleep(2000);
		logout.click();
		
	}
}
