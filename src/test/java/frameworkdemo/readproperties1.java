/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class readproperties1 {

	WebDriver driver;
	Properties pro;
	@Test
	public void readconfigproperty() throws InterruptedException {
		File source=new File("./configuration/config1.property");
		System.out.println("property file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("Appurl"));
		driver.findElement(By.xpath(pro.getProperty("com.username.xpath"))).sendKeys("Admin");
		driver.findElement(By.xpath(pro.getProperty("com.password.xpath"))).sendKeys("admin123");
		driver.findElement(By.xpath(pro.getProperty("com.login.xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("com.leavelist.xpath"))).click();
		driver.findElement(By.xpath(pro.getProperty("com.calfromdate.xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("com.selecalfromdate.xpath"))).click();
		driver.findElement(By.xpath(pro.getProperty("com.caltodate.xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("com.selecaltodate.xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("com.leavestatus.xpath"))).click();
		driver.findElement(By.xpath(pro.getProperty("com.ename.xpath"))).sendKeys("r");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("com.seleename.xpath"))).click();
		WebElement sub=driver.findElement(By.xpath(pro.getProperty("com.subunit.xpath")));
		Select s=new Select(sub);
		s.selectByValue("6");
		driver.findElement(By.xpath(pro.getProperty("com.pastempl.xpath"))).click();
		driver.findElement(By.xpath(pro.getProperty("com.search.xpath"))).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath(pro.getProperty("com.save.xpath")));
		
		javascript.scroll(driver, ele);
		
		driver.findElement(By.xpath(pro.getProperty("com.save.xpath"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(pro.getProperty("com.admin.xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("com.logout.xpath"))).click();
		
		
		
	}
}
