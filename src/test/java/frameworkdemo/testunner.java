/**
 * 
 */
package frameworkdemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

/**
 * @author karthik
 *
 */
public class testunner {

	@Test
	public void runners() {
		TestNG runner=new TestNG();
		List<String>list=new ArrayList<String>();
		list.add("F:\\kk\\frameworkdemo\\test-output\\Default suite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}
}
