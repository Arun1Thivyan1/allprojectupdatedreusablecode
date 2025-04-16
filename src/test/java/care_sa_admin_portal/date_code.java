package care_sa_admin_portal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class date_code 


{

	
	
	public String getFormattedDate(int daysToSubtract, String dateFormat) 
	{
		
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
       // calendar.setTime(currentDate);
      //  calendar.add(Calendar.DAY_OF_MONTH, 0);
        
        
        
        
        Date targetDate = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        return simpleDateFormat.format(targetDate);
        
        

}
	
	
	
	
	
}