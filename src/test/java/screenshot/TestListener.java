package screenshot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import care_sa_admin_portal.home_page;

public class TestListener implements ITestListener
{
	
	
    private static final Logger logger = LogManager.getLogger(TestListener.class);


	
	
     
	   public void onTestFailure(ITestResult result) {
		   
		   
		   
		   System.out.println("Test failed: " + result.getName());
		   
		   
		
		   
		   logger.debug("message");
		
		
		
		Object testClass = result.getInstance();
        WebDriver driver = ((home_page) testClass).driver; 
        
        screenshotutil.captureScreenshot(driver, result.getName());
        
      //  screenshotutil.captureScreenshotWithHighlight(driver, null , result.getTestName());

        


		
	}
     
     
     

	
	

}
