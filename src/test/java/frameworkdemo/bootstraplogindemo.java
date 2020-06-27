/**
 * 
 */
package frameworkdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class bootstraplogindemo {

	
	WebDriver driver;
	
	/*@Test(priority=1)
	public void bootstraplogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("9848022338");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popContent']/a")).click();
		driver.close();
	}*/
	
	/*@Test(priority=2)
	public void bootstraplogin1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='authiframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("9848022338");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popContent']/a")).click();
		driver.close();
	}
	*/
	@Test(priority=3)
	public void bootstraplogin2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
		driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();
		driver.findElement(By.xpath("//div[@class='modal-body']/input[@type='text']")).sendKeys("mukesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-body']/input[@type='password']")).sendKeys("otwani");
		driver.findElement(By.xpath("//div[@class='modal-body']/input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
	}
	
	
	
	
	
}
