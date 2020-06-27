/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author karthik
 *
 */
public class Helper5 {

	
	public static void getscreenshot(WebDriver driver,String screenshot) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./screenshot/"+screenshot+".png"));
		} catch (IOException e) {
			System.out.println("while taking screenshot:"+e.getMessage());
		}
	}
}
