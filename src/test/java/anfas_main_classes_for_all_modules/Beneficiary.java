package anfas_main_classes_for_all_modules;

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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import anfas.dateclass_for_month;
import anfas.datee_class;
import anfas.extendreport;
import anfas.fileuploadusingapplescript;
import anfas.mobilenumberreusable;
import anfas.namereusable;
import anfas.reusablekeyboardactions;
import anfas.subclassforxpath;
import anfas.wait_helper;
import care_sa_admin_portal.appointment_management;
import care_sa_admin_portal.date_code;
import care_sa_admin_portal.xpath;
import retry_code.RetryAnalyzer;

import unified_test_listener.listenerforboth_extendreport_failurescreenshot;


















//@Listeners(listenerforboth_extendreport_failurescreenshot.class)
public class Beneficiary extends base_class




{
	
//	ExtentTest test;
	
	
	
	String mobile= mobilenumberreusable.generateRandomMobileNumber();
	
	String name=namereusable.generateDynamicName();
	
	datee_class datee = new datee_class();/////date for years
	
	dateclass_for_month dat= new dateclass_for_month();////date for month
	
	

	
	
	
	
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	 private static final Logger logger = LogManager.getLogger(Beneficiary.class);	
	 
		@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
		
		

		public void login() throws InterruptedException, AWTException, IOException {
			
			
			
			
		
			
			
			
			
			 startTest("Login Test");
			
			
	
		//	 test = extendreport.createTest("Login Test");

			 
			 
		
			 
			 
			// 
		//	reusablekeyboardactions.enterText(By.xpath(subclassforxpath.email_path), "survey@gmail.com");
			//
			
			
			reusablekeyboardactions.enterText(driver.get(), By.xpath(subclassforxpath.email_path), "survey@gmail.com");
			
		
			reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.Password_path), "surveyD2025");
			
			
			

            
            
            Thread.sleep(5000);
            
         
            
			
            reusablekeyboardactions.clickElement(driver.get(), By.xpath(subclassforxpath.submit_button));
            
            
            
            
           
			
			
		}	
			
		
		
		
		@Test(priority=2,retryAnalyzer = RetryAnalyzer.class)
		
		

		public void clicksidemenubarandbeneficiarybutton() throws InterruptedException, AWTException, IOException {
			
			Thread.sleep(15000);
			
			
			
			startTest("sidemenubutton");
//			
//	
//			
//			///////////////////////////////////////////////////////////
//		
//
//			
//			
			WebElement three = wait_helper.getVisibleElement(By.xpath((subclassforxpath.sidemenu_button)));
			
	//		
			
	//		js.executeScript("arguments[0].click();", three);
			
	//		
			getJs().executeScript("arguments[0].click();", three );
			
			
			
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			@Test(priority=3,retryAnalyzer = RetryAnalyzer.class)
			
			

			public void clickbeneficiarybutton() throws InterruptedException, AWTException, IOException {	
			
			
			
			
			////////////////////////////////////////////////////////////
			
			
			
			
	     
		     
		     reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.clickbeneficiarybutton));
		     
		}
		
	@Test(priority=4,retryAnalyzer = RetryAnalyzer.class)
		
		

		public void clicknewbeneficiarybutton() throws InterruptedException, AWTException, IOException {
		
		     
		
		
		
		     Thread.sleep(5000);
		     
		     startTest("click new beneficiary button");
		 //     test = extendreport.createTest("clicknewbeneficiary");
		     
		     reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.clicknewbeneficiarybutton));
		     
		     
		    			
				
				
				
				
	}		
				
			//////////applescript for uploading files	
				
	
		     
		    
		 	@Test(priority=5,retryAnalyzer = RetryAnalyzer.class)
			
			

			public void uploadimage() throws InterruptedException, AWTException, IOException {  
		 		
		 		
		 		startTest("upload image");
		     
		     
			 //  test = extendreport.createTest("uploadimage");

		     reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.uploadimage));
		     
		 
		     
		     String filePath = "/Users/apple/Downloads/5.jpeg";

		  // Use the external utility class to upload the file
		     
		     
		     Thread.sleep(5000);
		     
		     
		     fileuploadusingapplescript.uploadFile(filePath);
		
		 	}
		 	
		 	
		 	@Test(priority=6,retryAnalyzer = RetryAnalyzer.class)
			
			

			public void addname() throws InterruptedException, AWTException, IOException {  
		 		
		 		
		 		
		 		startTest("addname");
		 		
		 //		 test = extendreport.createTest("addname");
		     
		     reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.beneficiaryname), name);
		     
		     
		     
		     
		     System.out.println(name);
		     
		 	}
		 	
		 	
		 	@Test(priority=7,retryAnalyzer = RetryAnalyzer.class)
			
			

			public void addmobilenumber() throws InterruptedException, AWTException, IOException { 
		 		
		 		startTest("addmobilenumber");
		     
		  
		     reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.beneficiarymobilenumber), mobile);
		     
		     
		     System.out.println(mobile);
		 	}
		 	
		 	
		 	@Test(priority=8,retryAnalyzer = RetryAnalyzer.class)
			
			

			public void addemail() throws InterruptedException, AWTException, IOException {
		 		
		 		
		 		startTest("addemail");
	
		     
		     reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.beneficiaryemail), "amns@gmail.com");
		     

		 	}
