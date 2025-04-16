package care_sa_admin_portal;

import java.text.SimpleDateFormat;


import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import retry_code.RetryAnalyzer;



//@Listeners(screenshot.TestListener.class)
public class appointment_management extends home_page
{
	
	
	 private static final Logger logger = LogManager.getLogger(appointment_management.class);	

	
	

	
	
	@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void login() throws InterruptedException {
		
		
		
		
		
		
		
		
		try {
		
		WebElement	 one = getVisibleElement(By.xpath((xpath.one)));
         one.click();
		
		
      
        

        
        
        
        
	    
	    

		
		
		
		one.sendKeys("523456781");
		
	
		WebElement two = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m_f2d85dd2 mantine-PasswordInput-innerInput']")));
		
		
		two.click();
		
		
		two.sendKeys("Password@123456");
		
		driver.findElement(By.xpath("//*[text()='Logi']")).click();
		
		
	    }catch(Exception e) {
		

			driver.findElement(By.xpath("//*[text()='Login']")).click();

		logger.error("Test failed:" ,e);
		
		
	}
	
	}
	@Test(priority=2, dependsOnMethods = {"login"},retryAnalyzer = RetryAnalyzer.class)
	public void addappointment() throws InterruptedException {
	
		
	WebElement three = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Appointment Management']")));
		
	three.click();
			
	 WebElement four = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Add Appointment']")));
				
		four.click();
	
		
	}
	
	
	@Test(priority=3, dependsOnMethods = {"addappointment"},retryAnalyzer = RetryAnalyzer.class)
	public void existinguserflow() throws InterruptedException {
		
		

		
		 WebElement five = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m_8fb7ebe7 mantine-Input-input mantine-NumberInput-input']")));
			
	     five.click();
	     
	     five.sendKeys("5");
	     
	     
	     driver.findElement(By.xpath("//*[text()='Search']")).click();
	     
	     
	     WebElement six = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='mohammed rizwan']//parent::tr//descendant::span[text()='Select']")));
			
	     six.click();
	     
	     
	     /////////service type///////////
	     
	     WebElement seven = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Service Type']//following-sibling::div")));
			
	     seven.click();
	     
	     
	     driver.findElement(By.xpath("//*[text()='Teleconsultation services']")).click();
	     
	     
	    /////////////////////////////// 
		//////specialization///////////
	    ///////////////////////////////
	     
	     WebElement eight = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Specializations']//following-sibling::div[@class='m_6c018570 mantine-Input-wrapper mantine-Select-wrapper']")));
			
	
	    JavascriptExecutor js=(JavascriptExecutor) driver;	
 
	    
	    //js.executeScript("arguments[0].scrollIntoView(true);", eight);
	     
		//js.executeScript("arguments[0].click();",eight);	
		
		
		
		eight.click();
	     
		
	     WebElement nine = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Orthopedics']")));

         nine.click();	     
	     
	     //////date/////
	     
	     WebElement ten = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Service date']//following-sibling::div//child::input")));
			
	     ten.click();
	    
	    
	    
	   
	     
//           Date currentDate = new Date();
//	       Calendar calendar = Calendar.getInstance();
//	       calendar.setTime(currentDate);
//	       calendar.add(Calendar.DAY_OF_MONTH, 1);
//	        
//	       Date previousDate4 = calendar.getTime();
//	        
//	       SimpleDateFormat dateFormat4 = new SimpleDateFormat("dd-MMMM-yyyy");
//	        
//	       String previousDateString4 = dateFormat4.format(previousDate4);
//	       System.out.println(previousDateString4);
//	       
//	       
//	       
//	       Thread.sleep(3000);
//	       
//          ten.sendKeys(previousDateString4); 
	     
	     
	     
//	     date_code date= new date_code();
//	     
//	     home_page homePage = new home_page();
//	     String previousDateString = homePage.getFormattedDate(1, "dd-MMMM-yyyy");
//	     ten.sendKeys(previousDateString);
	     
	  
	     
	     
	     
	     
	     
	     
	     
      date_code date= new date_code();
      
      String previousDateString =date.getFormattedDate(0, "dd-MMMM-yyyy");
      
      
      
      
      
      
      
      
      
      
       System.out.println(previousDateString);

      
      ten.sendKeys(previousDateString);
	     
	 
          
      
      Thread.sleep(3000);
          
          
	          
	          
          
          //////notes/////
          
	    

          
          WebElement eleven = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Notes']//following-sibling::div//child::textarea")));
			
 	     eleven.click();
 	     
 	     eleven.sendKeys("abc");
 	     
 	     
 	     
 	     //caregiver//
 	     
          
 	    WebElement twelve = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='caregiver']//following-sibling::div")));
		
	    twelve.click(); 
	    
	     driver.findElement(By.xpath("//*[text()='abiles paul']")).click();
	     
	     
	     
	     //slot details//
	     
	     
	     
	     
	 	    WebElement fourteen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Slot details']//following-sibling::div")));
			
		    fourteen.click(); 
		    
		    
           WebElement fifteen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='7:30 PM - 7:40 PM']")));
			
		    fifteen.click(); 
    

          
	    //collected amount//
	     
	     
	 	WebElement thirteen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Collected Amount']//following-sibling::div//child::textarea")));
			
		thirteen.click();  
		
		thirteen.sendKeys("23");
	    
		
		
		//book appointment
		
		
		   driver.findElement(By.xpath("//*[text()='Book Appointment']")).click();

		   
		   
		   
	       
	       
	
	}
	

}
