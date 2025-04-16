package screenshot;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class screenshotutil 

{
	
	
	
	
	public static void captureScreenshot(WebDriver driver, String testName) {
		
		
		
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
       
        
        String screenshotPath = "/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images" +  "/" + testName + "_" + timestamp + ".png";
        
        
     

        
        
        
       try {
            FileUtils.copyFile(srcFile, new File(screenshotPath));
            System.out.println("Screenshot saved at: " + screenshotPath);
        } catch (IOException e) 
        {
        	
          e.printStackTrace();
        }
    }
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
//	  public static void captureScreenshotWithHighlight(WebDriver driver, WebElement element, String testName) 
//	  {
//		  
//	        try {
//	            // Capture the screenshot
//	            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	            
//	            BufferedImage img = ImageIO.read(srcFile);
//	            
//	            
//	            
//	            
//	            
//	            
//
//	            // Get element's location and size
//	            
//	            
//	            Point point = element.getLocation();
//	            Dimension size = element.getSize();
//
//	            // Highlight the element
//	            Graphics2D g2d = img.createGraphics();
//	            g2d.setColor(Color.RED);
//	            g2d.setStroke(new BasicStroke(3));
//	            g2d.drawRect(point.getX(), point.getY(), size.getWidth(), size.getHeight());
//	            g2d.dispose();
//
//	            // Save the screenshot with annotation
//	            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
//	            String screenshotPath =  "/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images" +  "/" + testName + "_" + timestamp + ".png";
//	            ImageIO.write(img, "png", new File(screenshotPath));
//
//	            System.out.println("Screenshot with highlight saved at: " + screenshotPath);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	
//	
//	
//	
//
//}


