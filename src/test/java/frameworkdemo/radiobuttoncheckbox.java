/**
 * 
 */
package frameworkdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author karthik
 *
 */
public class radiobuttoncheckbox {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/bootstrapdropdown.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("radiobutton&checkbox");
	}
	@Test(priority=1)
	public void radiobutton() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		System.out.println("number of radiobuttons are:"+radio.size());
		for(WebElement ele:radio) {
			String text=ele.getAttribute("value");
			System.out.println("radiobuttons are:"+text);
			if(text.equals("PYTHON")) {
				ele.click();
				break;
			}
			System.out.println("radiobuttons are:"+text);
		}
	}
	
	@Test(priority=2)
	public void  radiobutton1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		System.out.println("number of radiobuttons are:"+radio.size());
		for(int i=0;i<radio.size();i++) {
			WebElement ele=radio.get(i);
			String text=ele.getAttribute("value");
			System.out.println("radio buttons are:"+text);
			Thread.sleep(2000);
			ele.click();
		}
	}
	
	@Test(priority=3)
	public void  radiobutton2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		System.out.println("number of radiobuttons are:"+radio.size());
		List actual_list=new ArrayList();
			for(WebElement ele:radio) {
				String text=ele.getAttribute("value");
				System.out.println("radio buttons are;"+text);
				actual_list.add(text);
			}
			List temp=new ArrayList();
			temp.addAll(actual_list);
			Collections.sort(temp);
			System.out.println("radio buttons in ascending;"+temp);
			Assert.assertEquals(actual_list, temp);
			
		}
	


	@Test(priority=4)
	public void radiobutton3() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		System.out.println("number of radiobuttons are:"+radio.size());
		Iterator<WebElement>itr=radio.iterator();
		while(itr.hasNext()) {
			WebElement ele=itr.next();
			String text=ele.getAttribute("value");
			System.out.println(text);
			ele.click();
		}
	}
	
	
	@Test(priority=5)
	public void checkbox() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
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
	
	
	@Test(priority=6)
	public void checkbox1() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>list=driver.findElements(By.xpath("//input[@name='lang'][@type='checkbox']"));
		System.out.println("number of checkbox:"+list.size());
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String text=ele.getAttribute("id");
			System.out.println(text);
			ele.click();
		}
	}
	
	@Test(priority=7)
	public void checkbox2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>list=driver.findElements(By.xpath("//input[@name='lang'][@type='checkbox']"));
		System.out.println("number of checkbox:"+list.size());
		List actual_list=new ArrayList();
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String text=ele.getAttribute("id");
			System.out.println("checkbox are;"+text);
			actual_list.add(text);
		}
		List temp=new ArrayList();
		temp.addAll(actual_list);
		Collections.sort(temp);
		System.out.println("acending:"+temp);
		Assert.assertEquals(actual_list, temp);
	}
	
	
	@Test(priority=8)
	public void checkbox3() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>list=driver.findElements(By.xpath("//input[@name='lang'][@type='checkbox']"));
		System.out.println("number of checkbox:"+list.size());
		Iterator<WebElement>itr=list.iterator();
		while(itr.hasNext()){
			WebElement ele=itr.next();
			String text=ele.getAttribute("id");
			if(text.equals("code")) {
				ele.click();
				break;
			}
		}
	}
	
	@AfterMethod
	public void quit() {
		extent.flush();
		driver.close();
	}
}


	

