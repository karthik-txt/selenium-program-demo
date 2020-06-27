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

import com.beust.jcommander.Parameter;

/**
 * @author karthik
 *
 */
public class crossbrowsertesting {

	
	WebDriver driver;
	
	@Test
	@Parameters({"Browser","username","password"})
	public void crossbrowser(String Browser,String username,String password) {	
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
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}
	
}
