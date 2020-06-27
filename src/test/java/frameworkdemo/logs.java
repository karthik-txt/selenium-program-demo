/**
 * 
 */
package frameworkdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class logs {

	WebDriver driver;
	@Test(priority=1,enabled=true)
	public void logproperty() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Logger log=Logger.getLogger("logs");
		PropertyConfigurator.configure("Log4j.properties");
		log.info("Applicaton started");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		log.info("username Entered");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		log.info("Password entered");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		log.info("login button clicked");
	}
	@Test(priority=2,enabled=true)
	public void log1property() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Logger log=Logger.getLogger("logs");
		PropertyConfigurator.configure("Log4j.properties");
		log.info("Enter int ActiTime website");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		log.info("Entered username");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		log.info("Entered password");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		log.info("login button clicked");
		log.info("Entered into homepage");
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		log.info("logout button clicked");
		log.info("Enter intp loginpage");
		
	}
	
}
