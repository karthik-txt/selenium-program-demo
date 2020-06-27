/**
 * 
 */
package frameworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class datadrivenframework {

	WebDriver driver;
	
	
	@BeforeMethod
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}
	
	@Test(dataProvider="actiTimelogin")
	public void datadriven(String name,String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
	
	@DataProvider(name="actiTimelogin")
	public Object[][] getdata(){
		excellsheeet excell=new excellsheeet("F:\\kk\\frameworkdemo\\testdata\\data1.xlsx");
		int rows=excell.getRow(0);
		System.out.println("number of rows are:"+rows);
		int cell=excell.getcell(0,0);
		System.out.println("number of cells are:"+cell);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cell;j++) {
				data[i][j]=excell.GetData(0, i, j)	;	
			}
		}
			
		return data;
	}
	
}
