/**
 * 
 */
package frameworkdemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.WebElement;

/**
 * @author karthik
 * 
 *
 */
@Test
public class calendertable {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/webtable.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("handle calender table");
	}
	/*@Test(priority=1,description="static way")
	public void webtable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-sm-5 alignItems')]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Apr 06 2020']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-md-2 col-sm-5')]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Apr 23 2020']")).click();
		
	}*/
	
	@Test(priority=2,description="dynamic way")
	public void webtable1() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-sm-5 alignItems')]")).click();
		List<WebElement>dep=driver.findElements(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div"));
		System.out.println("number of dates are:"+dep.size());
		for(int i=0;i<dep.size();i++) {
			WebElement ele=dep.get(i);
			String text=ele.getText();
			if(text.equals("13")) {
				ele.click();
				break;
			}
			System.out.println("After selecting dates are:"+text);
		}
		
		driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-md-2 col-sm-5')]")).click();
		List<WebElement>ret=driver.findElements(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div"));
		System.out.println("number of dates are:"+ret.size());
		for(int i=0;i<ret.size();i++) {
			WebElement ele=ret.get(i);
			String text=ele.getText();
			System.out.println("before selecting return date:"+text);
			if(text.equals("25")) {
				ele.click();
				break;
			}
			System.out.println("After selecting return dates are:"+text);
		}
			
	}
	
	/*@Test(priority=3,description="dynamic way in ascending")
	public void webtable2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-sm-5 alignItems')]")).click();
		List actual=new ArrayList();
		List<WebElement>dep=driver.findElements(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div"));
		System.out.println("number of dates are:"+dep.size());
		for(int i=0;i<dep.size();i++) {
			WebElement ele=dep.get(i);
			String text=ele.getText();
			actual.add(text);
			System.out.println("before selecting dates are:"+text);
		}
		
		List temp=new ArrayList();
		temp.addAll(actual);
		Collections.sort(temp);
		System.out.println("ascending order:"+temp);
		Assert.assertEquals(actual, temp);
	}
	
	@Test(priority=4,description="dynamic way by using iterator")
	public void webtable3() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-sm-5 alignItems')]")).click();
		List<WebElement>dep=driver.findElements(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div"));
		System.out.println("number of dates are:"+dep.size());
		Iterator<WebElement>itr=dep.iterator();
		while(itr.hasNext()) {
			WebElement ele=itr.next();
			String text=ele.getText();
			if(text.equals("20")) {
				ele.click();
				break;
			}
			System.out.println("dates are:"+text);
		}
		
	}*/
	
	@AfterMethod
	public void teardown() {
		extent.flush();
		driver.close();
	}
	
	
	
	
}
