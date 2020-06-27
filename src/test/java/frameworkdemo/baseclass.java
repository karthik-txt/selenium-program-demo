/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class baseclass {

	WebDriver driver;
	@BeforeClass
	public void browsersetup() {
		Reporter.log("browser started", true);
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("Application started", true);
	}
	@Test(priority=1)
	public void test1() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Reporter.log("click the login button",true);
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=2)
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Reporter.log("click the login button",true);
		
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
		Reporter.log("Browser session end",true);
	}
}
