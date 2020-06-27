/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

/**
 * @author karthik
 *
 */
public class readdatausingpoi {

	/*@Test(priority=1)
	public void readexcelldata() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			String data1=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(data1);
			String data2=sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(data2);
			String data3=sheet.getRow(0).getCell(2).getStringCellValue();
			System.out.println(data3);
			String data4=sheet.getRow(0).getCell(3).getStringCellValue();
			System.out.println(data4);
			String data5=sheet.getRow(0).getCell(4).getStringCellValue();
			System.out.println(data5);
			String data6=sheet.getRow(0).getCell(5).getStringCellValue();
			System.out.println(data6);
			String data7=sheet.getRow(0).getCell(6).getStringCellValue();
			System.out.println(data7);
			String data8=sheet.getRow(0).getCell(7).getStringCellValue();
			System.out.println(data8);
			String data9=sheet.getRow(0).getCell(8).getStringCellValue();
			System.out.println(data9);
			String data10=sheet.getRow(0).getCell(9).getStringCellValue();
			System.out.println(data10);
			String data11=sheet.getRow(0).getCell(10).getStringCellValue();
			System.out.println(data11);
			String data12=sheet.getRow(0).getCell(11).getStringCellValue();
			System.out.println(data12);
			String data13=sheet.getRow(0).getCell(12).getStringCellValue();
			System.out.println(data13);
			String data14=sheet.getRow(0).getCell(13).getStringCellValue();
			System.out.println(data14);
			
			
			String data15=sheet.getRow(1).getCell(0).toString();
			System.out.println(data15);
			String data16=sheet.getRow(1).getCell(1).toString();
			System.out.println(data16);
			String data17=sheet.getRow(1).getCell(2).toString();
			System.out.println(data17);
			int data18=(int) sheet.getRow(1).getCell(3).getNumericCellValue();
			System.out.println(data18);
			String data19=sheet.getRow(1).getCell(4).toString();
			System.out.println(data19);
			String data20=sheet.getRow(1).getCell(5).toString();
			System.out.println(data20);
			String data21=sheet.getRow(1).getCell(6).toString();
			System.out.println(data21);
			String data22=sheet.getRow(1).getCell(7).toString();;
			System.out.println(data22);
			String data23=sheet.getRow(1).getCell(8).toString();
			System.out.println(data23);
			String data24=sheet.getRow(1).getCell(9).toString();
			System.out.println(data24);
			String data25=sheet.getRow(1).getCell(10).toString();
			System.out.println(data25);
			String data26=sheet.getRow(1).getCell(11).toString();
			System.out.println(data26);
			String data27=sheet.getRow(1).getCell(12).toString();
			System.out.println(data27);
			String data28=sheet.getRow(1).getCell(13).toString();
			System.out.println(data28);
			wb.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
}*/
	/*@Test(priority=2)
	public void readexcell() 
	{
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			int sheet=wb.getNumberOfSheets();
			System.out.println("number of sheets are:"+sheet);
			XSSFSheet sheet1=wb.getSheetAt(0);
			int row=sheet1.getLastRowNum();
			System.out.println("number of rows are:"+row);
			
			int cell=sheet1.getRow(0).getLastCellNum();
			System.out.println("number of cells are:"+cell);
			for(int i=0;i<row;i++) {
				for(int j=0;j<cell;j++) {
					String data=sheet1.getRow(i).getCell(j).toString();
					System.out.print("   "+data);
				}
				System.out.println();
			}
			wb.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}*/
	
	
	
	/*@Test(priority=3)
	public void getcelldata() {
		Excelldata data=new Excelldata("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println(data.getdata(0, 0, 0));
		System.out.println(data.getdata(0, 0, 1));
		System.out.println(data.getdata(0, 0, 2));
		System.out.println(data.getdata(0, 0, 3));
		System.out.println(data.getdata(0, 0, 4));
		System.out.println(data.getdata(0, 0, 5));
		System.out.println(data.getdata(0, 0, 6));
		System.out.println(data.getdata(0, 0, 7));
		System.out.println(data.getdata(0, 0, 8));
		System.out.println(data.getdata(0, 0, 9));
		System.out.println(data.getdata(0, 0, 10));
		System.out.println(data.getdata(0, 0, 11));
		System.out.println(data.getdata(0, 0, 12));
		System.out.println(data.getdata(0, 0, 13));
		
		System.out.println("***************************");
		System.out.println(data.getdata(0, 1, 0));
		System.out.println(data.getdata(0, 1, 1));
		System.out.println(data.getdata(0, 1, 2));
		System.out.println(data.getNumericData(0, 1, 3));
		System.out.println(data.getdata(0, 1, 4));
		System.out.println(data.getdata(0, 1, 5));
		System.out.println(data.getdata(0, 1, 6));
		System.out.println(data.getdata(0, 1, 7));
		System.out.println(data.getdata(0, 1, 8));
		System.out.println(data.getdata(0, 1, 9));
		System.out.println(data.getdata(0, 1, 10));
		System.out.println(data.getdata(0, 1, 11));
		System.out.println(data.getdata(0, 1, 12));
		System.out.println(data.getdata(0, 1, 13));
	}*/
	
	@Test(priority=4)
	public void readexcell1() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\data1.xlsx");
		System.out.println("file located");
		
		
			try {
				FileInputStream  fis = new FileInputStream(source);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet sheet1=wb.getSheetAt(0);
				int row=sheet1.getLastRowNum();
				System.out.println("number of rows are:"+row);
				int cell=sheet1.getRow(0).getLastCellNum();
				System.out.println("number of cells are:"+cell);
				String data1=sheet1.getRow(0).getCell(0).toString();
				String data2=sheet1.getRow(0).getCell(1).toString();
				String data3=sheet1.getRow(1).getCell(0).toString();
				String data4=sheet1.getRow(1).getCell(1).toString();
				/*System.out.println(data1);
				System.out.println(data2);
				System.out.println(data3);
				System.out.println(data4);*/
				
				for(int i=1;i<row;i++) {
					for(int j=0;j<cell;j++) {
						String data=sheet1.getRow(i).getCell(j).toString();
						System.out.print("   "+data);
					}
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
			 
	}
		
		
}
