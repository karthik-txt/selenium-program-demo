/**
 * 
 */
package frameworkdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
public class datadrivenframework1 {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeClass
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/datadrivenframework.html");
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
	
	@Test(dataProvider="login")
	public void login(String name,String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		String url=driver.getCurrentUrl();
		System.out.println("url is:"+url);
		Assert.assertTrue(url.contains("login.do"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
	
	@DataProvider(name="login")
	public Object[][] datas(){
		excellreader reader=new excellreader("F:\\kk\\frameworkdemo\\testdata\\data1.xlsx");
		int row=reader.getrow(0);
		System.out.println("number of rows are:"+row);
		Object[][] data=new Object[row][2];
		for(int i=0;i<row;i++) {
			
			data[i][0]=reader.getdata(0, i, 0);
			data[i][1]=reader.getdata(0, i, 1);
		}
		return data;
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			String temp=Helper3.getscreenshot(driver, result.getName());
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
	}
	@AfterClass
	public void quit() {
		driver.quit();
	}
}
