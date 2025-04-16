package anfas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import care_sa_admin_portal.appointment_management;
import care_sa_admin_portal.date_code;
import care_sa_admin_portal.xpath;
import retry_code.RetryAnalyzer;

public class Beneficiary extends base_class


{
	
	
	
	String mobile= mobilenumberreusable.generateRandomMobileNumber();
	
	String name=namereusable.generateDynamicName();
	
	datee_class datee = new datee_class();/////date for years
	
	dateclass_for_month dat= new dateclass_for_month();////date for month
	
	
	 private static final Logger logger = LogManager.getLogger(Beneficiary.class);	
	 
		@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
		
		
	//	@Test(priority=1)
		public void addbeneficiary() throws InterruptedException, AWTException, IOException {
			
			
	
		

			reusablekeyboardactions.enterText(By.xpath(subclassforxpath.email_path), "survey@gmail.com");
			
		
			reusablekeyboardactions.enterText(By.xpath(subclassforxpath.Password_path), "surveyD2025");
			
			
			

            
            
            Thread.sleep(5000);
            
         
            
			
            reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.submit_button));
			
			
			
			
			
			
			Thread.sleep(5000);
			
			///////////////////////////////////////////////////////////
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			
	//		WebElement three = getVisibleElement(By.xpath((subclassforxpath.sidemenu_button)));
			
			
			WebElement three = wait_helper.getVisibleElement(By.xpath((subclassforxpath.sidemenu_button)));
			
			
			
			js.executeScript("arguments[0].click();", three);
			////////////////////////////////////////////////////////////
			
			
			
			
	     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.clickbeneficiarybutton));
		     
		     
		     
		     Thread.sleep(5000);
		     
		
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.clicknewbeneficiarybutton));
		     
		     
		    			
				
				
				
				
				
				
			//////////applescript for uploading files	
				
	
		     
		    
		     
		     
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.uploadimage));
		     
		     

		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     String filePath = "/Users/apple/Downloads/5.jpeg";

		  // Use the external utility class to upload the file
		     
		     
		     Thread.sleep(5000);
		     
		     
		     fileuploadusingapplescript.uploadFile(filePath);
		

		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		  
		     
		     
		     
		     
		     
		     
//
//		     // Wait for file selection to complete
//		     Thread.sleep(5000);
//
//		     System.out.println("File uploaded successfully using AppleScript");
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
				
				
				
		  
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryname), name);
		     
		     
		     
		     
		     System.out.println(name);
		     
		  
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiarymobilenumber), mobile);
		     
		     
		     System.out.println(mobile);
		     
	
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryemail), "amns@gmail.com");
		     

		     
		     
		   
		     
		    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
		     
		     
		     
		     
		     WebElement ninee= wait_helper.getVisibleElement(By.xpath((subclassforxpath.beneficiarydate)));
			 	
		     ninee.click();
		     
		     

		     
	 

	       /////////////date////////////
	       
//	       datee_class datee = new datee_class();
	       
	       
	       
	       String sksks=datee.getFormattedDateeByYearss(-20, "dd/MM/yyyy");
	       
	       
	       
	       
	

	       
	        ninee.sendKeys(sksks);
	       
	       
	       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	        
	        
	      
		    
		    
		    
		 
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiarynationalid), "8760987678");
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryservicetype));
		    
		    
		
		    
		     Thread.sleep(5000);
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryservicetypevalues));
		     
		     

		    
			 	
		 
		   
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryregion));
		     
		   
		     
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryregiontypevalues));
		     
		     
		   
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiarynationalid), "8760987678");
	     
		     
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryaddress), "address");

		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarygender));
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarygendervalues));
		     
		 
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryheightvalue), "75");
		     
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryweightvalue), "75");
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryassigncaregiver));
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarychoosecaregiver));
		     
		     
		     
		     
		     
		     
		     
		     
		     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		     
		     
		     WebElement tenn= wait_helper.getVisibleElement(By.xpath((subclassforxpath.beneficiaryfromdate)));
			 	
		     tenn.click();
		     
		     String currentMonthDate =dat.getFormattedDateCurrentMonth("dd/MM/yyyy");
		  
		     tenn.sendKeys(currentMonthDate);
		     
		     
		     
		     WebElement elevenn= wait_helper.getVisibleElement(By.xpath((subclassforxpath.beneficiarytodate)));
			 	
		     elevenn.click();
		     
		     
		    
		     
		     String nextMonthDate =dat.getFormattedDateNextMonth("dd/MM/yyyy");
			  
		     elevenn.sendKeys(nextMonthDate);
		     
		     
		     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		     
		     
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryfromtime));
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryselectfromtime));
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarytotime));
		     
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryselecttotime));
		     
		     
		     
		     
		
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryemergencyname), "test");
		     
	
		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryemergencynumber), mobile);
		     

		     
		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryattachmenttitle), "test");
		     
		     
	
		     
		     
		     

		   
		     
		     
		     
		     
		     
		     
		     
		     
		     
/////uploadfile////
		     
		     reusablekeyboardactions.uploadFile(By.xpath(subclassforxpath.beneficiaryattachmentchoosefile), "/Users/apple/Downloads/5.jpeg");
		     
		     
		  
		     

		     

		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
	
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarysubmit)); 
		     
		
		     
		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.newbeneficiaryok)); 
		

		     
		     
		}
		
	


}