//		     
//		   
//		     
//		    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
//		     
//		     
//		 	@Test(priority=8,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//				public void adddate() throws InterruptedException, AWTException, IOException { 
//		 		
//		 		
//		 		startTest("adddate");
//		     
//		     WebElement ninee= wait_helper.getVisibleElement(By.xpath((subclassforxpath.beneficiarydate)));
//			 	
//		     ninee.click();
//		     
//		     
//
//		     
//	 
//
//	       /////////////date////////////
//	       
//
//	       
//	       
//	       
//	       String sksks=datee.getFormattedDateeByYearss(-20, "dd/MM/yyyy");
//	       
//	       
//	       
//	       
//	
//
//	       
//	        ninee.sendKeys(sksks);
//	       
//		 	}
//	       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//	        
//	        
//	      
//		    
//		    
//		 	@Test(priority=9,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//				public void addnationalid() throws InterruptedException, AWTException, IOException { 
//		 		
//		 		
//		 		startTest("addnationalid");
//		 
//		     
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiarynationalid), "8760987678");
//		     
//		 	}
//		 	
//		 	
//		 	@Test(priority=10,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//				public void addservicetype() throws InterruptedException, AWTException, IOException { 
//		 		
//		 		
//		 		startTest("addservicetype");
//		 	
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryservicetype));
//		    
//		 	}
//		 	
//		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
//		 	@Test(priority=11,retryAnalyzer = RetryAnalyzer.class)
////			
////			
////
//		    public void addservicetypevalues() throws InterruptedException, AWTException, IOException { 
////		
////		    
//		     Thread.sleep(4000);
////		     
////		     
//		     startTest("addservicetypevalues");
////
////		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryservicetypevalues));
////		     
////		     
////
//	 	}
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
			 	
