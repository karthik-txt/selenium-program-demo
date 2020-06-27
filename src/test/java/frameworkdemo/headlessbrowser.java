/**
 * 
 */
package frameworkdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class headlessbrowser {

	HtmlUnitDriver driver;
	
	@Test(priority=1)
	public void headlessbrowser1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\karthik\\Learn\\drivers\\chromedriver.exe");
		driver=new HtmlUnitDriver();
			driver.get("https://www.goibibo.com/");
			driver.findElement(By.xpath("//div[contains(@class,'dF whiteBg col-sm-5 alignItems')]")).click();
			List<WebElement>dep=driver.findElements(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div"));
			System.out.println("number of dates are:"+dep.size());
			for(int i=0;i<dep.size();i++) {
				WebElement ele=dep.get(i);
				String text=ele.getText();
				if(text.equals("13")) {
					ele.click();
					break;
				}
				System.out.println("After selecting dates are:"+text);
			}
}
	
	@Test(priority=2)
	public void checkbox() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new HtmlUnitDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>list=driver.findElements(By.xpath("//input[@name='lang'][@type='checkbox']"));
		System.out.println("number of checkbox:"+list.size());
		for(WebElement ele:list) {
			String text=ele.getAttribute("id");
			if(text.equals("sing")) {
				ele.click();
				break;
			}
			System.out.println("names of checkbox are:"+text);
		}
	}
}
