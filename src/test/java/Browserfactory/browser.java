/**
 * 
 */
package Browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author karthik
 *
 */
public class browser {

	
	public static WebDriver getbrowser(WebDriver driver,String browsername,String url) {
		if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\kk\\frameworkdemo\\browserdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
		}
		else if(browsername.equals("IE")) {
		System.setProperty("webdriver.ie.driver", "F:\\kk\\frameworkdemo\\browserdriver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		}
		driver.get(url);
		return driver;
	}
}
