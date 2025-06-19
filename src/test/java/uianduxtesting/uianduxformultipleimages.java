package uianduxtesting;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import java.awt.Color;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import anfas.dateclass_for_month;
import anfas.datee_class;
import anfas.mobilenumberreusable;
import anfas.namereusable;
import anfas.reusablekeyboardactions;
import anfas.subclassforxpath;
import anfas.wait_helper;
import anfas_main_classes_for_all_modules.base_class;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.Coords;
import ru.yandex.qatools.ashot.coordinates.CoordsProvider;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.cropper.indent.IndentCropper;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.coordinates.Coords;
import ru.yandex.qatools.ashot.cropper.ImageCropper;

import ru.yandex.qatools.ashot.cropper.indent.IndentCropper;

public class uianduxformultipleimages extends base_class
{
	
	


		



			
			String mobile= mobilenumberreusable.generateRandomMobileNumber();
			
			String name=namereusable.generateDynamicName();
			
			datee_class datee = new datee_class();/////date for years
			
			dateclass_for_month dat= new dateclass_for_month();////date for month
			
			

			

			
			
			
			 private static final Logger logger = LogManager.getLogger(uianduxformultipleimages.class);
			 

			 
			 
				@Test(priority=1)
				
				

				public void pmvsbeneficiarypagecheck() throws InterruptedException, AWTException, IOException 
				{
					

					
					
					
					
					
					
					 
					 
					 
						reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.email_path), "survey@gmail.com");
						
						
						reusablekeyboardactions.enterText(driver.get(),By.xpath(subclassforxpath.Password_path), "surveyD2025");
						
						
						
			            Thread.sleep(5000);
			            
			            
			            
			            reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.submit_button));
			            
			            Thread.sleep(25000);
						
						
			            
			            startTest("pmvsbeneficiarypagecheck");
						
						
				
						
						///////////////////////////////////////////////////////////
					

						
						
						WebElement three = wait_helper.getVisibleElement(By.xpath((subclassforxpath.sidemenu_button)));
						
					
						
						getJs().executeScript("arguments[0].click();", three );
						
						
						
						Thread.sleep(8000);
						
						//
						
						reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.clickpmbutton));
						
						//
						
						Thread.sleep(20000);
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					  // Take screenshot of project manager Page
						
						
					
					    
					    Screenshot projectmanager = new AShot().takeScreenshot(driver.get());
					   
				    
					    
					    
					    
					    //
					    
					    String projectmanagerActualPath = "/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images/pm_actual.png";
					    
					    
					    //
					    
					    
					    ImageIO.write(projectmanager.getImage(), "PNG", new File(projectmanagerActualPath));
					    
					    
					    
					    
					   // Compare with expected beneficary Page
					    
					    compare_images comparer = new compare_images();
					    
					   
					    
					    
					    
					  //  
					    
					
					  
					  BufferedImage expectedImage = ImageIO.read(new File("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/expected_image_folder/beneficiary_page.png"));
					  
					 // 
					  
					  // Get diff image path if any
					    String diffImagePath = 
					    comparer.compareImages(expectedImage, projectmanager.getImage(), "pmvsbeneficiarypagecheckimage");
					    
					    
					    if (diffImagePath != null) {
					        String base64Image = screenshotutil.convertImageToBase64(diffImagePath);
					
					        		
					        getExtentTest().fail("Visual difference detected. See screenshot below.", 		
					        		
					            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());
					    }
					    else
					    {
					    	 getExtentTest().pass("Visual match confirmed. No difference detected.");
					    }
					
			        
				
				}
				
				
				
				
//				@Test(priority=2)
//				
//				
//
//				public void chvsbeneficiarypagecheck() throws InterruptedException, AWTException, IOException 
//				{
//				
//					
//					
//					
//					 startTest("chvsbeneficiarypagecheck");
//					 
//					 
//					 Thread.sleep(8000);
//					
//					reusablekeyboardactions.clickElement(driver.get(),By.xpath(subclassforxpath.clickchbutton));	
//					
//					
//					
//					Thread.sleep(20000);
//					
//					
//					
//				    
//				    Screenshot committehead = new AShot().takeScreenshot(driver.get());
//				    
//				    //
//				    String committeeheadActualPath = "/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images/ch_actual.png";
//				    ImageIO.write(committehead.getImage(), "PNG", new File(committeeheadActualPath));
//					
//					
//				    
//				    
//				    
//				    
//				   // Compare with expected beneficary Page
//				    
//				    compare_images comparer = new compare_images();
//				    
//	
//				    BufferedImage expectedImage = ImageIO.read(new File("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/expected_image_folder/beneficiary_page.png"));
//				    
//				    
//				    
//				    
//					  // Get diff image path if any
//				    String diffImagePath1 = 
//				    comparer.compareImages(expectedImage, committehead.getImage(), "chvsbeneficiarypagecheck");
//				    
//				    if (diffImagePath1 != null)
//				    {
//				    	
//				        String base64Image = screenshotutil.convertImageToBase64(diffImagePath1);
//				        getExtentTest().fail("Visual difference detected. See screenshot below.",
//				            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());
//				        
//				        
//				        System.out.println("mic check");
//				    } else {
//				    	 getExtentTest().pass("Visual match confirmed. No difference detected.");
//				    }
//				
//					
//					
//				
//				}
				
				
				
	
				
				
				
				
				

}
