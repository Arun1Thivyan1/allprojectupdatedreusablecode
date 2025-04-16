package anfas;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import care_sa_admin_portal.home_page;

public class base_class 
{
	
	
	
	
//public  WebDriver driver;
	
	
	public static WebDriver driver;
	
	
	public static WebDriverWait wait;
	
	
	//public  WebDriverWait wait;
	
	
    private static final Logger logger = LogManager.getLogger(home_page.class);


	
	 @BeforeClass
		public void launchbrowser() throws InterruptedException {
			
			
	
			
			
			
			System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/tabseer_bug_videos/chromedriver-mac-x64/chromedriver");
			
			
			
			
			
			
			
			
			

			
			
//			WebDriverManager.chromedriver().setup();
			
			
			
			
			
			
			
			
			
			
			ChromeOptions options=new ChromeOptions();
			

			
			options.addArguments("--incognito");
			
			options.addArguments("--no-sandbox"); // Disable Chrome security sandbox
			options.addArguments("--disable-setuid-sandbox");
			options.addArguments("--disable-blink-features=AutomationControlled");
			options.addArguments("--disable-web-security");
			options.addArguments("--allow-file-access-from-files");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-infobars");
			options.addArguments("--remote-allow-origins=*");
			
			
			
			
			
			
			
			
			
			driver= new ChromeDriver(options);
			
		      logger.info("Browser launched successfully");
			
			driver.manage().window().maximize();
			
			
			
			
			
			
			
			
			
			////////////////
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(75));
			
			
			
			
			
			
			//////////////////
		

			driver.get("https://demo.annztech.com/#/account/login");
			
			logger.info("Navigated to example.com");
		
			
			

}
	 
	  @AfterClass
		
		
			public void hghg() {
				
		  
		//driver.quit();
				
			}
	  

	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  
//	  public static WebElement getVisibleElement(By locator) {
//	        return new WebDriverWait(driver, Duration.ofSeconds(75)).until(ExpectedConditions.visibilityOfElementLocated(locator));
//	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	 
	  

}
