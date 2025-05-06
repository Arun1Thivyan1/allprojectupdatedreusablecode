package unified_test_listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import anfas.extendreport;
import anfas_main_class_for_beneficiary.base_class;
import screenshot.TestListener;
import screenshot.screenshotutil;

public class listenerforboth_extendreport_failurescreenshot  implements ITestListener
{
	
	
	    private static final Logger logger = LogManager.getLogger(listenerforboth_extendreport_failurescreenshot.class);


    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        System.out.println("❌ Test failed: " + testName);
        logger.error("Test failed: " + testName, result.getThrowable());

        // Capture screenshot
        Object testClass = result.getInstance();
        WebDriver driver = ((base_class) testClass).driver;
        screenshotutil.captureScreenshot(driver, testName);

        // Log in ExtentReport
        ExtentTest test = extendreport.getTest();
        if (test != null) {
            test.fail(result.getThrowable());
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = extendreport.getTest();
        if (test != null) {
            test.pass("✅ Test passed");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = extendreport.getTest();
        if (test != null) {
            test.skip(result.getThrowable());
        }
    }

}
