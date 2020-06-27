/**
 * 
 */
package frameworkdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
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
public class dropdown {

	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	@BeforeClass
	public void report() {
		ExtentHtmlReporter extent=new ExtentHtmlReporter("./reports/dropdown.html");
		report=new ExtentReports();
		report.attachReporter(extent);
		logger=report.createTest("dropdown");
		logger.info("report setup started");
		
	}
	@BeforeMethod
	public void browsersetup() {
		logger.info("setting up the browser");
		System.setProperty("webdriver.chrome.driver", "./browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		logger.info("application started");
	}
	@Test
	public void dropdowndemo() throws InterruptedException {
		logger.info("executing the test script");
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele);
		Helper.highlighhelement(driver, ele);
		month.selectByVisibleText("Jun");
		Thread.sleep(2000);
		Helper.highlighhelement(driver, ele);
		month.selectByVisibleText("Jul");
	}
	
	@AfterMethod
	public void screenshoot(ITestResult result) throws IOException {
		logger.info("trying to take the screenshot");
		if(ITestResult.FAILURE==result.getStatus()) {
			String temp=Helper.getscreeshot(driver, result.getName());
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}else if(ITestResult.SUCCESS==result.getStatus()) {
			String temp=Helper.getscreeshot(driver, result.getName());
			logger.pass("test case pass", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		report.flush();
		driver.quit();
		
	}
}
