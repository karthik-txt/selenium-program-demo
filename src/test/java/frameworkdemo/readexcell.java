/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author karthik
 *
 */
public class readexcell {

	
	@Test(priority=1)
	public void readexcellfile() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\TestData.xls");
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Workbook wb=Workbook.getWorkbook(fis);
			String data1=wb.getSheet(0).getCell(0, 0).getContents();
			System.out.println(data1);
			String data2=wb.getSheet(0).getCell(0, 1).getContents();
			System.out.println(data2);
			String data3=wb.getSheet(0).getCell( 1, 0).getContents();
			System.out.println(data3);
			String data4=wb.getSheet(0).getCell(1, 1).getContents();
			System.out.println(data4);
			String data5=wb.getSheet(0).getCell(0,2).getContents();
			System.out.println(data5);
			String data6=wb.getSheet(0).getCell(1, 2).getContents();
			System.out.println(data6);
			String data7=wb.getSheet(0).getCell(1,3).getContents();
			System.out.println(data7);
			String data8=wb.getSheet(0).getCell(0,4).getContents();
			System.out.println(data8);
			String data9=wb.getSheet(0).getCell(1,4).getContents();
			System.out.println(data9);
			String data10=wb.getSheet(0).getCell(0,5).getContents();
			System.out.println(data10);
			String data11=wb.getSheet(0).getCell(1,5).getContents();
			System.out.println(data11);
			String data12=wb.getSheet(0).getCell(0,6).getContents();
			System.out.println(data12);
			String data13=wb.getSheet(0).getCell(1,6).getContents();
			System.out.println(data13);
			String data14=wb.getSheet(0).getCell(0,7).getContents();
			System.out.println(data14);
			String data15=wb.getSheet(0).getCell(1,7).getContents();
			System.out.println(data15);
			String data16=wb.getSheet(0).getCell(0,8).getContents();
			System.out.println(data16);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}
	
	
	@Test(priority=2)
	public void getexcelldata() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\TestData.xls");
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Workbook wb=Workbook.getWorkbook(fis);
			int sheet=wb.getNumberOfSheets();
			System.out.println("number of sheets are:"+sheet);
			int row=wb.getSheet(0).getRows();
			System.out.println("number of rows are:"+row);
			int column=wb.getSheet(0).getColumns();
			System.out.println("number of columns are:"+column);
			for(int i=0;i<column;i++) {
				for(int j=0;j<row;j++) {
					String text=wb.getSheet(0).getCell(i, j).getContents();
					System.out.print("  "+text);
				}
				System.out.println();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	
	@Test(priority=3)
	public void readexcelldata() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\TestData.xls");
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Workbook wb=Workbook.getWorkbook(fis);
			Sheet sheet1=wb.getSheet(0);
			
			Cell cel1=sheet1.getCell(0, 0);
			Cell cel2=sheet1.getCell(1, 1);
			Cell cel3=sheet1.getCell(0, 2);
			Cell cel4=sheet1.getCell(1, 2);
			Cell cel5=sheet1.getCell(0, 3);
			Cell cel6=sheet1.getCell(1, 3);
			Cell cel7=sheet1.getCell(0, 4);
			Cell cel8=sheet1.getCell(1, 4);
			Cell cel9=sheet1.getCell(0, 5);
			Cell cel10=sheet1.getCell(1, 5);
			Cell cel11=sheet1.getCell(0, 6);
			Cell cel12=sheet1.getCell(1, 6);
			System.out.println(cel1.getContents());
			System.out.println(cel2.getContents());
			System.out.println(cel3.getContents());
			System.out.println(cel4.getContents());
			System.out.println(cel5.getContents());
			System.out.println(cel6.getContents());
			System.out.println(cel7.getContents());
			System.out.println(cel8.getContents());
			System.out.println(cel9.getContents());
			System.out.println(cel10.getContents());
			System.out.println(cel11.getContents());
			System.out.println(cel12.getContents());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=4)
	public void getexcell() {
		Excells excel=new Excells("F:\\kk\\frameworkdemo\\testdata\\TestData.xls");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
		System.out.println(excel.getData(0, 1, 0));
		System.out.println(excel.getData(0, 1, 1));
		System.out.println(excel.getData(0, 0, 2));
		System.out.println(excel.getData(0, 1, 2));
		System.out.println(excel.getData(0, 0, 3));
		System.out.println(excel.getData(0, 1, 3));
		System.out.println(excel.getData(0, 0, 4));
		System.out.println(excel.getData(0, 1, 4));
		System.out.println(excel.getData(0, 0, 5));
		System.out.println(excel.getData(0, 1, 5));
		System.out.println(excel.getData(0, 0, 6));
		System.out.println(excel.getData(0, 1, 6));
		System.out.println(excel.getData(0, 0, 7));
		System.out.println(excel.getData(0, 1, 7));
		
	}
	
	
	
	
	
}
