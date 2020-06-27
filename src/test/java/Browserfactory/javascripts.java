/**
 * 
 */
package Browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author karthik
 *
 */
public class javascripts {

	
	public static void scroll(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
	}
	
	public static void scrollparticularelement(WebDriver driver,WebElement element) throws InterruptedException {
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
		Thread.sleep(2000);
		
	

	}

	

	
}
