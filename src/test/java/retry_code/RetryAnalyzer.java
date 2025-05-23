package retry_code;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import anfas.extendreport;

public class RetryAnalyzer implements IRetryAnalyzer


{
	
	
	private int retryCount = 0;
    private static final int maxRetryCount = 1;
    
    
    
  @Override
  
  public boolean retry(ITestResult result) {
	  
	  if(retryCount < maxRetryCount) {
		  
		  retryCount++;
		  
		  
		  System.out.println("Retrying test " + result.getName() + " for the " + retryCount + " time.");
		  
		  return true;
	  }
	  
	  return false;
	  
  }
  
  
  
  
  
  
  
  
  
  
  
//  
//  @Override
//  public boolean retry(ITestResult result) {
//      if (retryCount < maxRetryCount) {
//          retryCount++;
//          ExtentTest retryTest = extendreport.createTest(result.getMethod().getMethodName() + " - Retry " + retryCount);
//          retryTest.info("Retrying due to failure...");
//          result.setAttribute("retryTest", retryTest);
//          return true;
//      }
//      return false;
//  }
    
    

}

