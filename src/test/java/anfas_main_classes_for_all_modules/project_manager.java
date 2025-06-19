package anfas_main_classes_for_all_modules;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import anfas.dateclass_for_month;
import anfas.datee_class;
import anfas.fileuploadusingapplescript;
import anfas.mobilenumberreusable;
import anfas.namereusable;
import anfas.reusablekeyboardactions;
import anfas.subclassforxpath;
import anfas.wait_helper;
import retry_code.RetryAnalyzer;
import unified_test_listener.listenerforboth_extendreport_failurescreenshot;




//@Listeners(listenerforboth_extendreport_failurescreenshot.class)

public class project_manager extends base_class

{
	
//ExtentTest test;
	
	
	
	String mobile= mobilenumberreusable.generateRandomMobileNumber();
	
	String name=namereusable.generateDynamicName();
	
	datee_class datee = new datee_class();/////date for years
	
	dateclass_for_month dat= new dateclass_for_month();////date for month
	
	
	private static final Logger logger = LogManager.getLogger(project_manager.class);
	
	
	
	
	
	
	
	@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
	
	

	public void login() throws InterruptedException, AWTException, IOException {
		
		
		
		
	
		
		
		
		
		 startTest("Login Test");
		
		

	//	 test = extendreport.createTest("Login Test");

		 
		 
	
		 
		 
		 
		reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.email_path), "survey@gmail.com");
		
	
		reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.Password_path), "surveyD2025");
		
		
		

        
        
        Thread.sleep(5000);
        
     
        
		
        reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.submit_button));
        
        
        
        
       
		
		
	}	
		
	
	
	
	@Test(priority=2,retryAnalyzer = RetryAnalyzer.class)
	
	

	public void clicksidemenubarandbeneficiarybutton() throws InterruptedException, AWTException, IOException {
		
		Thread.sleep(20000);
		
		
		
		startTest("sidemenubutton");

		
		
		WebElement three = wait_helper.getVisibleElement(By.xpath((subclassforxpath.sidemenu_button)));
		

		
		getJs().executeScript("arguments[0].click();", three );
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Test(priority=3,retryAnalyzer = RetryAnalyzer.class)
		
		

		public void clickprojectmanagerbutton() throws InterruptedException, AWTException, IOException {	
		
		
	
 
     
     reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.clickpmbutton));
     
}
	
	
	
	
	
	
	
	
	
	
	
	@Test(priority=4,retryAnalyzer = RetryAnalyzer.class)
	
	

	public void clicknewbeneficiarybutton() throws InterruptedException, AWTException, IOException {
	
	     
	
	
	
	     Thread.sleep(5000);
	     
	     startTest("click new pm button");

	     
	     reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.clicknewpmbutton));
	     
	     
	    			
			
			
			
			
}
	
	
	
	
 	@Test(priority=5,retryAnalyzer = RetryAnalyzer.class)
	
	

	public void project_manageruploadimage() throws InterruptedException, AWTException, IOException {  
 		
 		
 		startTest("project manager upload image");
     
     
	

     reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.uploadimage));
     
 
     
     String filePath = "/Users/apple/Downloads/5.jpeg";

 
     
     
     Thread.sleep(5000);
     
     
     fileuploadusingapplescript.uploadFile(filePath);
     
 	}
 	
 	
 	

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	@Test(priority=6,retryAnalyzer = RetryAnalyzer.class)
	
	

	public void addfirstname() throws InterruptedException, AWTException, IOException {  
 		
 		
 		
 		startTest("addname");
 		

     
     reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.pmfirstname), name);
     
     
     
     
     System.out.println(name);
     
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	@Test(priority=7,retryAnalyzer = RetryAnalyzer.class)
	
	

	public void addlastname() throws InterruptedException, AWTException, IOException {  
 		
 		
 		
 		startTest("lastname");
 		
 //		 test = extendreport.createTest("addname");
     
     reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.pmlastname), name);
     
     
     
     
     System.out.println(name);
     
 	}

	
	
}
