package anfas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class reusablekeyboardactions 
{
//    public static void clickElement(By locator) {
//        WebElement element = base_class.getVisibleElement(locator);
//        element.click();
//    }
    
    
    
    
    
    
    
    
    public static void clickElement(By locator) {
        WebElement element = wait_helper.getVisibleElement(locator);
        element.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    public static void enterText(By locator, String text) {
//        WebElement element = base_class.getVisibleElement(locator);
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//    }
    
    
    
    
    
    
    
    
    public static void enterText(By locator, String text) {
        WebElement element = wait_helper.getVisibleElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }
    
    
    
    
    
    
    
    
    
    
    

//    public static void uploadFile(By locator, String filePath) {
//        WebElement element = base_class.getVisibleElement(locator);
//        element.sendKeys(filePath);
//    }

    
    
    
    
    
    
    
    
    
    public static void uploadFile(By locator, String filePath) {
        WebElement element = wait_helper.getVisibleElement(locator);
        element.sendKeys(filePath);
    }
    
    
    
    
    
    
    
    
    
//    public static void selectDropdownValue(By dropdownLocator, By valueLocator) throws InterruptedException {
//        clickElement(dropdownLocator);
//        Thread.sleep(2000);
//        clickElement(valueLocator);
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void selectDropdownValue(By dropdownLocator, By valueLocator) throws InterruptedException {
        clickElement(dropdownLocator);
        Thread.sleep(2000);
        clickElement(valueLocator);
    }

}
