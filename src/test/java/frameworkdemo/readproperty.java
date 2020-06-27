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
public class readproperty {

	Properties pro;
	public readproperty() {
		File source=new File("./configuration/config.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public String getbrowserpath() {
		String path=pro.getProperty("chromepath");
		return path;
	}
	
	public String getAppurl() {
		return pro.getProperty("AppUrl");
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
	
	public String getadmin() {
		return pro.getProperty("com.admin.xpath");
	}
	
	public String getlogout() {
		String logout=pro.getProperty("com.logout.xpath");
		return logout;
	}
}
