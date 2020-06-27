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
public class scrolldemo {

	WebDriver driver;
	
	@Test(priority=1)
	public void scroll() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		((JavascriptExecutor)driver).executeScript("scroll(0,1400)");
		driver.findElement(By.xpath("//img[@src='/images/sponsors/testbirds.png']")).click();
	}
	
	@Test(priority=2)
	public void scrollelement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//div[@class='support-selenium']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		System.out.println("text is:"+ele.getText());
	}
}
