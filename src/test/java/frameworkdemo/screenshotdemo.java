/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class screenshotdemo {

	WebDriver driver;
	
	/*@Test
	public void screenshot() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Helper6.getscreenshot(driver, "homepage");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("arjun");
		Helper6.getscreenshot(driver, "fn");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("reddy");
		Helper6.getscreenshot(driver, "ln");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("8934984781");
		Helper6.getscreenshot(driver, "phoneno");
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("arjun123@");
		Helper6.getscreenshot(driver, "pwd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='u_0_7']")).click();
		Helper6.getscreenshot(driver, "gender");
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		Helper6.getscreenshot(driver, "registrationform");
	}*/
	
	/*@Test
	public void screenshot1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		screenshot(driver, "webpage");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		screenshot(driver, "uname");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		screenshot(driver, "pwd");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		screenshot(driver, "login_button");
		screenshot(driver, "homepage");
		driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
		screenshot(driver, "Welcome Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		screenshot(driver, "homepage1");
	}
	
	public static void screenshot(WebDriver driver,String screenshot) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./screenshot/"+screenshot+".png"));
		} catch (IOException e) {
			System.out.println("screenshot captured:"+e.getMessage());
		}
	}*/
	
	@Test(priority=1)
	public void screenshot2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Helper7.getscreenshot(driver, "loginpage1");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Helper7.getscreenshot(driver, "username1");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Helper7.getscreenshot(driver, "pwd1");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Helper7.getscreenshot(driver, "login1");
		Helper7.getscreenshot(driver, "homepage1");
		driver.findElement(By.xpath("//a[text()='Welkom Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Uitloggen']")).click();
		Helper7.getscreenshot(driver, "logout1");
	}
}
