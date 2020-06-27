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
public class readproperties {

	@Test(priority=1)
	public void readconfig() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			String browserpath=pro.getProperty("chromepath");
			String url=pro.getProperty("AppUrl");
			String uname=pro.getProperty("com.username.xpath");
			String pwd=pro.getProperty("com.password.xpath");
			String login_button=pro.getProperty("com.login.xpath");
			String admin=pro.getProperty("com.admin.xpath");
			String logout=pro.getProperty("com.logout.xpath");
			System.out.println("path is:"+browserpath);
			System.out.println("url is:"+url);
			System.out.println("name is:"+uname);
			System.out.println("pwd is:"+pwd);
			System.out.println("button is:"+login_button);
			System.out.println("admin is:"+admin);
			System.out.println("logout is:"+logout);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	@Test(priority=2)
	public void readsetofentries() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config.property");
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			int totaldata=pro.size();
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
	public void getKeys() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config.property");
		System.out.println("File located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			int total_keys=pro.size();
			System.out.println("total keys are:"+total_keys);
			Set<Object>set=pro.keySet();
			Iterator<Object> itr=set.iterator();
			while(itr.hasNext()) {
				String keys=itr.next().toString();
				System.out.println("keys are:"+keys);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	@Test(priority=4)
	public void getvalues() {
		File source=new File("F:\\kk\\frameworkdemo\\configuration\\config.property");
		System.out.println("file located");
		try {
			FileInputStream fis=new FileInputStream(source);
			Properties pro=new Properties();
			pro.load(fis);
			Collection<Object> values=pro.values();
			Iterator<Object> itr=values.iterator();
			while(itr.hasNext()) {
				String value=itr.next().toString();
				System.out.println("values are:"+value);
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
