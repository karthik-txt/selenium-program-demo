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

/**
 * @author karthik
 *
 */
public class excellreader {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public excellreader(String excellpath) {
		File source=new File(excellpath);
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}
	
	
	public String getdata(int sheetno,int rowno,int columnno) {
		sheet =wb.getSheetAt(sheetno);
		String text=sheet.getRow(rowno).getCell(columnno).getStringCellValue();
		return text;
	}
	
	
	public int getrow(int sheetindex) {
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}
	
	

}
