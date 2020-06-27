/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
@Test(priority=1)
public class writedata {
	
	public void writeExcelldata() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println("File Located");
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			wb.getSheetAt(0).getRow(0).createCell(14).setCellValue("hiredate");
			wb.getSheetAt(0).getRow(1).createCell(14).setCellValue("01-jan-19");
			wb.getSheetAt(0).getRow(2).createCell(14).setCellValue("05-nov-18");
			wb.getSheetAt(0).getRow(3).createCell(14).setCellValue("14-mar-16");
			wb.getSheetAt(0).getRow(4).createCell(14).setCellValue("24-apr-17");
			wb.getSheetAt(0).getRow(5).createCell(14).setCellValue("23-jul-18");
			wb.getSheetAt(0).getRow(6).createCell(14).setCellValue("08-feb-17");
			wb.getSheetAt(0).getRow(7).createCell(14).setCellValue("15-aug-15");
			wb.getSheetAt(0).getRow(8).createCell(14).setCellValue("22-may-15");
			wb.getSheetAt(0).getRow(9).createCell(14).setCellValue("22-jun-17");
			wb.getSheetAt(0).getRow(10).createCell(14).setCellValue("17-sep-15");
			wb.getSheetAt(0).getRow(11).createCell(14).setCellValue("23-oct-18");
			wb.getSheetAt(0).createRow(12).createCell(0).setCellValue("E1011");
			
			
			wb.getSheetAt(0).getRow(12).createCell(1).setCellValue("MMMMM");
			wb.getSheetAt(0).getRow(12).createCell(2).setCellValue("mmmmm");
			
			wb.getSheetAt(0).getRow(12).createCell(3).setCellValue("1234567901");
			
			
			
			
			FileOutputStream fos=new FileOutputStream(source);
			wb.write(fos);
			wb.close();
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=2)
	public void excelldata1() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			
			wb.getSheetAt(0).getRow(12).createCell(4).setCellValue("M@gmail.com");
			
			
			wb.getSheetAt(0).getRow(12).createCell(5).setCellValue("mysore");
		
			wb.getSheetAt(0).getRow(12).createCell(6).setCellValue("mysore");
		
			
		
			wb.getSheetAt(0).getRow(12).createCell(7).setCellValue("KR");
			
			wb.getSheetAt(0).getRow(12).createCell(8).setCellValue("50075");
			
			wb.getSheetAt(0).getRow(12).createCell(9).setCellValue("India");
			
			wb.getSheetAt(0).getRow(12).createCell(10).setCellValue("ijijij");
			
			wb.getSheetAt(0).getRow(12).createCell(11).setCellValue("1282");
			
			wb.getSheetAt(0).getRow(12).createCell(12).setCellValue("65000");
			
			wb.getSheetAt(0).getRow(12).createCell(13).setCellValue("8:00AM");
			
			wb.getSheetAt(0).getRow(12).createCell(14).setCellValue("22-mar-15");
			
			
			wb.getSheetAt(0).getRow(13).createCell(0).setCellValue("E1012");
			wb.getSheetAt(0).getRow(13).createCell(1).setCellValue("NNNNN");
			wb.getSheetAt(0).getRow(13).createCell(2).setCellValue("mmmmm");
			wb.getSheetAt(0).getRow(13).createCell(3).setCellValue("1234567902");
			wb.getSheetAt(0).getRow(13).createCell(4).setCellValue("N@gmail.com");
			wb.getSheetAt(0).getRow(13).createCell(5).setCellValue("banglore");
			wb.getSheetAt(0).getRow(13).createCell(6).setCellValue("banglore");
			wb.getSheetAt(0).getRow(13).createCell(7).setCellValue("KR");
			wb.getSheetAt(0).getRow(13).createCell(8).setCellValue("50075");
			wb.getSheetAt(0).getRow(13).createCell(9).setCellValue("India");
			wb.getSheetAt(0).getRow(13).createCell(10).setCellValue("ihihih");
			wb.getSheetAt(0).getRow(13).createCell(11).setCellValue("1283");
			wb.getSheetAt(0).getRow(13).createCell(12).setCellValue("70000");
			wb.getSheetAt(0).getRow(13).createCell(13).setCellValue("8:30AM");
			wb.getSheetAt(0).getRow(13).createCell(14).setCellValue("12-apr-14");
			FileOutputStream fos=new FileOutputStream(source);
			wb.write(fos);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 	
	}
	
	/*@Test(priority=3)
	public void writedata() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println("File Located");
		
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.createSheet("data");
			
			for(int i=0;i<3;i++) {
				Row row=sheet.createRow(i);
				for(int j=0;j<5;j++) {
					row.createCell(j).setCellValue("XYZ");
					
				}
			}
			FileOutputStream fos=new FileOutputStream(source);
			wb.write(fos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}*/
	@Test(priority=4)
	public void writedatas() {
		File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
		System.out.println("File Located");
		
		try {
			FileInputStream fis=new FileInputStream(source);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.createSheet("details1");
			XSSFSheet sheet2=wb.createSheet("details2");
			
			for(int i=0;i<3;i++) {
				Row row1=sheet1.createRow(i);
				Row row2=sheet2.createRow(i);
				for(int j=0;j<5;j++) 
				{
					row1.createCell(j).setCellValue("XYZ");
					row2.createCell(j).setCellValue("ABC");
				}
			}
			FileOutputStream fos=new FileOutputStream(source);
			wb.write(fos);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}
		@Test(priority=5)
		public void readwrite() {
			File source=new File("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
			System.out.println("File Located");
			try {
				FileInputStream fis=new FileInputStream(source);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet sheet1=wb.getSheetAt(0);
				int row=sheet1.getLastRowNum();
				System.out.println("number of rows are:"+row);
				int cell=sheet1.getRow(0).getLastCellNum();
				System.out.println("number of cells are:"+cell);
				XSSFSheet sheet2=wb.createSheet("details3");
				for(int i=0;i<row;i++) {
					Row row1=sheet2.createRow(i);
					for(int j=0;j<cell;j++) {
					String text=sheet1.getRow(i).getCell(j).toString();
					row1.createCell(j).setCellValue(text);
						
					}
				}
				FileOutputStream fos=new FileOutputStream("F:\\kk\\frameworkdemo\\testdata\\Data3.xlsx");
				wb.write(fos);
				wb.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	

	
}
	

