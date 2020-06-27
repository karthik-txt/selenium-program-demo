/**
 * 
 */
package frameworkdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
public class bootstrapdropdowndemo {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/bootstrapdropdown.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("bootstrapdropdown");
	}
	@Test(priority=1)
	public void bootstrapdropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[text()='HTML, CSS']")).click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li"));
		System.out.println("number of dropdowns are:"+list.size());
		for(WebElement ele:list) {
			String text=ele.getText();
			if(text.equals("MySQL")) {
				ele.click();
				break;
			}
			System.out.println("dropdown names are:"+text);
		}
}
	
	@Test(priority=2)
	public void bootstrapdropdown1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[text()='HTML, CSS']")).click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li"));
		System.out.println("number of dropdowns are;"+list.size());
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String text=ele.getText();
			System.out.println("dropdowns are:"+text);
		}
	}
	
	@Test(priority=3)
	public void bootstrapdropdown2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[text()='HTML, CSS']")).click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li"));
		System.out.println("number of dropdowns are:"+list.size());
		List actual_list=new ArrayList();
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String text=ele.getText();
			System.out.println(text);
			actual_list.add(text);
		}
		
		List temp=new ArrayList();
		temp.addAll(actual_list);
		Collections.sort(temp);
		System.out.println("acending order:"+temp);
		Assert.assertEquals(actual_list, temp);
	}
	
	@Test(priority=4)
	public void bootstrapdropdown3() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[text()='HTML, CSS']")).click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li"));
		System.out.println("number of dropdowns are:"+list.size());
		Iterator<WebElement>itr=list.iterator();
		while(itr.hasNext()){
			WebElement ele=itr.next();
			String text=ele.getText();
			if(text.equals("MySQL")) {
				ele.click();
				break;
			}
			System.out.println(text);
		}
	}
	
	@AfterMethod
	public void quit() {
		extent.flush();
		driver.close();
	}
}
	