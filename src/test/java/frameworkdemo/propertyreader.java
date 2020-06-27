/**
 * 
 */
package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class propertyreader {

	@Test(priority=1)
	public void readproperties() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config1.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			
			String browserpath=pro.getProperty("chromepath");
			String url=pro.getProperty("Appurl");
			String uname=pro.getProperty("com.username.xpath");
			String pwd=pro.getProperty("com.password.xpath");
			String button=pro.getProperty("com.login.xpath");
			String leavelist=pro.getProperty("com.leavelist.xpath");
			String fromdate=pro.getProperty("com.calfromdate.xpath");
			String selectdate=pro.getProperty("com.selecalfromdate.xpath");
			String todate=pro.getProperty("com.caltodate.xpath");
			String selecttodate=pro.getProperty("com.selecaltodate.xpath");
			String leavestatus=pro.getProperty("com.leavestatus.xpath")	;	
			String ename=pro.getProperty("com.ename.xpath");
			String selectname=pro.getProperty("com.seleename.xpath");
			String subunit=pro.getProperty("com.subunit.xpath");
			String pastemp=pro.getProperty("com.pastempl.xpath");
			String search_button=pro.getProperty("com.search.xpath");
			String comments=pro.getProperty("com.comments.xpath");
			String action=pro.getProperty("com.action.xpath");
			String save=pro.getProperty("com.save.xpath");
			String admin=pro.getProperty("com.admin.xpath");
			String logout=pro.getProperty("com.logout.xpath");
			
			System.out.println("browserpath is:"+browserpath);
			System.out.println("url is:"+url);
			System.out.println("uname is:"+uname);
			System.out.println("pwd is:"+pwd);
			System.out.println("button is:"+button);
			System.out.println("leavelist is:"+leavelist);
			System.out.println("fromdate is:"+fromdate);
			System.out.println("selectdate is:"+selectdate);
			System.out.println("todate is:"+todate);
			System.out.println("selecttodate is:"+selecttodate);
			System.out.println("leavestatus is:"+leavestatus);
			System.out.println("ename is:"+ename);
			System.out.println("selectname is:"+selectname);
			System.out.println("subunit is:"+subunit);
			System.out.println("pastemp is:"+pastemp);
			System.out.println("search_button is:"+search_button);
			System.out.println("comments :"+comments);
			System.out.println("action is:"+action);
			System.out.println("save:"+save);
			System.out.println("admin:"+admin);
			System.out.println("logout:"+logout);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=2)
	public void getentryset() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config1.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			int total_data=pro.size();
			System.out.println("total data is:"+total_data);
			Set<Entry<Object,Object>>set=pro.entrySet();
			Iterator itr=set.iterator();
			while(itr.hasNext()) {
				String text=itr.next().toString();
				System.out.println("text is:"+text);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=3)
	public void getkeys() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config1.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			int keys=pro.size();
			System.out.println("number of keys are:"+keys);
			Set<Object>set=pro.keySet();
			Iterator itr=set.iterator();
			while(itr.hasNext()) {
				String key=itr.next().toString();
				System.out.println("key is:"+key);
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=4)
	public void getvalues() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config1.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			int values=pro.size();
			System.out.println("number of values are:"+values);
			Collection<Object>set=pro.values();
			Iterator itr=set.iterator();
			while(itr.hasNext()) {
				String value=itr.next().toString();
				System.out.println("values are:"+value);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
