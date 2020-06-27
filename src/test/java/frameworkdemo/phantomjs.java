/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
public class phantomjs {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/phantom.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("headless browser using phantomjs driver");
		
	}
	
	@Test
	public void headless() {
		File source=new File("F:\\kk\\frameworkdemo\\browserdriver\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path",source.getAbsolutePath() );
		driver=new PhantomJSDriver();
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
		}
			
	}
	
	
	@AfterMethod
	public void Teardown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			String temp=Helper4.getScreenshot(driver, result.getName());
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		else if(ITestResult.SUCCESS==result.getStatus()) {
			String temp=Helper4.getScreenshot(driver, result.getName());
			logger.pass("test pass", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
		driver.quit();
	}
	
	
}
