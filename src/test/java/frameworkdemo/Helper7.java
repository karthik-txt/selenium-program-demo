/**
 * 
 */
package frameworkdemo;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

/**
 * @author karthik
 *
 */
public class Helper7 {

	public static void getscreenshot(WebDriver driver,String name) throws Exception {
		BufferedImage image=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("./screenshot/"+name+".png"));
	}
}
