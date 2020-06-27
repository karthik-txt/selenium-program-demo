/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
public class autosuggestion {

	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./reports/actions.html");
		extent=new ExtentReports();
		extent.attachReporter(reports);
		logger=extent.createTest("actions class");
	}
	/*@Test(priority=1,description="autosuggestion using actions class")
	public void autosuggestions() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//div[@class='aajZCb']//span[text()='selenium']/b[text()='hq']"));
		Actions act=new Actions(driver);
		act.moveToElement(search).build().perform();
		Thread.sleep(2000);
		act.click(search).build().perform();
	}
	
	@Test(priority=2,description="autosuggestion")
	public void autosuggestions1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='aajZCb']//span[text()='selenium']/b[text()='hq']")).click();
	}
	
	@Test(priority=3,description="mouseHover")
	public void mouseHover() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();
	}*/
	
/*	@Test(priority=4,description="drag and drop")
	public void draganddrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}*/
	/*@Test(priority=5,description="drag and drop")
	public void draganddrop1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		int x=drag.getLocation().getX();
		int y=drag.getLocation().getY();
		System.out.println(x+"---------"+y);
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 300, 500).build().perform();
	}*/
	
	/*@Test(priority=6,description="drag and drop using click and hold")
	public void draganddrop2() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		//act.clickAndHold(drag).pause(2000).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag).pause(2000).moveToElement(drop).build().perform();
	}*/
	
	/*@Test(priority=7,description="drag and drop using click and hold")
	public void draganddrop3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement ele2=driver.findElement(By.xpath("//ul[@class='dhx_widget dhx_list ']"));
		WebElement ele3=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		WebElement ele4=driver.findElement(By.xpath("//span[text()='2012']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.clickAndHold(ele1).pause(2000).moveToElement(ele2).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(ele3).pause(2000).moveToElement(ele4).release().build().perform();
		act.dragAndDrop(ele1, ele2).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(ele3, ele4).build().perform();		
	}
	*/
	/*@Test(priority=8,description="drag and drop using click and hold")
	public void draganddrop4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.dhtmlx.com/suite/samples/tree/02_configuration/06_drop_behaviour.html");
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Books']"));
		WebElement ele2=driver.findElement(By.xpath("(//span[text()='Books'])[2]"));
		WebElement ele3=driver.findElement(By.xpath("(//span[text()='Books'])[3]"));
		WebElement ele4=driver.findElement(By.xpath("(//span[text()='Magazines'])[1]"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele1).pause(2000).moveToElement(ele2).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(ele3).pause(2000).moveToElement(ele4).release().build().perform();
		act.dragAndDrop(ele1, ele2).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(ele3, ele4).build().perform();

	}
	*/
	
	/*@Test(priority=9,description="rightclick")
	public void rightclick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Actions act=new Actions(driver);
		act.contextClick().build().perform();
	}*/
	
	/*@Test(priority=10,description="rightclick")
	public void rightclick1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[text()='Gmail']"))).build().perform();
		act.click(driver.findElement(By.xpath("//a[text()='Gmail']"))).build().perform();
		act.contextClick(driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]"))).build().perform();
		act.click(driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]"))).build().perform();
		
		
	}
	
	@Test(priority=11,description="rightclick")
	public void rightclick2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//div[@class='PrDSKc']/a[text()='Learn more']"))).build().perform();
		act.click(driver.findElement(By.xpath("//div[@class='PrDSKc']/a[text()='Learn more']"))).build().perform();
		Thread.sleep(2000);
		act.contextClick(driver.findElement(By.xpath("//span[text()='Google Chrome']"))).build().perform();
		act.click(driver.findElement(By.xpath("//span[text()='Google Chrome']"))).build().perform();
	
	}*/
	
	/*@Test(priority=12,description="rightclick")
	public void keyboardevent() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//a[text()='Gmail']"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.contextClick(driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}*/
	
	@Test(priority=13)
	public void keyboardevent1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//div[@class='PrDSKc']/a[text()='Learn more']"))).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.contextClick(driver.findElement(By.xpath("//span[text()='Google Chrome']"))).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ENTER).build().perform();
	
	}
	 
	@AfterMethod
	public void teardown() {
		extent.flush();
		driver.close();
	}
}
