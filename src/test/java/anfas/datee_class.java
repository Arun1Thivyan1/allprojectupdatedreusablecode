package anfas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datee_class 
{
	
	
//	public String getFormattedDatee(int daysToSubtract, String dateFormat) 
//	{
//		
//        Date currentDate = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(currentDate);
//        calendar.add(Calendar.DAY_OF_MONTH, 0);
//        
//        
//        
//        
//        Date targetDate = calendar.getTime();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
//        return simpleDateFormat.format(targetDate);
//        
//        
//
//}
	
	
	
	 public String getFormattedDateeByYearss(int yearsToSubtract, String dateFormat) {
	        Date currentDate = new Date(); // Today's date
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(currentDate); // Set calendar to today's date
	        calendar.add(Calendar.YEAR, yearsToSubtract); // Subtract years (pass -20 for 20 years back)

	        Date targetDate = calendar.getTime();
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
	        return simpleDateFormat.format(targetDate); // Return formatted date
	    }

}
