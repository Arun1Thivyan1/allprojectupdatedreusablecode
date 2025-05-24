package anfas_main_classes_for_all_modules;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import anfas.delete_old_screenshotimage_and_extend_report;
import anfas.extendreport;
import anfas.reusablekeyboardactions;
import anfas.send_email_to_the_team_for_extend_report;
import anfas.subclassforxpath;
import anfas.wait_helper;
import care_sa_admin_portal.home_page;
import uianduxtesting.clean_the_images_in_the_folder;

public class base_class 
{
	
	
///////////////////
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	
///////////////////	
	
	private static ExtentReports extent;
	
	


	
	public JavascriptExecutor getJs() {
	    return (JavascriptExecutor) driver.get();
	}
	

	
	public static ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();

	

	

	
	
    private static final Logger logger = LogManager.getLogger(home_page.class);


    

    
    
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    
    
    
    
    protected void startTest(String testName) {
        extentTest.set(extent.createTest(testName));
    }
    

    
    public static ExtentTest getExtentTest() {
        return extentTest.get();
    }
    

    


    
    
    
    protected clean_the_images_in_the_folder cleaner = new clean_the_images_in_the_folder();
    
    
    
    
    
    
	
	 @BeforeClass
		public void launchbrowser() throws InterruptedException {
		 
		 
		 
		 
		 
		 
		 
		 

		    // CLEAN DIRECTORIES ONLY ONCE BEFORE TESTS START(ui/ux testing)
		 
		    cleaner.cleanDirectory("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/difference_images");
		    cleaner.cleanDirectory("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images");
		 
		 
		 
		 
		 
		 delete_old_screenshotimage_and_extend_report.deleteFilesInFolder("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images");
		 
		 delete_old_screenshotimage_and_extend_report.deleteFilesInFolder("test-output");
			
			
		 System.setProperty("file.encoding", "UTF-8");
		 


		 
		 
		 
		 
		 
		 
		 
	//////////////////	 
		 
		 
		 
		 extent = extendreport.getExtentReports();
		 
		 
		 
	/////////////////	 
		 
		 
		 
		 
		 
		 
		 
		 
		 extent.setSystemInfo("Tester", "ARUN THIVYAN");
		 
		 
	
			
	

			
			System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver-mac-x64/chromedriver");
			
			

			
			ChromeOptions options=new ChromeOptions();
			

			
			options.addArguments("--incognito");
			

	
			
			driver.set(new ChromeDriver(options));
			
			
			
	
		      logger.info("Browser launched successfully");
		      
		 
		      
     
		      
			driver.get().manage().window().maximize();
			
		

	        
	        
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
	        
	        //
	        logger.info("JavascriptExecutor initialized successfully");
		//
			
			

			
			
			wait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(75)));
			
			
	

		driver.get().get("https://demo.annztech.com/#/account/login");
			
	
			
			
			
			logger.info("Navigated to example.com");
			
			
			
			
			
			
			
			
		
			
			
			
			
			 
				
				
				


					 
					 
				
					 
		
			

}
	 
	 

	 
	 
	 
	  @AfterClass
		
		
			public void teardown() 
	  {
		  
		  try 
		  {
		        // Flush the Extent Report to save the latest changes
		        extent.flush();
		        
		        // Log the end of the test
		        logger.info("Test execution completed. Report generated.");
		        
		        
		        
		        
		        

		        // Send the email with the generated report
		        send_email_to_the_team_for_extend_report.sendEmailWithReport();
		        logger.info("Report sent to the team.");

		    }
		     catch (Exception e) 
		    {
		        logger.error("Failed to send the email report: " + e.getMessage());
		    } finally {
		        // Close the browser
		    	
		    	

	
		    }
	  }
	  

}
