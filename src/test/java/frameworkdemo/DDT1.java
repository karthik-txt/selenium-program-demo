/**
 * 
 */
package frameworkdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class DDT1 {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeClass
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/dd1.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("data driven");
	}
	
	@BeforeMethod
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}
	
	@Test(dataProvider="actiTimelogin")
	public void datadriven(String name,String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
	
	
	@DataProvider(name="actiTimelogin")
	public Object[][] getdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manager1";
		
		data[1][0]="admin";
		data[1][1]="manager";
		
		data[2][0]="admin12";
		data[2][1]="manager12";
		
		
		return data;
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			String temp=Helper2.getscreenshot(driver, result.getName());
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
	}
	
	@AfterClass
	public void close() {
		extent.flush();
		driver.close();
	}
}
