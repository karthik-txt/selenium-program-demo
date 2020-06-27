/**
 * 
 */
package frameworkdemo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class dropdownprogram {

	WebDriver driver;
	ExtentTest logger;
	ExtentReports extent;
	@BeforeClass
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/dropdownpgm.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("test case of dropdown");
		logger.info("setting up the report");
	}
	
	@BeforeMethod
	public void browsersetup() {
		logger.info("setting the browser setup");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("title is:"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("book"));
		logger.info("title verified");
	}
	
	@Test(priority=1)
	public void dropdown1() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		month.selectByIndex(2);
		Thread.sleep(2000);
		month.selectByValue("4");
		Thread.sleep(2000);
		month.selectByVisibleText("Oct");
	}
	@Test(priority=2)
	public void validatingdropdown() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		WebElement before_month=month.getFirstSelectedOption();
		System.out.println("before selecting the month:"+before_month.getText());
		
		month.selectByVisibleText("Jul");
		
		WebElement After_month=month.getFirstSelectedOption();
		System.out.println("After Selecting the month:"+After_month.getText());
	}
	@Test(priority=3)
	public void dropdownlist() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		List<WebElement>list=month.getOptions();
		System.out.println("total months are:"+list.size());
		for(WebElement ele1:list) {
			String text=ele1.getAttribute("value");
			System.out.println("month names are:"+text);
		}
	}
	@AfterMethod
	public void teardown(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			String temp=Helper1.getscreenshot(driver, result.getName());
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}else if(ITestResult.SUCCESS==result.getStatus()) {
			String temp=Helper1.getscreenshot(driver, result.getName());
			logger.pass("testcase pass",MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
		driver.quit();
	}
	
	
	
}
