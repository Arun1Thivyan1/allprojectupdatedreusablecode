package anfas;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendreport 
{
	 private static ExtentReports extent;
	 private static ExtentTest test;
	 private static String reportPath;
	    
	    

	    public static ExtentReports getExtentReports() {
	        if (extent == null) {
	        	
	        	
	        	  String timestamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
	              String reportName = "automation_test_report_" + timestamp + ".html";
	               reportPath = "test-output/" + reportName;
	        	
	        	
	           
	            
	            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	            
	            
	            htmlReporter.config().setTimeStampFormat("dd-MM-yyyy HH:mm:ss");
	            
	            htmlReporter.config().setReportName("Automation Test Report");
	            
	            htmlReporter.config().setDocumentTitle("Regression Test Results");
	            htmlReporter.config().setTheme(Theme.STANDARD);
	            
	            
	            
	            extent = new ExtentReports();
	            extent.attachReporter(htmlReporter);
	            extent.setSystemInfo("OS", System.getProperty("os.name"));
	            
	            
	            
	        //    extent.setSystemInfo("Tester", "YourName");
	        }
	        return extent;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // Method to get the path of the generated report
	    public static String getReportPath() {
	        return reportPath;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    public static ExtentTest createTest(String testName) {
	        test = getExtentReports().createTest(testName);
	        return test;
	    }

	    public static ExtentTest getTest() {
	        return test;
	    }

}
