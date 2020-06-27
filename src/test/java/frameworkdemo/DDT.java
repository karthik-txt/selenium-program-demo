/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class DDT {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/dd.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("Datadriven");
		
	}
	
	@Test(dataProvider="orangehrmlive")
	public void datdriven(String name,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@id,'menu_admin_viewA')]")).isDisplayed());
		driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	
	@DataProvider(name="orangehrmlive")
	public Object[][] getdata(){
		Object[][]data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="Admin123";
		data[2][1]="Admin123";
		return data;
	}
	
	@AfterMethod
	public void quit() {
		extent.flush();
		driver.close();
	}
}
