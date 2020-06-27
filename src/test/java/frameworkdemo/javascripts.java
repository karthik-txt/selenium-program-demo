/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class javascripts {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/javascriptscripts.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("test started");
	}
	@Test(priority=1)
	public void javascript() throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("alert('hello')");
		//js.executeScript("prompt('welcome to my world')");
		js.executeScript("confirm('welcome')");
		driver.quit();
	
	}
	
	@Test(priority=2)
	public void javascript1() throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Random@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('persistent').click()");
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]"));
		js.executeScript("arguments[0].click()", ele);
		
		}
	@Test(priority=3)
	public void TypeEvent() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		WebElement gmail=driver.findElement(By.xpath("//input[@name='username']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='Random@gmail.com'", gmail);
		js.executeScript("arguments[0].value=arguments[1]", gmail,"Random@gmail.com");
		
	}
	
	@AfterMethod
	public void quit() {
		extent.flush();
	
	}
}
