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
public class highlight {

	public static void highlights(WebDriver driver,WebElement element) throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')",element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','background:white;border:2px solid white;')",element);
	}
}
