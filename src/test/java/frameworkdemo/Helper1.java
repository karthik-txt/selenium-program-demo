/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * @author karthik
 *
 */
public class Helper1 {

	public static String getscreenshot(WebDriver driver,String screenshot) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+screenshot+getcurrenttime()+System.currentTimeMillis()+".jpg";
		try {
			FileHandler.copy(source, new File(path));
		} catch (IOException e) {
			System.out.println("screenshot captured:"+e.getMessage());
		}
		return path;
	}
	
	
	public static String getcurrenttime() {
		DateFormat cust_date=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date=new Date();
		return cust_date.format(date);
	}
}
