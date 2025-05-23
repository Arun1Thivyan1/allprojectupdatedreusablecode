package screenshot;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

public class screenshotutil 

{
	
	
	
	

    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
    
 // Method to capture screenshot and return as Base64
    public static String captureScreenshot(WebDriver driver, String testName) {
        try 
        {
        	
        	
        	driver.manage().window().maximize();
            // Scroll to the bottom to ensure visibility of elements
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            
            Thread.sleep(5000);
            // Optional: Hide fixed headers/footers to avoid border issues
            
            js.executeScript("document.querySelectorAll('header, footer, .fixed-element').forEach(e => e.style.display = 'none');");

            
            // Capture screenshot as Base64
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
  
    
    
}
    
    
    
    
    
    

	

    
    
    
    
    
    
    
    

	
	

	
	

	
	
	
	
	
	
	
	
	
	


