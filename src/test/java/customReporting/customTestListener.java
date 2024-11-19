package customReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class customTestListener extends TestListenerAdapter {

    ExtentReports extent = new ExtentReports();

    @Override
    public void onStart(ITestContext testContext) {
        long startTime = System.currentTimeMillis();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/report.html" + startTime);
        extent.attachReporter(sparkReporter);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testMethodName = result.getMethod().getMethodName();
        String description = result.getMethod().getDescription();
        System.out.println("Start test: " + testMethodName + " " + description);
        ExtentTest mytest = extent.createTest(testMethodName);
        mytest.log(Status.INFO, "Test started: " + testMethodName);
        mytest.log(Status.INFO, "Test description: " + description);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest mytest = extent.createTest(result.getMethod().getMethodName());
        mytest.pass("Test passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest mytest = extent.createTest(result.getMethod().getMethodName());
        mytest.fail("Test failed: " + result.getMethod().getMethodName());
    }

}
