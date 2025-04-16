package organisation_performance;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class dashboard
{
	public static WebDriver driver;

	   
	   
	   

		
		
	    @BeforeTest
		public void launchbrowser() throws InterruptedException {
			
			
				
           
	    	
			
			
			System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/tabseer_bug_videos/chromedriver-mac-x64/chromedriver");
			
			//System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/tabseer_bug_videos/chromedriver-mac-x64/2/chromedriver");
			
			
			
			ChromeOptions options=new ChromeOptions();
			

			
			options.addArguments("--incognito");
			
			driver= new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			//driver.manage().window().fullscreen();
			
			// driver.manage().window().setSize(new Dimension(1920, 1080));
			
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			

			driver.get("https://icmspro.live/#/account/login?returnUrl=%2Fcharts%2Fdashboard");
			
		

}
	    
	    @AfterTest
		
		
		public void hghg() {
			
			
		}
}