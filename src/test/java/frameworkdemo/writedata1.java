/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class writedata1 {

	WebDriver driver;
	@Test
	public void webtable() {
		System.setProperty("webdriver.chrome.driver", "F:\\kk\\frameworkdemo\\browserdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>list=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("number of rows are:"+list.size());
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\data1.xlsx");
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.createSheet("datatable");
			//int cell=sheet1.getRow(0).getLastCellNum();
			
			for(int i=0;i<list.size();i++) {
				Row row=sheet1.createRow(i);
				WebElement ele=list.get(i);
				String text=ele.getText();
				System.out.println(text);
				Cell cell1=row.createCell(0);
				cell1.setCellValue(text);
				FileOutputStream fos=new FileOutputStream(source);
				wb.write(fos);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
