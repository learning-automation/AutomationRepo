package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import utility.ScreenShot;

public class TestListners implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("Test cases has been started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("Test cases is green ");
        ScreenShot.takeScreenShot(iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        Reporter.log("Test cases is failed");
        ScreenShot.takeScreenShot(iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
