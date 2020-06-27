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
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

/**
 * @author karthik
 *
 */
public class Helper4 {

	
	public static String getScreenshot(WebDriver driver,String screenshot) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+screenshot+System.currentTimeMillis()+".png";
		try {
			FileHandler.copy(source, new File(path));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return path;
	}
}