//		 	@Test(priority=12,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryregion() throws InterruptedException, AWTException, IOException {
//		 		
//		 		
//		 		startTest("addbeneficiarryregion");
//		   
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryregion));
//		     
//		 	}
//		     
//		     
//	       @Test(priority=13,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryregionvalues() throws InterruptedException, AWTException, IOException {
//	    	   
//	    	   startTest("addbeneficiaryregionvalues");
//	    	   
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryregiontypevalues));
//		     
//	       } 
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
////	       
////	       @Test(priority=14,retryAnalyzer = RetryAnalyzer.class)
////			
////			
////
////		    public void addbeneficiarynationalid() throws InterruptedException, AWTException, IOException {
////	    	   
////	    	 
////	    	   startTest("addbeneficiarynationalid");
////		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiarynationalid), "8760987678");
////	     
////	       }
//	       
//	       
//	       @Test(priority=14,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryaddress() throws InterruptedException, AWTException, IOException {
//	    	   
//	    	   startTest("addbeneficiaryaddress");
//	    	 
//		     
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryaddress), "address");
//	       }
//	       
//	       @Test(priority=15,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiarygender() throws InterruptedException, AWTException, IOException {
//	    	   
//	    	   
//	    	   startTest("addbeneficiarygender");
//		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarygender));
//		     
//		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarygendervalues));
//	       } 
//		 
//	       @Test(priority=16,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryheightvalue() throws InterruptedException, AWTException, IOException 
//	       { 
//	    	   
//	    	   startTest("addbeneficiaryheightvalue");
//	    	   
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryheightvalue), "75");
//		     
//	       }  
//	       
//	       
//	       @Test(priority=17,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryweightvalue() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiaryweightvalue");
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryweightvalue), "75");
//		     
//	       } 
//		     
//		    
//	       @Test(priority=18,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiarycaregivervalue() throws InterruptedException, AWTException, IOException 
//	       {  
//	    	   
//	    	   startTest("addbeneficiarycaregivervalue");
//	    	   
//	    	   
//		     reusablekeyboardactions.selectDropdownValue(
//		    		    By.xpath(subclassforxpath.beneficiarycaregiverdropdown),
//		    		    By.xpath(subclassforxpath.caregiverValue)
//		    		);
//		     
//		     
//	       }
//		     
//		     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//		     
//	       @Test(priority=19,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryfromdate() throws InterruptedException, AWTException, IOException 
//	       { 
//	    	   
//	    	   startTest("addbeneficiaryfromdate");
//	    	   
//		     WebElement tenn= wait_helper.getVisibleElement(By.xpath((subclassforxpath.beneficiaryfromdate)));
//			 	
//		     tenn.click();
//		     
//		     String currentMonthDate =dat.getFormattedDateCurrentMonth("dd/MM/yyyy");
//		  
//		     tenn.sendKeys(currentMonthDate);
//		     
//	       }
//		    
//	       
//	       
//	       
//	       
//	       
//	       
//	       
//	       @Test(priority=20,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiarytodate() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiarytodate");
//		     WebElement elevenn= wait_helper.getVisibleElement(By.xpath((subclassforxpath.beneficiarytodate)));
//			 	
//		     elevenn.click();
//		     
//		     
//		    
//		     
//		     String nextMonthDate =dat.getFormattedDateNextMonth("dd/MM/yyyy");
//			  
//		     elevenn.sendKeys(nextMonthDate);
//		     
//	       } 
//		     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		     
//		     
//	       @Test(priority=21,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryfromtime() throws InterruptedException, AWTException, IOException 
//	       {  
//	    	   startTest("addbeneficiaryfromtime");
//		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryfromtime));
//	         
//		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryselectfromtime));
//		     
//	       }  
//	       
//	       @Test(priority=22,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiarytotime() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiarytotime");
//	    	   
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarytotime));
//		     
//		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiaryselecttotime));
//		     
//		     
//	       } 
//		     
//	       @Test(priority=23,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryemergencyname() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiaryemergencyname");
//	    	   
//		     
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryemergencyname), "test");
//		     
//	
//	       } 
//	       
//	       
//	       @Test(priority=24,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryemergencynumber() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiaryemergencynumber");
//		     
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryemergencynumber), mobile);
//		     
//	       }
//	       
//	       
//	       @Test(priority=25,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryattachmenttitle() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiaryattachmenttitle");
//		     
//		     reusablekeyboardactions.enterText(By.xpath(subclassforxpath.beneficiaryattachmenttitle), "test");
//		     
//		     
//	
//	       }  
//		     
//     
//		     
///////uploadfile/////
//	       
//	       
//	       @Test(priority=26,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiaryattachmentchoosefile() throws InterruptedException, AWTException, IOException 
//	       {
//	    	   
//	    	   startTest("addbeneficiaryattachmentchoosefile");  
//		     
//		     
//		     reusablekeyboardactions.uploadFile(By.xpath(subclassforxpath.beneficiaryattachmentchoosefile), "/Users/apple/Downloads/5.jpeg");
//		     
//	        
//		  
/////////////////////		
//	       }
//		     
//	       
//	       
//	       @Test(priority=27,retryAnalyzer = RetryAnalyzer.class)
//			
//			
//
//		    public void addbeneficiarysubmit() throws Exception 
//		    
//		    
//	       {
//	    	   
//	    	   startTest("addbeneficiarysubmit"); 
//	    	   
//	    	   
//	    	
//	    	   
//	    	   
//	    	   
//	    	   reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.beneficiarysubmit)); 
//	    	   
//	    	   
//
//	    	   
//	    	   Thread.sleep(5000);
//		     
//		     reusablekeyboardactions.clickElement(By.xpath(subclassforxpath.newbeneficiaryok)); 
//		
//
//		             
//		     
//		}
	       
	       

	       
	       
	       }       
     
	       



