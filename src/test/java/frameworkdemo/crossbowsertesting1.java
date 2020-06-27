/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class crossbowsertesting1 {

	WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void crossbrowser(String Browser) {
		if(Browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\kk\\frameworkdemo\\browserdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(Browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "F:\\kk\\frameworkdemo\\browserdriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.close();
	}
}
