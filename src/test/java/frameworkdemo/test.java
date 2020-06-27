/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class test extends Baseclass2{
	@Test(priority=1,description="this will perform valid login")
	public void test1() throws InterruptedException {
		Reporter.log("testcase1 started", true);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Reporter.log("login button clicked", true);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	@Test(priority=2,description="this will perform invalid login")
	public void test2() throws InterruptedException {
		Reporter.log("testcase1 started", true);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin12");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Reporter.log("login button clicked", true);
	}
}
