/**
 * 
 */
package frameworkdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class popup {

	WebDriver driver;
/*	@Test(priority=1)
	public void handlewindow() {
		System.setProperty("webdriver.chrome.driver", "./browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("parent id is:"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindow.size());
		for(String child:allwindow) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is:"+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
	}
	@Test(priority=2)
	public void handlewindow1() {
		System.setProperty("webdriver.chrome.driver", "./browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("parent window id is:"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		ArrayList<String>tabs=new ArrayList<String>(allwindows);
		System.out.println("number of windows are:"+tabs.size());
		driver.switchTo().window(tabs.get(1));
		System.out.println("child window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
}
	
	@Test(priority=3)
	public void handlewindow2() {
		System.setProperty("webdriver.chrome.driver", "./browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindows.size());
		Iterator<String>itr=allwindows.iterator();
		while(itr.hasNext()) {
			String child=itr.next();
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is:"+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
	}*/
	/*@Test(priority=4)
	public void handlewindow3() {
		System.setProperty("webdriver.chrome.driver", "./browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parent=driver.getWindowHandle();
		System.out.println("parent window id:"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("number of windows are:"+allwindows.size());
		Object[] a=allwindows.toArray();
		driver.switchTo().window(a[1].toString());
		System.out.println("child window id:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(a[0].toString());
		System.out.println("parent window id:"+driver.getTitle());
		driver.close();
}*/
	@Test(priority=5)
	public void handlewindow4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("number of window handles are:"+allwindow.size());
		Iterator<String>itr=allwindow.iterator();
		String parent=itr.next();
		String child=itr.next();
		System.out.println("parent window id:"+parent);
		System.out.println("child window id:"+child);
		driver.switchTo().window(child);
		System.out.println("child window title is:"+driver.getTitle());
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
		
		
		
	}
	
	}