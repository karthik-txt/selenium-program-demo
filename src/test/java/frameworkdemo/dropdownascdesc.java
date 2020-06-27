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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class dropdownascdesc {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeClass
	public void report() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/drowndownlatest.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("validation");
	}
	
	@BeforeMethod
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void dropdown() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		List actual_list=new ArrayList();
		List<WebElement>list=month.getOptions();
		System.out.println("number of months are:"+list.size());
		for(WebElement ele1:list) {
			String text=ele1.getAttribute("innerHTML");
			System.out.println(text);
			actual_list.add(text);
	}
		List temp=new ArrayList();
		temp.addAll(actual_list);
		Collections.sort(temp);
		System.out.println(temp);
		Assert.assertEquals(actual_list, temp, "not valid");
	}
	
	@Test(priority=2)
	public void dropdown1() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		List actual_list=new ArrayList();
		List<WebElement>list=month.getOptions();
		System.out.println("number of months are:"+list.size());
		for(WebElement ele1:list) {
			String text=ele1.getAttribute("innerHTML");
			System.out.println("month names are:"+text);
			actual_list.add(text);
		}
		List temp=new ArrayList();
		temp.addAll(actual_list);
		Collections.sort(temp,Collections.reverseOrder());
		System.out.println("month names in ascending order:"+temp);
	}
	
	@Test(priority=3)
	public void dropdown2() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		List actual_list=new ArrayList();
		List<WebElement>list=month.getOptions();
		System.out.println("number of dropdowns are:"+list.size());
		for(WebElement ele1:list) {
			String text=ele1.getAttribute("innerHTML");
			actual_list.add(text);
		}
		System.out.println("drop down names are:"+actual_list);
		List temp=new ArrayList();
		temp.addAll(actual_list);
		Collections.sort(temp);
		System.out.println("drop down names are:"+temp);
		Assert.assertEquals(actual_list, temp);
		
	}
	
	
}
