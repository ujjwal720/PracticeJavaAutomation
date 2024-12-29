package practice3;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class hghgk implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
        System.out.println("Reason: " + result.getThrowable());
    }

    // Triggered when a test method is skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
        System.out.println("Reason: " + result.getThrowable());
    }

    // Triggered when a test fails but is within the allowed success percentage
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test failed but within success percentage: " + result.getName());
    }

    // Triggered before any test methods in a test start (defined by <test> in XML)
    @Override
    public void onStart(ITestContext context) {

        System.out.println("Test execution started for: " + context.getName());
    }

    // Triggered after all the test methods in a test have been executed
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished for: " + context.getName());
    }







}
