/**
 * 
 */
package frameworkdemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class executefailedtest {

	WebDriver driver;
	@Test
	public void failedtest() {
		TestNG runner=new TestNG();
		List<String>list=new ArrayList<String>();
		list.add("F:\\kk\\frameworkdemo\\test-output\\failed testcaseSuite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}
}
