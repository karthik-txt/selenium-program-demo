/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author karthik
 *
 */
public class Baseclass2 {

	public WebDriver driver;
	@BeforeClass
	public void browsersetup() {
		Reporter.log("Browser started launching", true);
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@AfterClass
	public void close() throws InterruptedException {
		Reporter.log("testcases ended", true);
		Thread.sleep(3000);
		driver.close();
		Reporter.log("closing hte browsert", true);
	}
}
