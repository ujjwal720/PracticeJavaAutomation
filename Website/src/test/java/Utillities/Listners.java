package Utillities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listners extends BaseTest implements ITestListener {

	/*
	 * Listners basically listne to ur test cases
	 * 
	 * 
	 */

	public Listners() {

	}

	public ExtentSparkReporter reorter;
	public ExtentReports reports;
	String files = "";
	public Date time;
	public ExtentTest test;
	public TakesScreenshot shots;
	public SimpleDateFormat format;

	public void configuration() {

		try {
			time = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			String formattedDateTime = dateFormat.format(time);
			String getproperty = System.getProperty("user.dir");
			System.out.println(getproperty);
			String props = getproperty + "\\ExtentReports\\" + formattedDateTime + ".html";
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

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.BROWN));

	}

	@Override
	public void onTestFailure(ITestResult result) {

		try {

			shots = ((TakesScreenshot) BaseTest.getdriver());
			File source=shots.getScreenshotAs(OutputType.FILE);
			format=new SimpleDateFormat("yyyyMMdd_HHmmss");
			String formattedDateTime = format.format(time);
			String getproperty = System.getProperty("user.dir");
			System.out.println(getproperty);
			String oi=result.getTestName();
			String props = getproperty + "\\screenshots\\" +oi+" " +formattedDateTime + ".png";
			File target=new File(props);
		    FileUtils.copyFile(source, target);
			
			

		}

		catch (Exception e) {
			
			System.out.println("File not found in my area");

		}

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
		configuration();

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

		reports.flush();

	}

}
