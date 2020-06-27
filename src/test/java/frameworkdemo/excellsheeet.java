/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author karthik
 *
 */
public class excellsheeet {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public excellsheeet(String Excellpath) {
		File source=new File(Excellpath);
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public String GetData(int sheetnumber,int rowno,int cellno) {
		sheet1=wb.getSheetAt(sheetnumber);
		String text=sheet1.getRow(rowno).getCell(cellno).getStringCellValue();
		return text;
	}
	
	public int getRow(int sheetindex) {
		int row=wb.getSheetAt(sheetindex).getPhysicalNumberOfRows();
		row=row+1;
		return row;
	}
	
	public int getcell(int sheetno,int rowno) {
		int cell=wb.getSheetAt(sheetno).getRow(rowno).getPhysicalNumberOfCells();
		return cell;
		
	}
}
