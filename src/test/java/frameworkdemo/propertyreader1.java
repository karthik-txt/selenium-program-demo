/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;

/**
 * @author karthik
 *
 */
public class propertyreader1 {

	WebDriver driver;
	configreader read;
	@BeforeTest
	public void confiproperty() {
		read=new configreader();
		System.out.println("property class loaded");
	}
	@Test
	public void readproperty() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", read.getbrowser());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(read.getappurl());
		driver.findElement(By.xpath(read.getuname())).sendKeys("Admin");
		driver.findElement(By.xpath(read.getpwd())).sendKeys("admin123");
		driver.findElement(By.xpath(read.getbutton())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.getleavelist())).click();
		driver.findElement(By.xpath(read.getfromdate())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.selectfromdate())).click();
		driver.findElement(By.xpath(read.gettodate())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.selecttodate())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.getleavestatus())).click();
		driver.findElement(By.xpath(read.getename())).sendKeys("r");
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.getselectename())).click();
		WebElement sub=driver.findElement(By.xpath(read.getsubunit()));
		Select s=new Select(sub);
		s.selectByValue("6");
		driver.findElement(By.xpath(read.getpastemp())).click();
		driver.findElement(By.xpath(read.getsearch())).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath(read.getsave()));
		
		javascript.scroll(driver, ele);
		
		driver.findElement(By.xpath(read.getsave())).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(read.getadmin())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.getlogout())).click();
		
	}
}
