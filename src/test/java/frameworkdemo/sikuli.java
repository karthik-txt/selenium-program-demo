/**
 * 
 */
package frameworkdemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
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
 *
 */
public class sikuli {

	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/sikuli.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("uploading images and handling flash objects");
	}
	/*@Test(priority=1)
	public void handlingimage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=OCg6BWlAXSw");
		Screen screen=new Screen();
		Pattern image1=new Pattern("F:\\kk\\frameworkdemo\\images\\plays.png");
		Pattern image2=new Pattern("F:\\kk\\frameworkdemo\\images\\pause.png");
		Pattern image3=new Pattern("F:\\kk\\frameworkdemo\\images\\settings.png");
		Pattern image4=new Pattern("F:\\kk\\frameworkdemo\\images\\Auto.png");
		Pattern image5=new Pattern("F:\\kk\\frameworkdemo\\images\\quality.png");
		screen.wait(image1,3000);
		screen.click(image1);
		Thread.sleep(2000);
		screen.click(image2);
		Thread.sleep(2000);
		screen.click(image1);
		Thread.sleep(2000);
		screen.click(image3);
		Thread.sleep(2000);
		screen.click(image4);
		Thread.sleep(2000);
		screen.click(image5);
		
	}*/
	
	
	
	@Test(priority=2)
	public void uploadingimage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Screen screen=new Screen();
		Pattern img1=new Pattern("F:\\kk\\frameworkdemo\\images\\uname.png");
		Pattern img2=new Pattern("F:\\kk\\frameworkdemo\\images\\pwd.png");
		Pattern img3=new Pattern("F:\\kk\\frameworkdemo\\images\\login.png");
		Pattern img4=new Pattern("F:\\kk\\frameworkdemo\\images\\pim.png");
		Pattern img5=new Pattern("F:\\kk\\frameworkdemo\\images\\employee.png");
		Pattern img6=new Pattern("F:\\kk\\frameworkdemo\\images\\uploadfile.png");
		Pattern img7=new Pattern("F:\\kk\\frameworkdemo\\images\\filename.png");
		Pattern img8=new Pattern("F:\\kk\\frameworkdemo\\images\\open.png");
		Pattern img9=new Pattern("F:\\kk\\frameworkdemo\\images\\save.png");
		Pattern img10=new Pattern("F:\\kk\\frameworkdemo\\images\\welcomadmin.png");
		Pattern img11=new Pattern("F:\\kk\\frameworkdemo\\images\\logout.png");
		screen.wait(img1,2000);
		screen.type(img1, "Admin");
		Thread.sleep(2000);
		screen.type(img2, "admin123");
		Thread.sleep(2000);
		screen.click(img3);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='head']")).isDisplayed());
		screen.click(img4);
		screen.click(img5);
		Thread.sleep(2000);
		screen.click(img6);
		Thread.sleep(2000);
		screen.type(img7, "C:\\Users\\karthik\\Desktop\\words.docx");
		Thread.sleep(2000);
		screen.click(img8);
		Thread.sleep(2000);
		screen.click(img9);
		Thread.sleep(2000);
		screen.click(img10);
		Thread.sleep(2000);
		screen.click(img11);
	}
	
	
	
	@AfterMethod
	public void teardown() {
		extent.flush();
		driver.close();
	}
}
