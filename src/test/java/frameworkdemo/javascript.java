/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author karthik
 *
 */
public class javascript {

	
	public static void scroll(WebDriver driver,WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Thread.sleep(2000);
	}
}
