/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class login1 {
	
	WebDriver driver;
	@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
}
