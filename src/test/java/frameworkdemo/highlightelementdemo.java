/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class highlightelementdemo {

	WebDriver driver;
		/*@Test(priority=1)
	public void highlightelement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		highlight.highlights(driver, username);
		username.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		highlight.highlights(driver, pwd);
		pwd.sendKeys("admin123");
		WebElement login_button=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		highlight.highlights(driver, login_button);
		login_button.click();
		
		WebElement admin=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		highlight.highlights(driver, admin);
		admin.click();
		
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		highlight.highlights(driver, logout);
		logout.click();
		
	}*/
		
		@Test(priority=2)
		public void highlightelement1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
			highlights(driver, uname);
			uname.sendKeys("admin");
			WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
			highlights(driver, pwd);
			pwd.sendKeys("manager");
			WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
			highlights(driver, login);
			login.click();
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
			highlights(driver, logout);
			logout.click();
					
		}
		
		public static void highlights(WebDriver driver,WebElement element) throws InterruptedException {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')",element);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style','background:white;border:2px solid white;')",element);
		}
}
