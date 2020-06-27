/**
 * 
 */
package frameworkdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author karthik
 *
 */
public class Listenerdemo1 implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("TestCases started and Testcases resultes are:"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Success and TestCases results are:"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases Failure and Testcases results are:"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and Testcases results are:"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
