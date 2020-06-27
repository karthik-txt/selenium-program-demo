/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

/**
 * @author karthik
 *
 */
public class Helper {

	public static String getscreeshot(WebDriver driver,String screenshot) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+screenshot+getcurrent()+System.currentTimeMillis()+".png";
		File destination=new File(path);
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			System.out.println("while taking the screenshot:"+e.getMessage());
		}
		return path;
	}
	
	
	public static String getcurrent() {
		DateFormat custom_date=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date=new Date();
		String dates=custom_date.format(date);
		return dates;
	}
	
	
	public static void highlighhelement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')",element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','background:white;border:2px white;')",element);
	}
}
