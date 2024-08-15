package iiiiii;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Liste3 implements  ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("ccc" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		System.out.println("ccca" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("cccb" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	

}
