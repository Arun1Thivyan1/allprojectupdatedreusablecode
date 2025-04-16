package organisation_performance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class flow1 extends dashboard 
{
	
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		
		
		driver.findElement(By.id("email")).sendKeys("annz@icms.live");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		
		
		
		
		
		
		
		WebElement ele1=driver.findElement(By.xpath("(//div[@class='mb-4']//child::input)[2]"));
		ele1.click();
		ele1.sendKeys("Survey@123");
		
		
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		
		
		Thread.sleep(15000);
		
		
	
		
		
		driver.findElement(By.xpath("//*[@class='fa fa-fw fa-bars']")).click();
		
		
		
		
		
		
	}
	
	@Test (priority=2)
	
	public void organizationperformancenewpillar() {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		
		driver.findElement(By.xpath(" //*[text()=' Organization Performance']")).click();
		
		
		driver.findElement(By.xpath(" //*[text()='Strategic Pillars']']")).click();
		
		
		driver.findElement(By.xpath(" //*[text()=' Create Pillar ']")).click();

		
		WebElement startegicpillarname= driver.findElement(By.xpath(" //*[text()='Strategic Pillar ']//following-sibling::input"));
		
		startegicpillarname.click();
		
		/////////////////
		
		startegicpillarname.sendKeys("");
		
		/////////////////
		
		
		
        WebElement startegicpillarnamearabic= driver.findElement(By.xpath(" //*[text()='Strategic Pillar (Arabic) ']//following-sibling::input"));
		
        startegicpillarnamearabic.click();
		
	
		
		/////////////////
		
        startegicpillarnamearabic.sendKeys("");
		
		/////////////////
        
        
        
        
        driver.findElement(By.xpath(" //*[@value='Submit']")).click();
		
		
	}
	
	
    @Test (priority=3)
	
	public void organizationperformancenewobjective() {
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	
	
	
	
	

	
	
	
	
}
		
		
		
		
	
	
	
	

}
