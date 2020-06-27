package frameworkdemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class brokenlinksdemo {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeClass
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports.brokenlinks.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("handling broken links");
	}
	
	
	
/*	@Test(priority=1)
	public void handlebrokenlinks1() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("number of links are:"+links.size());
		for(int i=0;i<links.size();i++) {
			WebElement ele=links.get(i);
			String text=ele.getAttribute("href");
			System.out.println("links are:"+text);
			verifyactivelinks(text);
	
		}
		
	}
	
	
	public static void verifyactivelinks(String Linksurl)  {
		try {
			URL url=new URL(Linksurl);
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if(connection.getResponseCode()==200) {
				System.out.println(Linksurl+"------------"+connection.getResponseMessage());
			}
			if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(Linksurl+"--------------"+connection.getResponseCode()+"----------"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=2)
	public void handlebrokenlinks2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("number of links are:"+list.size());
		for(WebElement ele:list) {
			String text=ele.getAttribute("href");
			System.out.println("links are:"+text);
			verifyActivelinks(text);
		
		}
		
	}
	
	
	public static void verifyActivelinks(String Linksurl) {
		try {
			URL url=new URL(Linksurl);
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if(connection.getResponseCode()==200) {
				System.out.println(Linksurl+"------------"+connection.getResponseMessage());
			}
			if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(Linksurl+"---------"+connection.getResponseMessage()+"--------"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	*/
	
	
/*	@Test(priority=3)
	public void handlebrokenlinks3() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		List<WebElement>list=driver.findElements(By.tagName("link"));
		System.out.println("number of links are:"+list.size());
		for(WebElement ele:list) {
			
			String text=ele.getAttribute("href");
			System.out.println("number of links are:"+text);
			VerifyLinks(text);
		}
	}
		
		
		public static void VerifyLinks(String linksurl) {
			try {
				URL url=new URL(linksurl);
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				if(connection.getResponseCode()==200) {
					System.out.println(linksurl+"--------"+connection.getResponseMessage());
				}
				if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(linksurl+"-------"+connection.getResponseMessage()+"------"+HttpURLConnection.HTTP_NOT_FOUND);;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}*/
			
			
			
		@Test(priority=4)
		public void handlebrokenlinks4() {
			System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			List<WebElement>list=driver.findElements(By.tagName("a"));
			System.out.println("number of links are:"+list.size());
			List<WebElement>actual_list=new ArrayList<WebElement>();
			for(WebElement ele:list) {
				String text=ele.getAttribute("href");
				System.out.println("number of links in text:"+text);
				if(ele.getAttribute("href")!=null && (!ele.getAttribute("href").contains("javascript"))) {
					actual_list.add(ele);
				}
			}
			System.out.println("actual size of links:"+actual_list.size());
			for(int j=0;j<actual_list.size();j++) {
				try {
					URL url=new URL(actual_list.get(j).getAttribute("href"));
					HttpURLConnection connection=(HttpURLConnection)url.openConnection();
					connection.setConnectTimeout(2000);
					connection.connect();
					String response=connection.getResponseMessage();
					connection.disconnect();
					System.out.println(actual_list.get(j).getAttribute("href")+"--------"+response);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
			
		
	@AfterClass
	public void close() {
		extent.flush();
		
	}
	
	
	
	
	
	
}
