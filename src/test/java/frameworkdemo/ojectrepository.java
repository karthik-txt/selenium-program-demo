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
public class ojectrepository {

	WebDriver driver;
	@Test
	public void readojects() throws InterruptedException {
		readproperty read=new readproperty();
		System.setProperty("webdriver.chrome.driver", read.getbrowserpath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(read.getAppurl());
		driver.findElement(By.xpath(read.getuname())).sendKeys("Admin");
		driver.findElement(By.xpath(read.getpwd())).sendKeys("admin123");
		driver.findElement(By.xpath(read.getbutton())).click();
		driver.findElement(By.xpath(read.getadmin())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.getlogout())).click();
	}
}
