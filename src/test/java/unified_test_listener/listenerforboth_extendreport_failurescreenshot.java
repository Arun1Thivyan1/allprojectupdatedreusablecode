package unified_test_listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import anfas.extendreport;
import anfas_main_classes_for_all_modules.base_class;
import screenshot.screenshotutil;

public class listenerforboth_extendreport_failurescreenshot  implements ITestListener
{
	
	
	    private static final Logger logger = LogManager.getLogger(listenerforboth_extendreport_failurescreenshot.class);

	    
	    
	    

	    
	    
	    @Override
	    public void onTestFailure(ITestResult result) {
	        handleScreenshot("fail", result);
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) 
	    
	   
	    
	   {
	        handleScreenshot("skip", result);
	    }
	    
	    
	    
	 
	    

	    private void handleScreenshot(String status, ITestResult result) {
	        String testName = result.getName();
	        
	        String className = result.getTestClass().getName();
	        
	        
	        Object testClass = result.getInstance();
	        
	        //
	        
	        
	    //    WebDriver driver = ((base_class) testClass).driver;
	        
	  
	        //
	        
	        
	        WebDriver driver = ((base_class) testClass).driver.get();
	        
	        //
	        
	        
	  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

	        
	        

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        // Capture screenshot and save to the specified path
	        String screenshotPath = screenshotutil.captureScreenshot(driver, testName);

	        if (screenshotPath != null) {
	            System.out.println("Screenshot saved at: " + screenshotPath);
	        } else {
	            System.out.println("Failed to capture screenshot for test: " + testName);
	        }
	       
	        
	        

	        
	        
	        
	        
	        
	        
	        
	        
	     
	        
	        
	        
	        
	        // Log in ExtentReport
	        ExtentTest test = extendreport.getTest();
	        if (test != null) 
	        
	        {
	        	
	        	
	        	String detailedMessage = String.format(
	                    "Test '%s' in class '%s' %s. Reason: %s",
	                    testName, className, (status.equals("fail") ? "failed" : "skipped"),
	                    result.getThrowable() != null ? result.getThrowable().getMessage() : "No exception details available"
	                );	
	        	
	        	
	        	
	        	
	        	
	        	
	        	if (status.equals("fail")) 
	        	
	        	{
	        		
	        		test.fail(detailedMessage);
	        		
	        	    test.fail(result.getThrowable());
	        	    
	        	    test.fail("Screenshot of failure:", 
	        	        MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotPath).build());
	        	} 
	        	
	        	else if (status.equals("skip")) 
	        	{
	        		
	        		test.skip(detailedMessage);
	        		
	        	    test.skip(result.getThrowable());
	        	    test.skip("Screenshot of skipped:", 
	        	        MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotPath).build());
	        	}     	
	        	
	        	
	        	
	        	
    
	            
	            
	        }

	        logger.info("[" + status.toUpperCase() + "] Screenshot attached for test: " + testName);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    
	    
}    
	          
    


