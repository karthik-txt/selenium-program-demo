/**
 * 
 */
package Browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * @author karthik
 *
 */
public class javascript {

	
	public static void scroll(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scoll(0,500)");
		Thread.sleep(2000);
		
	}
	
	public static void scroll1(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scoll(900)");
		Thread.sleep(2000);
		
	}
	public static void scroll3(WebDriver driver,By xpath) throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",driver.findElement(xpath));
		Thread.sleep(2000);
		
	}

	
}
