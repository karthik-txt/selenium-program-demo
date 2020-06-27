/**
 * 
 */
package frameworkdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class Action {

	WebDriver driver;
	/*@Test(priority=1)
	public void rightclick() throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	@Test(priority=2)
	public void doubleclick() throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).build().perform();
		driver.quit();
	}*/
	
	/*@Test(priority=3)
	public void draganddrop() throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement des=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		act.clickAndHold(src).pause(Duration.ofSeconds(2)).
		moveToElement(des).pause(Duration.ofSeconds(2)).
		release().build().
		perform();
		driver.quit();
	}
	
	@Test(priority=4)
	public void draganddrop1() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions act=new Actions(driver);
		act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 300, 200).build().perform();
		driver.quit();
	}*/
	
/*	@Test(priority=5)
	public void keyboardevents() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	}
	*/
	
/*	@Test(priority=5)
	public void keyboardevents1() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selenium");
		act.sendKeys(Keys.TAB).
		sendKeys("webdriver").pause(Duration.ofSeconds(2)).
		sendKeys(Keys.TAB).
		sendKeys("8490490490").pause(Duration.ofSeconds(2)).
		sendKeys(Keys.TAB).
		sendKeys("uyuiuiwef").pause(Duration.ofSeconds(2)).
		sendKeys(Keys.TAB).click(driver.findElement(By.xpath("//select[@id='day']")))
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build()
		.perform();
		
	}*/
	
	@Test(priority=5)
	public void keyboardevents2() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		if(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("ENTER")){
			System.out.println("key pressed");
		}
	}
	
	
}
