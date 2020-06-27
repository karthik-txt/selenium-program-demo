/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author karthik
 *
 */
public class Excells {
	Workbook wb;
	Sheet s;
	public Excells(String Excellpath) {
		File source=new File(Excellpath) ;
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			wb=Workbook.getWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetnumber,int cellno,int rowno) {
		s=wb.getSheet(sheetnumber);
		String data=s.getCell(cellno, rowno).getContents();
		return data;
		
	}
}
