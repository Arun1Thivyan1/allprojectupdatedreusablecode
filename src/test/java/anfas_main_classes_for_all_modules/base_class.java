package anfas_main_classes_for_all_modules;

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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import anfas.delete_old_screenshotimage_and_extend_report;
import anfas.extendreport;
import anfas.reusablekeyboardactions;
import anfas.send_email_to_the_team_for_extend_report;
import anfas.subclassforxpath;
import anfas.wait_helper;
import care_sa_admin_portal.home_page;
import file_upload_directly_to_attachments.ZohoUploader;
import uianduxtesting.clean_the_images_in_the_folder;





public class base_class 
{

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

    private static ExtentReports extent;
    private static final Logger logger = LogManager.getLogger(home_page.class);

    protected clean_the_images_in_the_folder cleaner = new clean_the_images_in_the_folder();
    
    
    
    
    
    

    public JavascriptExecutor getJs() 
    {
        return (JavascriptExecutor) driver.get();
    }

    protected void startTest(String testName) 
    {
        extentTest.set(extent.createTest(testName));
    }

    public static ExtentTest getExtentTest() 
    {
        return extentTest.get();
    }

    // ---------------- SUITE LEVEL ------------------

    
    
    
    
    
    
    
    @BeforeSuite
    public void setupExtentReport()
    {
        extent = extendreport.getExtentReports();
        extent.setSystemInfo("Tester", "ARUN THIVYAN");
        logger.info("ExtentReport initialized once for the suite.");
    }
    
    
    
    

    @AfterSuite
    public void tearDownExtentReport() {
        try {
            if (extent != null) {
                extent.flush();
                logger.info("Extent report flushed.");
                send_email_to_the_team_for_extend_report.sendEmailWithReport();
                logger.info("Report sent to the team.");
                
                
                // Call ZohoUploader to upload the Extent report file to Zoho
                ZohoUploader.uploadExtentReport();
                logger.info("Extent report uploaded to Zoho.");
                
                
                
                
                
            }
        } catch (Exception e) {
            logger.error("Failed to send the email report: " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    

    // ---------------- CLASS LEVEL ------------------

    @BeforeClass
    public void launchbrowser() throws InterruptedException 
    {
        // Clean screenshots and diff images
        cleaner.cleanDirectory("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/difference_images");
        
        cleaner.cleanDirectory("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images");
        
        delete_old_screenshotimage_and_extend_report.deleteFilesInFolder("/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/screenshot_images");
        
        delete_old_screenshotimage_and_extend_report.deleteFilesInFolder("test-output");

        System.setProperty("file.encoding", "UTF-8");

        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver-mac-x64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver.set(new ChromeDriver(options));
        driver.get().manage().window().maximize();
        driver.get().get("https://demo.annztech.com/#/account/login");

        wait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(75)));

        logger.info("Browser launched and navigated successfully.");
    }

    
    
    
    
    
    
    
    
    
    
    @AfterClass
    public void teardown() 
    {
        if (driver.get() != null) {
            driver.get().quit();
            logger.info("Browser closed.");
        }
    }
}
