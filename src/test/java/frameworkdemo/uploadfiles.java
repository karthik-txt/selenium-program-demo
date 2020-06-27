/**
 * 
 */
package frameworkdemo;



import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class uploadfiles {

	WebDriver driver;/*
	@Test(priority=1)
	public void uploaddemo() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		StringSelection select=new StringSelection("C:\\Users\\karthik\\Desktop\\words.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
	}
	
	@Test(priority=2)
	public void upload1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		StringSelection select=new StringSelection("C:\\Users\\karthik\\Desktop\\words.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
	}
	
	@Test(priority=3)
	public void upload2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		StringSelection select=new StringSelection("C:\\Users\\karthik\\Desktop\\words.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		
	}
	@Test(priority=4)
	public void program() throws Exception {
			System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("learn-automation");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mukesh");
			
			Robot robot=new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.quit();
	}
	*/
/*	@Test(priority=5)
	public void download() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://themegrill.com/theme-demo-file-downloads/");
		driver.findElement(By.xpath("(//a[contains(@href,'https://github.com/theme')])[3]")).click();
		Thread.sleep(4000);
	}
	
	@Test(priority=6)
	public void download1() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\kk\\frameworkdemo\\browserdriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://themegrill.com/theme-demo-file-downloads/");
		driver.findElement(By.xpath("(//a[contains(@href,'https://github.com/theme')])[3]")).click();
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}*/
	
	/*@Test(priority=7)
	public void upload3() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		StringSelection select=new StringSelection("C:\\Users\\karthik\\Desktop\\words.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		
		Robot robot=new Robot();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Test(priority=8)
	public void program1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("learn-automation");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mukesh");
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Test(priority=9)
	public void download() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://themegrill.com/theme-demo-file-downloads/");
		driver.findElement(By.xpath("(//a[text()='Download'])[3]")).click();
	}
	
	@Test(priority=9)
	public void download1() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\kk\\frameworkdemo\\browserdriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://themegrill.com/theme-demo-file-downloads/");
		driver.findElement(By.xpath("(//a[text()='Download'])[3]")).click();
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}*/
	/*@Test(priority=10)
	public void mousehover() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		Point coordinate=driver.findElement(By.xpath("//button[text()='Automation Tools']")).getLocation();
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.mouseMove(coordinate.getX(), coordinate.getY()+120);
		driver.findElement(By.xpath("//a[text()='Appium']")).click();
		
	}*/
	
	@Test(priority=11)
	public void getscreenshot() throws Exception{
		BufferedImage image=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("./screenshot/window1.png"));
	}
}
