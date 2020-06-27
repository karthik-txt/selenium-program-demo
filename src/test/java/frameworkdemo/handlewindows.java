/**
 * 
 */
package frameworkdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class handlewindows {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeClass
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/handlewindows.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("reportsetup");
	}
	
	@BeforeMethod
	public void browsersetup() {
		logger.createNode("browser setup");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	}
	
	@Test(priority=1)
	public void handlingwindow() {
		logger.createNode("handling window");
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindows.size());
		for(String child:allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is:"+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window id:"+driver.getTitle());
		driver.close();
	}
	
	@Test(priority=2)
	public void handlingwindow2() throws InterruptedException {
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindow.size());
		for(String child:allwindow) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title:"+driver.getTitle());
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
				//div[@class='aajZCb']//li/div/descendant::span[text()='selenium']/b[text()='hq']
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='aajZCb']//span[text()='selenium']/b[text()='hq']")).click();
				Thread.sleep(2000);
				driver.close();
		}
	}
	
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(priority=3)
	public void handlingwindow3() throws InterruptedException {
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindows.size());
		ArrayList<String>tabs=new ArrayList<String>(allwindows);
		driver.switchTo().window(tabs.get(1));
		System.out.println("child window title is:"+driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@Test(priority=4)
	public void handlingwindow4() throws InterruptedException {
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindow.size());
		Iterator<String>itr=allwindow.iterator();
		while(itr.hasNext()) {
			String child=itr.next();
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is:"+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@Test(priority=5)
	public void handlingwindow5() throws InterruptedException {
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		Set<String>allwindow=driver.getWindowHandles();
		Object[]a=allwindow.toArray();
		driver.switchTo().window(a[1].toString());
		System.out.println("child window id:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(a[0].toString());
		System.out.println("parent window id:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@Test(priority=5)
	public void handlingwindow6() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("number of window are:"+allwindow.size());
		Iterator<String>tabs=allwindow.iterator();
		String parent=tabs.next();
		System.out.println("parent window id:"+parent);
		String child=tabs.next();
		System.out.println("child window id:"+child);
		driver.switchTo().window(child);
		System.out.println("child window title is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(priority=7)
	public void handlingwindow7() throws InterruptedException {
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		List<WebElement>list=driver.findElements(By.xpath("//a[text()=' Click this link to start new Tab ']"));
		System.out.println("number of links:"+list.size());
		for(WebElement ele:list) {
			String text=ele.getText();
			System.out.println(text);
			ele.click();
		}
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindow.size());
		for(String child:allwindow) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window titles are:"+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
	}
	
	
	@AfterClass
	public void quit() {
	extent.flush();
	driver.close();
}
}
