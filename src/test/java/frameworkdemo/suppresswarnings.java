/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class suppresswarnings {

	WebDriver driver;
	@Test(priority=1)
	public void warning1() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("Title is:"+driver.getTitle());
		driver.quit();
	}
	
	
	@Test(priority=2)
	public void warning2() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("Title is:"+driver.getTitle());
		driver.quit();
		
	}
	
}
