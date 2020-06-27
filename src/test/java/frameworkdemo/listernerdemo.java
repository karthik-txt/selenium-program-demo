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
public class listernerdemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test cases started and testcase details are:"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases success and Test case details are:"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Cases Failed and Test Case details are:"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Cases Skipped and Test case details are:"+result.getName());
		
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
