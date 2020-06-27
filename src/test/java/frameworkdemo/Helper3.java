/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * @author karthik
 *
 */
public class Helper3 {
	public static String getscreenshot(WebDriver driver,String screenshot) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+screenshot+System.currentTimeMillis()+".jpg";
		try {
			FileHandler.copy(source, new File(path));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return path;
	}
}
