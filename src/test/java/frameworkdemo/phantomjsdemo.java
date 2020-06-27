/**
 * 
 */
package frameworkdemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class phantomjsdemo {

	WebDriver driver;
	@Test
	public void phantomjs() throws InterruptedException {
		System.setProperty("phantomjs.binary.path", "F:\\kk\\frameworkdemo\\browserdriver\\phantomjs.exe");
		driver=new PhantomJSDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='HTML, CSS']")).click();
		Helper5.getscreenshot(driver, "bootstrap1");
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li"));
		System.out.println("number of dropdowns are:"+list.size());
		Iterator<WebElement>itr=list.iterator();
		while(itr.hasNext()){
			WebElement ele=itr.next();
			String text=ele.getText();
			if(text.equals("MySQL")) {
				ele.click();
				Helper5.getscreenshot(driver, "bootstrap2");
				break;
			}
			System.out.println(text);
		}
	}
	

}
