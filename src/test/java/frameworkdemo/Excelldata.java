/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author karthik
 *
 */
public class Excelldata {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Excelldata(String excellpath) {
		File source=new File(excellpath);
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	
	
	public String getdata(int sheetno,int rowno,int cellno) {
		sheet=wb.getSheetAt(sheetno);
		String data=sheet.getRow(rowno).getCell(cellno).toString();
		return data;
	}
	
	public int getNumericData(int sheetno,int rowno,int cellno) {
		sheet=wb.getSheetAt(sheetno);
		int data=(int)sheet.getRow(rowno).getCell(cellno).getNumericCellValue();
		return data;
	}



	
}
