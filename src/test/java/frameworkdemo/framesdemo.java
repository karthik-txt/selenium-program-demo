/**
 * 
 */
package frameworkdemo;

import java.util.List;

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
public class framesdemo {

	WebDriver driver;
	
	/*@Test(priority=1)
	public void handlingframes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/javaprogram/frames.html");
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames are:"+list.size());
		driver.switchTo().frame("w3c");
		driver.findElement(By.xpath("//a[text()='Python']")).click();
		WebElement ele=driver.findElement(By.xpath("//a[text()='Python Introduction']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(2000);
		ele.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("seleinum_news");
		WebElement ele1=driver.findElement(By.xpath("//img[@src='/images/sponsors/browserstack.png']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele1);
		Thread.sleep(2000);
		ele1.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("selenium");
		driver.findElement(By.xpath("//div[contains(@class,'Button__Block-sc-1c0eo6i-0 bhCgZe ModalC')]")).click();
		
	}
	
	@Test(priority=2)
	public void handlingframes1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/javaprogram/frames.html");
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames are:"+list.size());
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='https://www.javatpoint.com/']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//a[text()='Python']")).click();
		WebElement ele=driver.findElement(By.xpath("//a[text()='Python Introduction']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(2000);
		ele.click();
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//iframe[@src='https://selenium.dev/']"));
		driver.switchTo().frame(frame2);
		WebElement ele1=driver.findElement(By.xpath("//img[@src='/images/sponsors/browserstack.png']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele1);
		Thread.sleep(2000);
		ele1.click();
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//iframe[@src='http://www.naveenautomationlabs.com/']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//div[contains(@class,'Button__Block-sc-1c0eo6i-0 bhCgZe ModalC')]")).click();
		
	}*/
	
	/*@Test(priority=3)
	public void handlingframe2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/javaprogram/Frames/MainPage.html");
		driver.switchTo().frame(0);
		String city=driver.findElement(By.xpath("//table[@id='table2']//td")).getText();
		String Description=driver.findElement(By.xpath("//table[@id='table2']/tbody//ol")).getText();
		System.out.println(city+"---------"+Description);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='un_text_id1']")).sendKeys("arjunreddy");
		driver.findElement(By.xpath("//input[@id='pwd_text_id1']")).sendKeys("arjun123@");
		driver.findElement(By.xpath("//input[@id='ok_btn_id1']")).click();
		driver.close();
	}*/
	
	/*@Test(priority=4)
	public void handlingframe3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/javaprogram/Frames/MainPage.html");
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames are:"+list.size());
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='un_text_id1']")).sendKeys("arjunreddy");
		driver.findElement(By.xpath("//input[@id='pwd_text_id1']")).sendKeys("arjun123@");
		driver.findElement(By.xpath("//input[@id='ok_btn_id1']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String city=driver.findElement(By.xpath("//table[@id='table2']//td")).getText();
		String Description=driver.findElement(By.xpath("//table[@id='table2']/tbody//ol")).getText();
		System.out.println(city+"---------"+Description);
		driver.close();
	}*/
	@Test(priority=5)
	public void handlingframe4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/javaprogram/Frames/MainPage.html");
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames are:"+list.size());
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='Page2.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@id='un_text_id1']")).sendKeys("arjunreddy");
		driver.findElement(By.xpath("//input[@id='pwd_text_id1']")).sendKeys("arjun123@");
		driver.findElement(By.xpath("//input[@id='ok_btn_id1']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame2=driver.findElement(By.xpath("//iframe[@src='Page1.html']"));
		driver.switchTo().frame(frame2);
		String city=driver.findElement(By.xpath("//table[@id='table2']//td")).getText();
		String Description=driver.findElement(By.xpath("//table[@id='table2']/tbody//ol")).getText();
		System.out.println(city+"---------"+Description);
		driver.close();
	
	}
	
	
}
