/**
 * 
 */
package frameworkdemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class TestCase2 {

	WebDriver driver;
	@Test(priority=1)
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("number of links are:"+list.size());
		
		for(WebElement ele:list) {
			String text=ele.getAttribute("href");
			System.out.println("links are:"+text);
			verifylinks(text);
		}
		
	}
	
	
	public static void verifylinks(String linksurl) {
		try {
			URL url=new URL(linksurl);
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if(connection.getResponseCode()==200){
				System.out.println(linksurl+"-----------"+connection.getResponseMessage());
			}
			if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linksurl+"-------------"+connection.getResponseMessage()+"-----------"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=2)
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("number of links are:"+list.size());
		List<WebElement>actual_list=new ArrayList<WebElement>();
		for(WebElement ele:list) {
			String text=ele.getAttribute("href");
			System.out.println("links in text form:"+text);
			if(text!=null&&(!text.contains("javascript"))) {
				actual_list.add(ele);
			}
		}
		System.out.println("actual number of links:"+actual_list.size());
		for(WebElement ele1:actual_list) {
			String text1=ele1.getAttribute("href");
			try {
				URL url=new URL(text1);
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				String reponse=connection.getResponseMessage();
				connection.disconnect();
				System.out.println(text1+"-------------"+reponse);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
	}
	
	@Test(priority=3)
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("number of links are:"+list.size());
		List<WebElement>actual_list=new ArrayList<WebElement>();
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String text=ele.getAttribute("href");
			System.out.println("links are:"+text);
			if(text!=null&&(!text.contains("javascript"))) {
				actual_list.add(ele);
			}
		}
		System.out.println("actual number of links are:"+actual_list.size());
		for(int j=0;j<actual_list.size();j++) {
			WebElement ele1=actual_list.get(j);
			String text1=ele1.getAttribute("href");
			try {
				URL url=new URL(text1);
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				String response=connection.getResponseMessage();
				connection.disconnect();
				System.out.println(text1+"---------------"+response);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
