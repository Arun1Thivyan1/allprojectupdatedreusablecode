package care_sa_admin_portal;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class home_page 
{
	public  WebDriver driver;
	
	public  WebDriverWait wait;
	
	
    private static final Logger logger = LogManager.getLogger(home_page.class);


	
	 @BeforeClass
		public void launchbrowser() throws InterruptedException {
			
			
	
			
			
			
			System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/tabseer_bug_videos/chromedriver-mac-x64/chromedriver");
			
			
			
			
			
			
			
			
			

			
			
//			WebDriverManager.chromedriver().setup();
			
			
			
			
			
			
			
			
			
			
			ChromeOptions options=new ChromeOptions();
			

			
			options.addArguments("--incognito");
			
			driver= new ChromeDriver(options);
			
		      logger.info("Browser launched successfully");
			
			driver.manage().window().maximize();
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(25));
			
			
		

			driver.get("https://rightcare.annztech.com/#/login");
			
			logger.info("Navigated to example.com");
		
			
			

}
	 
	  @AfterClass
		
		
			public void hghg() {
				
		  
		//  driver.quit();
				
			}
	  
	       public WebElement getVisibleElement(By locator) {
		   
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        
	   }
	  
	  
	 
	  
	   

	}


