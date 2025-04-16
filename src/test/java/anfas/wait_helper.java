package anfas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class wait_helper 
{
	
	
	  public static WebElement getVisibleElement(By locator) {
		    return base_class.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

}
