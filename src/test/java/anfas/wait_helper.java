package anfas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import anfas_main_classes_for_all_modules.base_class;

public class wait_helper 
{
	
	
	  public static WebElement getVisibleElement(By locator) {
		    return base_class.wait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

}
