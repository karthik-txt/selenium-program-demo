/**
 * 
 */
package frameworkdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class hiddenelementdemo {
	WebDriver driver;
	
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/hiddenelement.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		ExtentTest logger=extent.createTest("hiddenelement");
	}
	@Test(priority=1)
	public void hiddenElement() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		int x=driver.findElement(By.xpath("//input[@id='male'][@type='radio']")).getLocation().getX();
		int y=driver.findElement(By.xpath("//input[@id='male'][@type='radio']")).getLocation().getY();
		System.out.println("x co-ordinates"+x+"---y co-ordinates---"+y);
		List<WebElement>list=driver.findElements(By.xpath("//input[@id='male'][@type='radio']"));
		System.out.println("number of radio buttons are:"+list.size());
		for(WebElement ele:list) {
			int X=ele.getLocation().getX();
			if(X!=0) {
				ele.click();
				break;
			}
		}
	}
	
	@Test(priority=2)
	public void hiddenElement1() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		int x=driver.findElement(By.id("male")).getLocation().getX();
		int y=driver.findElement(By.id("male")).getLocation().getY();
		System.out.println("x co-ordinate:"+x+"-------"+"y co-ordinate:"+y);
		List<WebElement>list=driver.findElements(By.id("male"));
		System.out.println("number of radio buttons are:"+list.size());
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			int X=ele.getLocation().getX();
			if(X!=0) {
				ele.click();
				break;
			}
		}
	}
}
