/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author karthik
 *
 */
public class configreader {
	Properties pro;
	public configreader() {
		File source=new File("./configuration/config1.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	public String getbrowser() {
		String path=pro.getProperty("chromepath");
		return path;
	}
	
	public String getappurl() {
		return pro.getProperty("Appurl");
	}
	
	public String getuname() {
		String uname=pro.getProperty("com.username.xpath");
		return uname;
	}
	
	public String getpwd() {
		return pro.getProperty("com.password.xpath");
	}
	
	public String getbutton() {
		String button=pro.getProperty("com.login.xpath");
		return button;
	}
	
	public String getleavelist() {
		return pro.getProperty("com.leavelist.xpath");
	}
	
	public String getfromdate() {
		String fromdate=pro.getProperty("com.calfromdate.xpath");
		return fromdate;
	}
	
	public String selectfromdate() {
		return pro.getProperty("com.selecalfromdate.xpath");
	}
	
	public String gettodate(){
		String todate=pro.getProperty("com.caltodate.xpath");
		return todate;
	}
	
	public String selecttodate() {
	return pro.getProperty("com.selecaltodate.xpath");
	}
	
	
	public String getleavestatus() {
		String leavestatus=pro.getProperty("com.leavestatus.xpath");
		return leavestatus;
	}
	
	public String getename() {
		return pro.getProperty("com.ename.xpath");
	}
	
	public String getselectename() {
		String selectename=pro.getProperty("com.seleename.xpath");
		return selectename;
	}
	
	public String getsubunit() {
		return pro.getProperty("com.subunit.xpath");
	}
	
	public String getpastemp() {
		String pastemployee=pro.getProperty("com.pastempl.xpath");
		return pastemployee;
	}
	
	public String getsearch() {
	return pro.getProperty("com.search.xpath");
	}
	
	public String getcomments() {
		String comments=pro.getProperty("com.comments.xpath");
		return comments;
	}
	
	public String getinsave() {
		String insave=pro.getProperty("comm.insave.xpath=//input[@id='commentSave']");
		return insave;
	}
	
	public String getactions() {
		return pro.getProperty("com.action.xpath");
	}
	
	public String getsave() {
		String save=pro.getProperty("com.save.xpath");
		return save;
	}
	
	public String getadmin() {
		return pro.getProperty("com.admin.xpath");
	}
	
	public String getlogout() {
		String logout=pro.getProperty("com.logout.xpath");
		return logout;
	}
	
}
	
