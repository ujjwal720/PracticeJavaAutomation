package Utillities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listners implements ITestListener {

	public ExtentSparkReporter reorter;
	public ExtentReports reports;
	String files = "";
	public Date time;

	public void configuration() {

		try {
			time = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			String formattedDateTime = dateFormat.format(time);
			String getproperty = System.getProperty("user.dir");
			System.out.println(getproperty);
			String props = "\\ExtentReports\\" + formattedDateTime + "\\.html";
			reorter = new ExtentSparkReporter(props);
			reorter.config().setDocumentTitle("Reports for the excuted testcases");
			reorter.config().setReportName("Ujjwal Shrivastava");
			reports = new ExtentReports();
			
			reports.attachReporter(reorter);

		} catch (Exception e) {
			
			e.printStackTrace();

		}
	}

	@Override
	public void onTestStart(ITestResult result) {

		configuration();
		reports.createTest(result.getTestClass().toString());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		reports.flush();

	}

}
