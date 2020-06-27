/**
 * 
 */
package frameworkdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Function;

/**
 * @author karthik
 *
 */
public class verifypagetitle {

	WebDriver driver;
	/*@Test(priority=1)
	public void pagetitle() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actual_title=driver.getTitle();
		System.out.println("title is :"+actual_title);
		String expected_title="Orange";
		//Assert.assertEquals(actual_title, expected_title);
		
		//Assert.assertTrue(actual_title.contains("Orange"));
		if(actual_title.contains(expected_title)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		driver.quit();
		
	}*/
	/*@Test(priority=2)
	public void verifyerrormessage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		String actual_text=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getAttribute("innerHTML");
		System.out.println("text is:"+actual_text);
		String expected_text="Enter an email or phone number is";
		Assert.assertEquals(actual_text, expected_text);
		Assert.assertTrue(actual_text.contains("phone number"));
		
		driver.quit();
		
	}*/
	
	/*@Test(priority=3)
	public void handlealert() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
			String actual_text=driver.switchTo().alert().getText();
			System.out.println("actual text is:"+actual_text);
			driver.switchTo().alert().accept();
			String expected_text="Press a button! is";
			Assert.assertEquals(actual_text, expected_text);
			Assert.assertTrue(actual_text.contains("button"));
			Thread.sleep(2000);
	}*/
	
/*	@Test(priority=4)
	public void waits() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		boolean status=ele.isDisplayed();
		if(status) {
			System.out.println("WebElement is displayed");
		}else {
			System.out.println("WebElement is not displayed");
		}
		
	}*/
	
	/*@Test(priority=5)
	public void waits1() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
		.withTimeout(30,TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		
		WebElement ele=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//p[text()='WebDriver']"));
			}
		});
		System.out.println("element is displayed?"+ele.isDisplayed());
		

	}*/
	
	
	@Test(priority=6)
	public void waits2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement ele=wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				WebElement ele1=driver.findElement(By.xpath("//p[@id='demo']"));
				String text=ele1.getAttribute("innerHTML");
				if(text.equalsIgnoreCase("WebDriver")) {
					return ele1;
				}else{
					System.out.println("text which is comming on screen is:"+ele1.getAttribute("innerhtml"));
					return null;
				}
			}
		});
		System.out.println("element is displayed:"+ele.isDisplayed());
	}
	
	@Test(priority=7)
	public void waits3() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
		.withTimeout(30,TimeUnit.SECONDS)
		.pollingEvery(5,TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		WebElement ele=	wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//p[text()='WebDriver']"));
			}
		});
		
		boolean status=ele.isDisplayed();
		if(status) {
			System.out.println("element is displayed");
		}else {
			System.out.println("element is not displayed");
		}
		
	}
	
	@Test(priority=8)
	public void wait4() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
			WebElement ele=wait.until(new Function<WebDriver,WebElement>(){
			
				public WebElement apply(WebDriver driver) {
					WebElement ele1=driver.findElement(By.xpath("//p[@id='demo']"));
					String text=ele1.getAttribute("innerHTML");
					if(text.equalsIgnoreCase("WebDriver")) {
						return ele1;
					}else {
						System.out.println("text which is comming on screen is:"+ele1.getAttribute("innerHTML"));
						return null;
					}
				}
		});
			System.out.println("element is displayed?"+ele);
			
	}

	
}
